public class CartPoint extends Magnitude {

  private double x;
  private double y;

  public CartPoint() {
    x = 0.0;
    y = 0.0;
  }

  public CartPoint( double x, double y ) {
    this.x = x;
    this.y = y;
  }

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

  public void setCartPoint( double x, double y ) {
    this.x = x;
    this.y = y;
  }

  public double getCartPointX() {
    return this.x;
  }

  public double getCartPointY() {
    return this.y;
  }

  private double distanceFromOrigin( double x, double y ) {
    return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
  }
}
