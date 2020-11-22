package SUnit;

import java.util.LinkedList;
import java.util.List;

/*
 * This is a prototype of unit testing system.
 * it is primitive and contains only a reporting system and a means of checking assertions. 
 */

public class SUnit {
	
private static List<String> checks;
private static int checksMade = 0;

	/*
	 * THis method adds a message to the report with formed from a list of strings 
	 */
	
	private static void addToReport(String txt) {
	    if (checks == null) {
	      checks = new LinkedList<String>();
	    }
	    checks.add(String.format("%04d: %s", checksMade++, txt));
	  }
	


}