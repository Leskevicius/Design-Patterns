public class LinkedComposite extends Composite {
  // private variables
  private int childCount;
  private LinkedList<Component> children;

  // constructors
  public LinkedComposite() {
    children = new LinkedList<Component>();
    childCount = 0;
  }

  public LinkedComposite(Component... newChildren) {
    children = new LinkedList<Component>();
    childCount = 0;

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
      System.out.println("LinkedComposite containing");
      for (int i = 0; i < childCount; i++) {
        System.out.print(tabs);
        System.out.print(children.get(i).toString());
      }
    }
    else {
      System.out.println("LinkedComposite");
    }
    return "";
  }

  // superclass abstract functions implemented

  // adds a new child to the component
  public void add(Component childComponent) {
    children.add(childComponent);
    childComponent.setParent(this);
    childCount++;
  }

  // removes a child from the component
  public void remove(Component childComponent) {
    // children.print_contents();
    boolean success = children.remove(childComponent);
    if (success) {
      childComponent.setParent(null);
      childCount--;
      // children.print_contents();
    }
    else {
      System.out.println("Given child could not be found");
    }
  }

  // allows for accessing children by index [order they were added]
  public Component getChild(int index) {
    Component child = children.get(index);

    if (child == null) {
      System.out.println("Invalid index");
      return null;
    }
    else {
      return child;
    }
  }
}
