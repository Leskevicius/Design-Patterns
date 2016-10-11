public class ArrayIter<T> implements Iter<T> {
  private T[] tArray;
  private int index = 0;

  public ArrayIter(T[] tArray) {
    this.tArray = tArray.clone();
  }

  public void first() {
    index = 0;
  }

  public void next() {
    index++;
  }

  public boolean isDone() {
    if (index >= tArray.length)
      return true;
    else
      return false;
  }

  public T currentItem() {
    if (isDone())
      return null;
    else
      return tArray[index];
  }
}
