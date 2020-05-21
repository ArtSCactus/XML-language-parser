package tag;

import java.util.Objects;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class AttributeImpl implements Attribute {
    private String name;
    private String value;

    public AttributeImpl(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttributeImpl)) return false;
        AttributeImpl attribute = (AttributeImpl) o;
        return Objects.equals(getName(), attribute.getName()) &&
                Objects.equals(getValue(), attribute.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValue());
    }

    @Override
    public String toString() {
        return "AttributeImpl{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
