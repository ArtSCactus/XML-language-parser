package interpreter;

import operator.Command;
import tag.Attribute;
import tag.Document;
import tag.Tag;
import tag.Variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class VariableStorageImpl implements VariablesStorage{
private Map<String, Tag> tagMap;
private Map<String, Attribute> attributeMap;
private Map<String, Document> documentMap;

    public VariableStorageImpl(Map<String, Tag> tagMap) {
        this.tagMap = tagMap;
        this.attributeMap = new HashMap<>();
        this.documentMap = new HashMap<>();
    }

    public VariableStorageImpl() {
        this.tagMap = new HashMap<>();
        this.attributeMap = new HashMap<>();
        this.documentMap = new HashMap<>();
    }

    @Override
    public Document getDocument(String name) {
        return documentMap.get(name);
    }

    @Override
    public Attribute getAttribute(String name) {
        return attributeMap.get(name);
    }

    @Override
    public void addDocument(String name, Document doc) {
        documentMap.put(name, doc);
    }

    @Override
    public void removeDocument(String name) {

    }

    public void addAttribute(String name, Attribute var) {
        attributeMap.put(name, var);
    }

    @Override
    public void removeAttribute(String name) {
        attributeMap.remove(name);
    }

    @Override
    public void addTagVariable(String name, Tag tag) {
        tagMap.put(name, tag);
    }

    @Override
    public void removeTagVariable(String name) {
        tagMap.remove(name);
    }

    @Override
    public Tag getTag(String name) {
        return tagMap.get(name);
    }

    @Override
    public Variable getVariable(String name) {
        Variable var = tagMap.get(name);
        if (var != null){
            return var;
        }
        var = attributeMap.get(name);
        if (var !=null){
            return var;
        }
        var = documentMap.get(name);
        if (var !=null){
            return var;
        }
        return null;
    }

    @Override
    public void applyCommand(Command cmd) {
        cmd.execute(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VariableStorageImpl)) return false;
        VariableStorageImpl that = (VariableStorageImpl) o;
        return Objects.equals(tagMap, that.tagMap) &&
                Objects.equals(attributeMap, that.attributeMap) &&
                Objects.equals(documentMap, that.documentMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagMap, attributeMap, documentMap);
    }

    @Override
    public String toString() {
        return "VariableStorageImpl{" +
                "tagMap=" + tagMap +
                ", attributeMap=" + attributeMap +
                ", documentMap=" + documentMap +
                '}';
    }
}
