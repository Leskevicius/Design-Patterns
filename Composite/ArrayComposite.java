public class ArrayComposite extends Composite {
  // private variables
  private int DEFAULT_SIZE = 50;
  private int childCount = 0;
  private int capacity;
  private Composite children[];

  // constructors
  public ArrayComposite() {
    children = new Composite[DEFAULT_SIZE];
    capacity = DEFAULT_SIZE;
  }

  public ArrayComposite(int size) {
    children = new Composite[size];
    capacity = size;
  }

  public ArrayComposite(Composite... newChildren) {
    children = new Composite[DEFAULT_SIZE];
    capacity = DEFAULT_SIZE;

    for (Composite child : newChildren) {
      add(child);
    }
  }

  // implementation of toString
  // In order to figure out how many tabs to use when printing children,
  // this function traverses to the root, and storing this count to depth
  // This depth is later used to print the children
  // public String toString() {
  //   int depth = 0;
  //   if (getParent() != null) {
  //     depth++;
  //
  //     Composite tempComp = getParent();
  //     while ((tempComp = tempComp.getParent()) != null) {
  //       depth++;
  //     }
  //   }
  //
  //   String tabs = "\t";
  //   for (int i = 0; i < depth; i++) {
  //     tabs = tabs + '\t';
  //   }
  //
  //   if (childCount > 0) {
  //     System.out.println("ArrayComposite containing");
  //     for (int i = 0; i < childCount; i++) {
  //       System.out.print(tabs);
  //       System.out.print(children[i].toString());
  //     }
  //   }
  //   else {
  //     System.out.println("ArrayComposite");
  //   }
  //   return "";
  // }

  // superclass abstract functions implemented

  // adds a new child to the component
  public void doAdd(Composite childComposite) {
    if (childCount < capacity) {
      children[childCount] = childComposite;
      childCount++;
    }
    else {
      System.out.println("This composite is full");
    }
  }

  // removes a child from the component
  public void doRemove(Composite childComposite) {
    for (int i = 0; i < childCount; i++) {
      if (children[i] == childComposite) {
        children[i] = null;
        childCount--;
        shiftChildren(i);
        return;
      }
    }
    System.out.println("Given child could not be found");
  }

  // allows access of children by index (order they were added)
  public Composite getChild(int index) {
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

  // iterator
  public Iter<Composite> makeIter() {
    Iter<Composite> iter = new ArrayIter<Composite>(children, childCount);
    return iter;
  }
}
