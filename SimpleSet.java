
public class SimpleSet {

  public long a = 10;
  private long b = 20;
  
  
public SimpleSet() {
  }
  
  
public SimpleSet(long a, long b) {
    this.a = a;
    this.b = b;
  }

 
 public void squareA(){
    this.a *= this.a;
  }

 
 private void squareB(){
    this.b *= this.b;
  }

  
public long getA() {
    return a;
  }

  
private void setA(long a) {
    this.a = a;
  }

  
public long getB() {
    return b;
  }

 
 public void setB(long b) {
    this.b = b;
  }
  

  public String toString() {
   
 return String.format("(a:%d, b:%d)", a, b);
  }

}

