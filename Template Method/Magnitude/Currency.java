/*
 * Currency class extends Magnitude and implements the Template method
 * lessThan. Two Currency objects can be compared using the functionality
 * provided by the super-class Magnitude
 */

public class Currency extends Magnitude {

  /*
   * Private data member that holds the currency of the object
   */
  private double currency;

  /*
   * "default" constructor that sets the currency to 0.0
   */
  public Currency() {
    currency = 0.0;
  }

  /*
   * Constructor that takes a double value, and sets it to the currency of
   * the object
   */
  public Currency( double c ) {
    currency = c;
  }

  /*
   * Implementation for lessThan method. This is a Template Method that allows
   * for use of super-classes functionality to be correct. It makes sure that
   * the right type of object is used.
   */
  @Override
  public boolean lessThan( Magnitude c ) {
    if ( c instanceof Currency ) {
      Currency cur = (Currency)c;
      if ( currency < cur.getCurrency() )
        return true;
      else
        return false;
    }
    else {
      System.out.println("Wrong object provided! Must be instance of Currency.\n");
      return false;
    }
  }

  /*
   * Mutator method that sets the currency of the object
   */
  public void setCurrency( double c ) {
    currency = c;
  }

  /*
   * Accessor method that returns current currency of the object
   */
  public double getCurrency() {
    return currency;
  }
}
