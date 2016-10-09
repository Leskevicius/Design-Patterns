public class LinkedList<E> {
  protected class Node<E> {
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

  //the head node;
  private Node<E> head;
  //size
  private int size;


  public LinkedList() {
    head = null;
    size = 0;
  }

  public void add(E e) {
    if (head == null) {
      head = new Node<E>(e);
    } else {
      Node<E> temp = head;
      while (temp.getNext() != null)
        temp = temp.getNext();
      temp.setNext(new Node<E>(e));
    }
    size++;
  }

  public boolean remove(E e) {
    if (head == null) {
      return false;
    }

    if (head == e) {
      head = head.getNext();
      size--;
      return true;
    }

    Node<E> temp = head;
    while ((temp = temp.getNext()) != null) {
      if (temp == e) {
        temp = temp.getNext();
        size--;
        return true;
      }
    }
    return false;
  }

  public E get(int index) {
    if (index < size) {
      Node<E> temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.getNext();
      }
      return temp.getData();
    }
    else {
      return null;
    }
  }

  public int size() {
    return size;
  }
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }
}
