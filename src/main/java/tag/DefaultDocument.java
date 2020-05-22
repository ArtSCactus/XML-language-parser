package tag;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class DefaultDocument implements Document {
private List<Tag> childes;
private String name;
    public DefaultDocument(String name, List<Tag> childes) {
        this.childes = childes;
        this.name = name;
    }



    public DefaultDocument(String name) {
        this.childes = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Tag> getChildes() {
        return childes;
    }

    @Override
    public void addChild(Tag tag) {
        childes.add(tag);
    }

    @Override
    public Tag getTag(String name) {
        for (Tag tag : childes){
            if (tag.getName().equals(name)){
                return tag;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultDocument)) return false;
        DefaultDocument that = (DefaultDocument) o;
        return Objects.equals(getChildes(), that.getChildes()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChildes(), getName());
    }

    @Override
    public String toString() {
        return "DefaultDocument{" +
                "childes=" + childes +
                ", name='" + name + '\'' +
                '}';
    }
}

