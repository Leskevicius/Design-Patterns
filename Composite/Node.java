public class Node<E> {
  private E data;
  private Node<E> next;
  public Node() {
    data = null;
    next = null;
  }
  public Node(E e) {
    data = e;
    next = null;
  }
  public E getData() { return data; }
  public void setData(E e) { data = e; }
  public Node<E> getNext() { return next; }
  public void setNext(Node<E> next) { this.next = next; }
}
