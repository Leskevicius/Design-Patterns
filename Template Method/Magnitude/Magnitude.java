public abstract class Magnitude {
  /*
   * Abstract method lessThan() that must be overriden by
   * subclasses. All other methods make use of this method.
   */
  public abstract boolean lessThan( Magnitude m );

  /*
   * a <= b in a form of a.lessThan(b);
   */
  public boolean lessThanEqualTo( Magnitude m ) {
    if ( !(m.lessThan(this)) )
      return true;
    else
      return false;
  }

  /*
   * a == b in a form of a.equalTo(b);
   */
  public boolean equalTo( Magnitude m ) {
    if ( !(this.lessThan(m)) && !(m.lessThan(this)) )
      return true;
    else
      return false;
  }

  /*
   * a >= b in a form of a.greaterThanEqualTo(b);
   */
  public boolean greaterThanEqualTo( Magnitude m ) {
    if ( !(this.lessThan(m)) )
      return true;
    else
      return false;
  }

  /*
   * a > b in a form of a.greaterThan(b);
   */
  public boolean greaterThan( Magnitude m ) {
    if ( m.lessThan(this) )
      return true;
    else
     return false;
  }

  /*
   * a != b in a form of a.notEqual(b);
   */
  public boolean notEqual( Magnitude m ) {
    if ( this.lessThan(m) || m.lessThan(this) )
      return true;
    else
      return false;
  }
}
