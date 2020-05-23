package interpreter;

import operator.Command;
import operator.Function;
import tag.Attribute;
import tag.Document;
import tag.Tag;
import tag.Variable;

import java.util.Map;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public interface VariablesStorage {
    Document getDocument(String name);
    Tag getTag(String name);
    Attribute getAttribute(String name);
    Variable getVariable(String name);
    Function getFunction(String name);
    Map<String, Tag> getAllTags();
    Map<String, Document> getAllDocuments();
    Map<String, Attribute> getAllAttributes();
    Map<String, Function> getAllFunction();
    void addAllFunctions(Map<String, Function> map);
    void addAllDocuments(Map<String, Document> map);
    void addAllTags(Map<String, Tag> map);
    void addAllAttributes(Map<String, Attribute> map);
    void removeTemporaryTagVariables(Map<String, Tag> temporaryVars);
    void removeTemporaryDocumentVariables(Map<String, Document> temporaryVars);
    void removeTemporaryAttributeVariables(Map<String, Attribute> temporaryVars);
    void addFunction(String name, Function function);
    void addDocument(String name, Document doc);
    void addAttribute(String name, Attribute attribute);
    void addTagVariable(String name, Tag tag);
    void removeDocument(String name);
    void removeFunction(String name);
    void removeAttribute(String name);
    void removeTagVariable(String name);
    void applyCommand(Command cmd);

}
