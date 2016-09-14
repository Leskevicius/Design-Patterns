/*
 * CartPoint class extends Magnitude and implements the Template method
 * lessThan. Two CartPoint objects can be compared using the functionality
 * provided by the super-class Magnitude
 */

public class CartPoint extends Magnitude {

  /*
   * Private data members that hold the coordinate of the point
   */
  private double x;
  private double y;

  /*
   * "default" constructor that sets the data members to 0.0
   */
  public CartPoint() {
    x = 0.0;
    y = 0.0;
  }

  /*
   * Constructor that takes in x and y coordinate and sets them to the
   * objects x and y coordinates
   */
  public CartPoint( double x, double y ) {
    this.x = x;
    this.y = y;
  }

  /*
   * Implementation for lessThan method. This is a Template Method that allows
   * for use of super-classes functionality to be correct. It makes sure that
   * the right type of object is used.
   */
  @Override
  public boolean lessThan( Magnitude c ) {
    if ( c instanceof CartPoint ) {
      CartPoint cp = (CartPoint)c;
      double distance1 = distanceFromOrigin(x,y);
      double distance2 = distanceFromOrigin(cp.getCartPointX(), cp.getCartPointY());
      if ( distance1 < distance2 )
        return true;
      else
        return false;
    }
    else {
      System.out.println("Wrong object provided! Must be instance of CartPoint.\n");
      return false;
    }
  }

  /*
   * Mutator method that updates the objects coordinates
   */
  public void setCartPoint( double x, double y ) {
    this.x = x;
    this.y = y;
  }

  /*
   * Accessor method that returns the X coordinate of the object
   */
  public double getCartPointX() {
    return this.x;
  }

  /*
   * Accessor method that returns the Y coordinate of the object
   */
  public double getCartPointY() {
    return this.y;
  }

  /*
   *
   */
  private double distanceFromOrigin( double x, double y ) {
    return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
  }
}
