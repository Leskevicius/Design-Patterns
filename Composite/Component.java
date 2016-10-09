public abstract class Component {
  // private variables
  private Composite parent;

  // abstract functions to be implemented by subclasses
  public abstract String toString();

  // getParent function implementation that cannot be overriden
  public final Composite getParent() {
    return parent;
  }

  // setParent function implementation that cannot be overriden
  public final void setParent(Composite parentComposite) {
    parent = parentComposite;
  }
}
