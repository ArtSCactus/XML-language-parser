package operator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import tag.ComplexTag;
import tag.Tag;
import tag.SimpleTag;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
public class Main {
public static void main(String[] args) throws ParserConfigurationException, TransformerException{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        Document document = dBuilder.newDocument();
{
Element myTagName1135901827 = document.createElement("myTagName");
myTagName1135901827.setAttribute("attrName" , "attrValue");{
Element notMyTagName170411846 = document.createElement("notMyTagName");
notMyTagName170411846.setAttribute("attrName","attrValue");
myTagName1135901827.appendChild(notMyTagName170411846);
}
document.appendChild(myTagName1135901827);
}
TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        File resultFile = new File("result.xml");
        StreamResult result = new StreamResult(resultFile);
        transformer.transform(source, result);}
}
