public class SimpleIter<T> implements Iter<T> {
  private T t;
  private T current;

  public SimpleIter(T t) {
    this.t = t;
    this.current = t;
  }

  public void first() {
    current = t;
  }

  public void next() {
    current = null;
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
      return current;
  }
}
