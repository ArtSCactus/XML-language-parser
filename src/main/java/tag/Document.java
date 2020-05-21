package tag;

import java.util.List;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public interface Document extends Variable{
    String getName();
    List<Tag> getChildes();
    void addChild(Tag tag);
    Tag getTag(String name);
}
