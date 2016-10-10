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

    // Daves sample
    Composite lc;
    Composite ac;

    lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
    ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
    // ac.toString();

    // Other Tests
    Composite lc2;
    Composite ac2;
    Composite sc;
    Composite sc2;
    ac2 = new ArrayComposite( new Leaf( "1" ), new Leaf( "2" ), new Leaf( "3" ), new Leaf( "4" ) );
    sc = new SimpleComposite();
    sc2 = new SimpleComposite( ac2 );
    lc2 = new LinkedComposite( new Leaf( "5" ), sc, new Leaf( "6" ), sc2, new Leaf( "7" ));
    lc2.toString();
    lc2.remove(sc2);
    lc2.toString();

  }
}
