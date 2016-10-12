public class PreOrderIter<T> implements Iter<T> {
  private T root;
  private T currentElement;

  public void first() {
    currentElement = root;
  }
  /*
  ArrayComposite containing
    Leaf C
    LinkedComposite containing
      Leaf A
      Leaf B
    Leaf D
  */
  // lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
  // ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
  public void next() {
    if (currentElement == null) {
      return;
    } else {
      getNext(currentElement.getParent().makeIter);
    }
  }

  public boolean isDone() {
    if (currentElement == null)
      return true;
    else
      return false;
  }

  public T currentItem() {
    if (isDone())
      return null;
    else
      return currentElement;
  }
  /*
  ArrayComposite containing
    Leaf C
    LinkedComposite containing
      Leaf A
      Leaf B
    Leaf D
  */
  // lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
  // ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
  private void getNext(Iter<T> iter) {

  }
}
