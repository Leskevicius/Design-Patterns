public class MagnitudeTests {

  // Currency class test
  public static boolean testCurrency() {
    Currency c1 = new Currency( 10.50 );
    Currency c2 = new Currency( 11.50 );
    Currency c3 = new Currency( 10.50 );

    if ( c1.equalTo(c2) )
      return false;
    if ( c2.equalTo(c1) )
      return false;
    if ( !c1.equalTo(c3) )
      return false;
    if ( !c2.notEqual(c3) )
      return false;
    if ( !c1.lessThan(c2) )
      return false;
    if ( !c3.lessThanEqualTo(c1) )
      return false;
    if ( !c3.greaterThanEqualTo(c1) )
      return false;
    if ( c3.greaterThan(c2) )
      return false;
    if ( c3.greaterThan(c1) )
      return false;
    return true;
  }

  // CartPoint class test
  public static boolean testCartPoint() {
    CartPoint c1 = new CartPoint( 1.0, 4.0 );
    CartPoint c2 = new CartPoint( 5.0, 5.0 );
    CartPoint c3 = new CartPoint( -5.0, -5.0 );
    CartPoint c4 = new CartPoint( 1.0, 2.0 );
    CartPoint c5 = new CartPoint( 2.0, 1.0 );

    if ( c1.equalTo(c2) )
      return false;
    if ( c2.equalTo(c1) )
      return false;
    if ( !c2.equalTo(c3) )
      return false;
    if ( !c1.notEqual(c3) )
      return false;
    if ( !c1.lessThan(c2) )
      return false;
    if ( c3.lessThanEqualTo(c1) )
      return false;
    if ( !c3.greaterThanEqualTo(c1) )
      return false;
    if ( c3.greaterThan(c2) )
      return false;
    if ( !c3.greaterThan(c1) )
      return false;
    if ( c5.notEqual(c4) )
      return false;
    if ( !c5.equalsTo(c4) )
      return false
    return true;
  }

  public static void main(String args[]) {
    if ( testCurrency() )
      System.out.println("Currency test passed...\n");
    else
      System.out.println("Currency test failed...\n");
    if ( testCartPoint() )
      System.out.println("CartPoint test passed...\n");
    else
      System.out.println("CartPoint test failed...\n");
  }
}
