package builder;

import interpreter.VariablesStorage;
import tag.Attribute;
import tag.Document;
import tag.Tag;

import javax.print.Doc;
import java.util.Map;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class MainConstructor {
    private StringBuilder code;
    private int recursionNesting;

    public MainConstructor(StringBuilder code) {
        this.code = code;
    }

    public MainConstructor() {
        code = new StringBuilder();
        // imports
        code.append("import org.w3c.dom.Document;\n" +
                "import org.w3c.dom.Element;\n" +
                "import tag.ComplexTag;\n" +
                "import tag.Tag;\n" +
                "import tag.SimpleTag;\n" +
                "\n" +
                "import javax.xml.parsers.DocumentBuilder;\n" +
                "import javax.xml.parsers.DocumentBuilderFactory;\n" +
                "import javax.xml.parsers.ParserConfigurationException;\n" +
                "import javax.xml.transform.Transformer;\n" +
                "import javax.xml.transform.TransformerException;\n" +
                "import javax.xml.transform.TransformerFactory;\n" +
                "import javax.xml.transform.dom.DOMSource;\n" +
                "import javax.xml.transform.stream.StreamResult;\n" +
                "import java.io.File;\n" +
                "import java.util.List;\n");
                // Class declaration
        code.append("public class Main {\n" +
                "public static void main(String[] args) throws ParserConfigurationException, TransformerException{\n" +
                "");
        // Document factories
        code.append( "        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();\n" +
                "        DocumentBuilder dBuilder = factory.newDocumentBuilder();\n" +
                "        Document document = dBuilder.newDocument();\n");
    }

    public String getAppendMethodCode(){
        return "private ";
    }

    public String getCode() {
        return code.toString();
    }

    public void setCode(StringBuilder code) {
        this.code = code;
    }

    public void transformDocumentToJavaCode(Document document){
        StringBuilder builder = new StringBuilder();
        for (Tag tag : document.getChildes()){
            builder.append(transformTagToJavaCode(tag));
        }
         code.append(builder.toString());
        appendFileTransformer();
        code.append("}\n}\n");
    }

    public String transformTagToJavaCode(Tag tag){
        String variableName = tag.getName()+tag.hashCode();
        variableName = variableName.replaceAll("[@-]*","");
        StringBuilder code = new StringBuilder("{\nElement " + variableName + " = document.createElement(\"" + tag.getName() + "\");\n");
        for (Map.Entry<String, String> entry : tag.getAttributes().entrySet()){
            code.append(variableName+".setAttribute(\""+entry.getKey()+"\" , \""+entry.getValue()+"\");");
        }
      //  for (Tag child : tag.getChildes()){
            appendChildes(variableName, code, tag);
       // }
        code.append("document.appendChild("+variableName+");\n");
        code.append("}\n");
        return code.toString();
    }

    public void appendChildes(String parentJavaCodeVarName, StringBuilder parentTagVar, Tag tag){
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (Tag child : tag.getChildes()){
            String varname = child.getName()+child.hashCode();
            varname = varname.replaceAll("[@-]*","");
            builder.append("Element "+varname+" = document.createElement(\""+child.getName()+"\");\n");
            for (Map.Entry<String, String> entry : tag.getAttributes().entrySet()){
                builder.append(varname+".setAttribute(\""+entry.getKey()+"\",\""+entry.getValue()+"\");\n");
            }
            for (Tag nestedChild : tag.getChildes()){
                appendChildes(varname, new StringBuilder(varname), nestedChild);
            }
            builder.append(parentJavaCodeVarName+".appendChild("+varname+");\n");
            builder.append("}\n");
        }
        parentTagVar.append(builder.toString());

    }

    private void appendFileTransformer(){
        code.append("TransformerFactory tFactory = TransformerFactory.newInstance();\n" +
                "        Transformer transformer = tFactory.newTransformer();\n" +
                "        DOMSource source = new DOMSource(document);\n" +
                "        File resultFile = new File(\"result.xml\");\n" +
                "        StreamResult result = new StreamResult(resultFile);\n" +
                "        transformer.transform(source, result);");
    }
}
