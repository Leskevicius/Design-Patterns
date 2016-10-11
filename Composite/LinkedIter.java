public class LinkedIter<T> implements Iter<T> {
  private LinkedList<T> ll;
  private int index = 0;

  public LinkedIter(LinkedList<T> ll) {
    this.ll = ll;
  }

  public void first() {
    index = 0;
  }

  public void next() {
    index++;
  }

  public boolean isDone() {
    if (index >= ll.size())
      return true;
    else
      return false;
  }

  public T currentItem() {
    if (isDone())
      return null;
    else
      return ll.get(index);
  }
}
