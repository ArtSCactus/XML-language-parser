package operator;

import interpreter.VariablesStorage;
import tag.Attribute;
import tag.Document;
import tag.Tag;
import tag.Variable;

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
      Variable parentVar = storage.getVariable(parent);
      Variable childVar = storage.getVariable(child);
      if (parentVar instanceof Document & childVar instanceof Tag){
          ((Document) parentVar).getChildes().add((Tag) childVar);
      } else {
          if (parentVar instanceof Tag & childVar instanceof Tag){
              ((Tag) parentVar).getChildes().add((Tag) childVar);
          }else {
              if (parentVar instanceof Tag & childVar instanceof Attribute) {
                  ((Tag) parentVar).getAttributes().put(((Attribute) childVar).getName(), ((Attribute) childVar).getValue());
              } else {
                  if (parentVar==null | childVar ==null){
                      throw new NullPointerException(parent+" or "+child+" are null.");
                  }
                  throw new VariableCastException("Cannot append " + child + " to " + parent + ". Wrong types.");
              }
          }
      }
    }
}
