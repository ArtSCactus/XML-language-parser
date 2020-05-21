package builder;

import interpreter.VariablesStorage;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class MainConstructor {
    private String code;

    public MainConstructor(String code) {
        this.code = code;
    }

    public MainConstructor() {
        code = "        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();\n" +
                "        DocumentBuilder dBuilder = factory.newDocumentBuilder();\n" +
                "        document = dBuilder.newDocument();\n";
    }

    public String getAppendMethodCode(){
        return "private ";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String transformTags(VariablesStorage storage){

        return null;
    }
}
