package SUnit;

import java.util.*;

/*
 * This is a prototype of unit testing system.
 * it is primitive and contains only a reporting system and a means of checking assertions. 
 */

public class SUnit {
	
private static List<String> checks;
private static long checksMade = 0;
private static long passedChecks = 0;
private static long failedChecks = 0;

	/*
	 * THis method adds a message to the report with formed from a list of strings 
	 */
	
	private static void addToReport(String txt) {
	    if (checks == null) {
	      checks = new LinkedList<String>();
	    }
	    checks.add(String.format("%04d: %s", checksMade++, txt));
	  }
	
	/*
	 * This method similar to an assertion in JUnit
	 * It checks two integers are equal and adds message to the report
	 */
	
	  public static void checkEquals(long value1, long value2) {
		    if (value1 == value2) {
		      addToReport(String.format("  %d == %d", value1, value2));
		      passedChecks++;
		    } else {
		      addToReport(String.format("* %d == %d", value1, value2));
		      failedChecks++;
		    }
		  }
	  
	  /*
	   * this method checks that two integers whether those are not equal and adds an appropriate message to the report.
	   */
	  
	  public static void checkNotEquals(long value1, long value2) {
		    if (value1 != value2) {
		      addToReport(String.format("  %d != %d", value1, value2));
		      passedChecks++;
		    } else {
		      addToReport(String.format("* %d != %d", value1, value2));
		      failedChecks++;
		    }
		  }
	  
	  
	  /*
	   * This outputs the messages form the report.
	   */
		  
	  public static void report() {
		    System.out.printf("%d checks passed\n", passedChecks);
		    System.out.printf("%d checks failed\n", failedChecks);
		    long n = passedChecks + failedChecks;
		    System.out.printf("%d checks total\n", n);
		    System.out.println();
		    
		    for (String check : checks) {
		      System.out.println(check);
		    }
		  }

}