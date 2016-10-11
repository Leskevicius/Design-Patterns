public class SimpleComposite extends Composite {
  // private variables
  private Component child = null;
  private int childCount = 0;

  // constructors
  public SimpleComposite() {}

  public SimpleComposite(Component child) {
    add(child);
  }

  // implementation of toString
  // TODO: cache depth, and update accordingly...
  // In order to figure out how many tabs to use when printing children,
  // this function traverses to the root, and storing this count to depth
  // This depth is later used to print the children
  // public String toString() {
  //   int depth = 0;
  //   if (getParent() != null) {
  //     depth++;
  //
  //     Component tempComp = getParent();
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
  //     System.out.println("SimpleComposite containing");
  //     System.out.print(tabs);
  //     System.out.print(child.toString());
  //   }
  //   else {
  //     System.out.println("SimpleComposite");
  //   }
  //   return "";
  // }

  // superclass abstract functions implemented

  // adds a new child to the component
  public void doAdd(Component childComponent) {
    if (child == null) {
      child = childComponent;
      childCount++;
    }
    else {
      System.out.println("Already contains a child.");
    }
  }

  // removes a child from the component
  public void doRemove(Component childComponent) {
    if (child == childComponent) {
      child = null;
      childCount--;
    }
    else {
      System.out.println("Given child could not be found");
    }
  }

  // allows access to children by index [order by which they were added]
  public Component getChild(int index) {
    if (index + 1 > 0 && index < childCount) {
      return child;
    }
    else {
      System.out.println("Component has no children");
      return null;
    }
  }

  // iterator
  public Iter<Component> makeIter() {
    Iter<Component> iter = new SimpleIter<Component>(child);
    return iter;
  }
}
