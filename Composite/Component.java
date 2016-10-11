public abstract class Component {
  private static int nextID = 0;
  private String instanceID = new Integer(getNextInstanceID()).toString();
  // private variables
  private Composite parent = null;

  private static int getNextInstanceID() {
    return nextID++;
  }

  public String getInstanceID() {
    return instanceID;
  }

  // default implementation ot toString(). Could be overriden in future
  public String toString() {
    return (parent == null) ?
            getInstanceID() + " is the root. " :
            getInstanceID() + " is the child of " + parent;
  }

  // getParent function implementation that cannot be overriden
  public final Composite getParent() {
    return parent;
  }

  // setParent function implementation that cannot be overriden
  public final void setParent(Composite parentComposite) {
    parent = parentComposite;
  }
}
