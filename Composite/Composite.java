public abstract class Composite extends Component {
  
  // abstract functions to be implemented by subclasses
  public abstract void add(Component childComponent);
  public abstract void remove(Component childComponent);
  public abstract Component getChild(int index);
}
