public class LinkedList<E> {
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

    if (head.getData() == e) {
      head = head.getNext();
      size--;
      return true;
    }

    Node<E> temp = head;
    while (temp.getNext() != null) {
      if (temp.getNext().getData() == e) {
        temp.setNext(temp.getNext().getNext());
        size--;
        return true;
      }
      temp = temp.getNext();
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

  public Node<E> getHead() {
    return head;
  }

  public void print_contents() {
    System.out.println(head.getData().hashCode());
    Node<E> temp = head;
    while ((temp = temp.getNext()) != null) {
      System.out.println(temp.getData().hashCode());
    }
    System.out.println("");
  }
}
