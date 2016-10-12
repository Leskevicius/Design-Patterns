public class NullIter<T> implements Iter<T> {
  public void first() {}

  public void next() {}

  public boolean isDone() {
    return true;
  }

  public T currentItem() {
    return null;
  }
}
