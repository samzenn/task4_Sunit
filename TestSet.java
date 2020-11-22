import static KUnit.KUnit.checkEquals;
import static KUnit.KUnit.checkNotEquals;
import static KUnit.KUnit.report;

/*
 * This demonstrates the use of the SUnit testing tool.
 * it's generate a report which contains messages generated from the check methods.
 * 
 */

public class TestSet {

	public class TestSimple {

		  void checkConstructorAndAccess(){
		    Simple s = new Simple(3, 4);
		    checkEquals(s.getA(), 4);
		    checkEquals(s.getB(), 4);
		    checkNotEquals(s.getB(), 4);    
		    checkNotEquals(s.getB(), 5);    
		  }

		  void checkSquareA(){
		    Simple s = new Simple(3, 4);
		    s.squareA();
		    checkEquals(s.getA(), 9);
		  }

		  public static void main(String[] args) {
		    TestSimple ts = new TestSimple();
		    ts.checkConstructorAndAccess();
		    ts.checkSquareA();
		    report();
		  }
}
