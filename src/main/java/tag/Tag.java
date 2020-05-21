package tag;

import java.util.List;
import java.util.Map;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public interface Tag  extends Variable{
    TagType getType();
    String getName();
    String getValue();
    Map<String, String> getAttributes();
    List<Tag> getChildes();
}
