package SUnit;
/*
 * in this code demonstrates the use of SUnit tool which provide reports.
 * that contains messages generated from the check methods.
 */

import static SUnit.KUnit.checkEquals;
import static SUnit.KUnit.checkNotEquals;
import static SUnit.KUnit.report;

public class TestSet {
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
		    TestSet ts = new TestSet();
		    ts.checkConstructorAndAccess();
		    ts.checkSquareA();
		    report();
		  }
}
