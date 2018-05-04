import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
2 0 5

-- Your test values for x, y, z and do you expect true or false?
2 0 5 false

*/

/* 2. 
-- Your conditional expression
1 1 1

-- Your test values for x, y, z and do you expect true or false?
1 1 1 false
*/

/* 3.  
-- Your conditional expression
7 8 9

-- Your test values for x, y, z and do you expect true or false?
true
*/

/* 4.  
-- Your conditional expression
8 5 2

-- Your test values for x, y, z and do you expect true or false?
false
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( x > y ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
