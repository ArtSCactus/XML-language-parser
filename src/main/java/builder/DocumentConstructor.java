package builder;

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

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class DocumentConstructor {
    private Document document;
    private String code;

    public DocumentConstructor() throws ParserConfigurationException {
        init();
    }

    private void init() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        document = dBuilder.newDocument();
    }

    public Element appendTag(SimpleTag tag){
        Element element = document.createElement(tag.getName());
        tag.getAttributes().forEach(element::setAttribute);
        element.setTextContent(tag.getValue());
        document.appendChild(element);
        return element;
    }

    public Element appendTag(Tag tag){
        Element element = document.createElement(tag.getName());
        tag.getAttributes().forEach(element::setAttribute);
        switch(tag.getType()){
            case SIMPLE:
                element.setTextContent(tag.getValue());
                return element;
            case COMPLEX:
                ComplexTag complexTag = (ComplexTag) tag;
                        complexTag.getChildes().forEach(curTag->{

                                    element.appendChild(appendTag(curTag));
                        });
        }
        return element;
    }

    public void buildDocument(List<Tag> tagList) throws TransformerException {
        tagList.forEach(constantTag -> document.appendChild(appendTag(constantTag))); TransformerFactory tFactory =
                TransformerFactory.newInstance();
        Transformer transformer =
                tFactory.newTransformer();

        DOMSource source = new DOMSource(document);
        File resultFile = new File("result.xml");
        StreamResult result = new StreamResult(resultFile);
        transformer.transform(source, result);

    }

}
