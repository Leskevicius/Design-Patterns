public abstract class Composite extends Component {
  // template method
  final public Composite add(Component childComponent) {
    // primitive op to be overriden by subclasses
    // sometimes called a hook
    doAdd(childComponent);

    // set the childs parent
    childComponent.setParent(this);

    return this;
  }

  // template method
  final public Composite remove(Component childComponent) {
    // primitive op to be overriden by subclasses
    // sometimes called a hook
    doRemove(childComponent);

    // adjust the childs parent
    childComponent.setParent(null);

    return this;
  }
  // abstract functions to be implemented by subclasses
  public abstract void doAdd(Component childComponent);
  public abstract void doRemove(Component childComponent);
  public abstract Component getChild(int index);
  public abstract Iter<Component> makeIter();
}
