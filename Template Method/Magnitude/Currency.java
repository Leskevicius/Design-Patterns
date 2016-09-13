public class Currency extends Magnitude {

  private double currency;

  public Currency() {
    currency = 0.0;
  }

  public Currency( double c ) {
    currency = c;
  }

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

  public void setCurrency( double c ) {
    currency = c;
  }

  public double getCurrency() {
    return currency;
  }
}
