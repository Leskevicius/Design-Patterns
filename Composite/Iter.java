public interface Iter<T> {
  public void first();
  public void next();
  public boolean isDone();
  public T currentItem();
}
