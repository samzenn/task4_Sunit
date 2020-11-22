import static SUnit.SUnit.*;


/*
 * This demonstrates the use of the SUnit testing tool.
 * it's generate a report which contains messages generated from the check methods.
 * 
 */

public class TestSet {


		  void checkConstructorAndAccess(){
		    SimpleSet s = new SimpleSet(3, 4);
		    checkEquals(s.getA(), 4);
		    checkEquals(s.getB(), 4);
		    checkNotEquals(s.getB(), 4);    
		    checkNotEquals(s.getB(), 5);    
		  }

		  void checkSquareA(){
		    SimpleSet s = new SimpleSet(3, 4);
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

