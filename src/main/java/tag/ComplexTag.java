package tag;

import java.util.*;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class ComplexTag implements Tag {
    private String name;
    private String value;
    private List<Tag> childes;
    private Map<String, String> attributes;
    private final TagType type;

    public ComplexTag(String name, String value, List<Tag> childes, Map<String, String> attributes) {
        this.name = name;
        this.value = value;
        this.childes = childes;
        this.attributes = attributes;
        this.type = TagType.COMPLEX;
    }

    public ComplexTag(String name, String value, Map<String, String> attributes) {
        this.name = name;
        this.value = value;
        this.attributes = attributes;
        this.childes = new ArrayList<>();
        this.type = TagType.COMPLEX;
    }

    public ComplexTag(String name) {
        this.name = name;
        this.value = "";
        this.childes = new ArrayList<>();
        this.attributes = new HashMap<>();
        this.type = TagType.COMPLEX;
    }

    public Map<String, String> getAttributes() {
        return attributes;
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
    @Override
    public List<Tag> getChildes() {
        return childes;
    }

    public void setChildes(List<Tag> childes) {
        this.childes = childes;
    }

    public void addChild(SimpleTag tag) {
        childes.add(tag);
    }

    public void removeChild(SimpleTag tag) {
        childes.remove(tag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexTag)) return false;
        ComplexTag complexTag = (ComplexTag) o;
        return Objects.equals(getName(), complexTag.getName()) &&
                Objects.equals(getValue(), complexTag.getValue()) &&
                Objects.equals(getChildes(), complexTag.getChildes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValue(), getChildes());
    }

    @Override
    public String toString() {
        return "ComplexTag{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", childes=" + childes +
                ", attributes=" + attributes +
                ", type=" + type +
                '}';
    }
}
