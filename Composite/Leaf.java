public class Leaf extends Component {
  // private variables
  private String id;

  // constructor
  public Leaf(String id) {
    this.id = id;
  }

  // implementation of toString
  public String toString() {
    System.out.println("Leaf " + id);
    return "";
  }
}
