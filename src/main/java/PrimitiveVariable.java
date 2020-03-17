import java.util.Objects;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class PrimitiveVariable<T> {
private T value;

    public PrimitiveVariable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimitiveVariable)) return false;
        PrimitiveVariable<?> that = (PrimitiveVariable<?>) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String
    toString() {
        return "NodeVariable{" +
                "value=" + value +
                '}';
    }
}
