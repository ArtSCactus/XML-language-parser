package operator;

import interpreter.VariablesStorage;
import tag.Attribute;
import tag.Tag;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class AppendOperator implements Command {
    private String parent;
    private String child;

    public AppendOperator(String parent, String child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public void execute(VariablesStorage storage) {
      Tag storageTag = storage.getTag(parent);
      Tag storageChildTag = storage.getTag(child);
      if (storageChildTag == null){
          Attribute attr = storage.getAttribute(child);
          storageTag.getAttributes().put(attr.getName(), attr.getValue());
      } else {
          storageTag.getChildes().add(storageChildTag);
          storage.removeTagVariable(storageChildTag.getName());
      }
    }
}
