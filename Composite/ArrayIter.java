public class ArrayIter<T> implements Iter<T> {
  private T[] tArray;
  private int index = 0;
  private int size = 0;

  public ArrayIter(T[] tArray, int size) {
    this.tArray = tArray.clone();
    this.size = size;
  }

  public void first() {
    index = 0;
  }

  public void next() {
    index++;
  }

  public boolean isDone() {
    if (index >= size)
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
