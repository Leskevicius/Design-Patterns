public class Test {
  public static void main(String[] args) {
    // Composite ac;
    // Composite ac2;
    // Composite ac3;
    // ac3 = new SimpleComposite(new Leaf( "X" ));
    // ac2 = new ArrayComposite(new Leaf( "A" ), new Leaf( "B" ), new Leaf( "C" ));
    // ac = new ArrayComposite(new Leaf( "D" ), ac2, new Leaf( "E" ), ac3, new Leaf( "F" ));
    // ac.toString();
    // ac2.toString();
    // ac3.toString();


    Composite lc;
    Composite ac;

    lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
    ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
    ac.toString();
  }
}
