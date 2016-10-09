public class ArrayComposite extends Composite {
  // private variables
  private int DEFAULT_SIZE = 50;
  private int childCount;
  private int capacity;
  private Component children[];

  // constructors
  public ArrayComposite() {
    children = new Component[DEFAULT_SIZE];
    childCount = 0;
    capacity = DEFAULT_SIZE;
  }

  public ArrayComposite(int size) {
    children = new Component[size];
    childCount = 0;
    capacity = size;
  }

  public ArrayComposite(Component... newChildren) {
    children = new Component[DEFAULT_SIZE];
    childCount = 0;
    capacity = DEFAULT_SIZE;

    for (Component child : newChildren) {
      add(child);
    }
  }

  // implementation of toString
  // In order to figure out how many tabs to use when printing children,
  // this function traverses to the root, and storing this count to depth
  // This depth is later used to print the children
  public String toString() {
    int depth = 0;
    if (getParent() != null) {
      depth++;

      Component tempComp = getParent();
      while ((tempComp = tempComp.getParent()) != null) {
        depth++;
      }
    }

    String tabs = "\t";
    for (int i = 0; i < depth; i++) {
      tabs = tabs + '\t';
    }

    if (childCount > 0) {
      System.out.println("ArrayComposite containing");
      for (int i = 0; i < childCount; i++) {
        System.out.print(tabs);
        System.out.print(children[i].toString());
      }
    }
    else {
      System.out.println("ArrayComposite");
    }
    return "";
  }

  // superclass abstract functions implemented

  // adds a new child to the component
  public void add(Component childComponent) {
    if (childCount < capacity) {
      children[childCount] = childComponent;
      childComponent.setParent(this);
      childCount++;
    }
    else {
      System.out.println("This composite is full");
    }
  }

  // removes a child from the component
  public void remove(Component childComponent) {
    for (int i = 0; i < childCount; i++) {
      if (children[i] == childComponent) {
        children[i].setParent(null);
        children[i] = null;
        childCount--;
        shiftChildren(i);
        return;
      }
    }
    System.out.println("Given child could not be found");
  }

  // allows access of children by index (order they were added)
  public Component getChild(int index) {
    if (index >= 0 && index < childCount) {
      return children[index];
    }
    else {
      System.out.println("Invalid index, please use 0 - " + new Integer(childCount-1).toString());
      return null;
    }
  }

  private void shiftChildren(int index) {
    for (int i = index; i <= childCount; i++) {
      children[i] = children[i+1];
    }
  }
}
