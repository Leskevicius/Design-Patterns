public class SimpleComposite extends Composite {
  // private variables
  private Composite child = null;
  private int childCount = 0;

  // constructors
  public SimpleComposite() {}

  public SimpleComposite(Composite child) {
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
  public void doAdd(Composite childComposite) {
    if (child == null) {
      child = childComposite;
      childCount++;
    }
    else {
      System.out.println("Already contains a child.");
    }
  }

  // removes a child from the component
  public void doRemove(Composite childComposite) {
    if (child == childComposite) {
      child = null;
      childCount--;
    }
    else {
      System.out.println("Given child could not be found");
    }
  }

  // allows access to children by index [order by which they were added]
  public Composite getChild(int index) {
    if (index + 1 > 0 && index < childCount) {
      return child;
    }
    else {
      System.out.println("Composite has no children");
      return null;
    }
  }

  // iterator
  public Iter<Composite> makeIter() {
    Iter<Composite> iter = new SimpleIter<Composite>(child);
    return iter;
  }
}
