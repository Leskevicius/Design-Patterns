public class LinkedIter<T> implements Iter<T> {
  private Node<T> head;
  private Node<T> current;

  public LinkedIter(LinkedList<T> ll) {
    head = ll.getHead();
    current = head;
  }

  public void first() {
    current = head;
  }

  public void next() {
    if (!isDone()) {
      current = current.getNext();
    }
  }

  public boolean isDone() {
    if (current == null)
      return true;
    else
      return false;
  }

  public T currentItem() {
    if (isDone())
      return null;
    else
      return current.getData();
  }
}
