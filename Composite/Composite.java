public abstract class Composite {
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

  // getParent that cannot be overriden
  public final Composite getParent() {
    return parent;
  }

  // setParent that cannot be overriden
  public final void setParent(Composite parentComposite) {
    parent = parentComposite;
  }

  // template method
  final public Composite add(Composite childComposite) {
    try {
      // primitive op to be overriden by subclasses
      // sometimes called a hook
      doAdd(childComposite);

      // set the childs parent
      childComposite.setParent(this);
    } catch (RuntimeException e) {
      throw e;
    }
    return this;
  }

  // template method
  final public Composite remove(Composite childComposite) {
    try {
      // primitive op to be overriden by subclasses
      // sometimes called a hook
      doRemove(childComposite);

      // adjust the childs parent
      childComposite.setParent(null);
    } catch (RuntimeException e) {
      throw e;
    }
    return this;
  }
  // protected functions to be implemented by subclasses [default given for some]
  protected void doAdd(Composite childComposite) {
    throw new RuntimeException("doAdd() not implemented");
  }

  protected void doRemove(Composite childComposite) {
    throw new RuntimeException("doRemove() not implemented");
  }
  protected Composite getChild(int index) {
    return null;
  }
  protected Iter<Composite> makeIter() {
    Iter<Composite> iter = new NullIter<Composite>();
    return iter;
  }
}
