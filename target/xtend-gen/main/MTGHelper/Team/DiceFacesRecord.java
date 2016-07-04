package MTGHelper.Team;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class DiceFacesRecord {
  private int one = 0;
  
  private int two = 0;
  
  private int three = 0;
  
  private int four = 0;
  
  private int five = 0;
  
  private int six = 0;
  
  public void sum(final DiceFacesRecord other) {
    int _one = this.one;
    this.one = (_one + other.one);
    int _two = this.two;
    this.two = (_two + other.two);
    int _three = this.three;
    this.three = (_three + other.three);
    int _four = this.four;
    this.four = (_four + other.four);
    int _five = this.five;
    this.five = (_five + other.five);
    int _six = this.six;
    this.six = (_six + other.six);
  }
  
  @Pure
  public int getOne() {
    return this.one;
  }
  
  public void setOne(final int one) {
    this.one = one;
  }
  
  @Pure
  public int getTwo() {
    return this.two;
  }
  
  public void setTwo(final int two) {
    this.two = two;
  }
  
  @Pure
  public int getThree() {
    return this.three;
  }
  
  public void setThree(final int three) {
    this.three = three;
  }
  
  @Pure
  public int getFour() {
    return this.four;
  }
  
  public void setFour(final int four) {
    this.four = four;
  }
  
  @Pure
  public int getFive() {
    return this.five;
  }
  
  public void setFive(final int five) {
    this.five = five;
  }
  
  @Pure
  public int getSix() {
    return this.six;
  }
  
  public void setSix(final int six) {
    this.six = six;
  }
}
