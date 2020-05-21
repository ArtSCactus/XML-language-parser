package tag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class SimpleTag implements Tag {
private String name;
private String value;
private Map<String, String> attributes;
private  final TagType type;

    public SimpleTag(String name, String value, Map<String, String> attributes) {
        this.name = name;
        this.value = value;
        this.attributes = attributes;
        this.type = TagType.SIMPLE;
    }

    public SimpleTag(String name, String value) {
        this.name = name;
        this.value = value;
        this.attributes = new HashMap<>();
        this.type = TagType.SIMPLE;
    }

    @Override
    public List<Tag> getChildes() {
        return null;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public TagType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addAttribute(String name, String value){
        attributes.put(name, value);
    }

    public String getAttrValue(String name){
        return attributes.get(name);
    }

    public Map<String, String> getAttributes(){
        return attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleTag)) return false;
        SimpleTag simpleTag = (SimpleTag) o;
        return Objects.equals(getName(), simpleTag.getName()) &&
                Objects.equals(getValue(), simpleTag.getValue()) &&
                Objects.equals(getAttributes(), simpleTag.getAttributes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValue(), getAttributes());
    }

    @Override
    public String toString() {
        return "tag.SimpleTag{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
