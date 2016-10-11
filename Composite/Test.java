public class Test {
  public static void main(String[] args) {

    // Daves sample
    Composite lc;
    Composite ac;

    lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
    ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
    // System.out.println(ac.toString());
    System.out.println(lc.toString());

    // Other Tests
    Composite lc2;
    Composite ac2;
    Composite sc;
    Composite sc2;
    Composite lc3;

    ac2 = new ArrayComposite( new Leaf( "1" ), new Leaf( "2" ), new Leaf( "3" ), new Leaf( "4" ) );
    sc = new SimpleComposite();
    sc2 = new SimpleComposite( ac2 );
    lc2 = new LinkedComposite( new Leaf( "5" ), sc, new Leaf( "6" ), sc2, new Leaf( "7" ));
    lc2.toString();
    lc2.remove(sc2);
    lc2.toString();
    sc.add(ac);
    lc2.toString();

    Component ownedLeaf = new Leaf( "owned" );

    lc3 = new LinkedComposite();
    lc3.add(new Leaf( "8" ));
    lc3.add(new ArrayComposite( new Leaf( "9" ), ownedLeaf));
    lc2.add(lc3);
    ac2.add(ac);
    lc2.toString();
    // 17 is the child of 21 is the child of 18 is the child of 16 is the root.
    System.out.println(ownedLeaf.toString());


    sc.makeIter();
  }
}
