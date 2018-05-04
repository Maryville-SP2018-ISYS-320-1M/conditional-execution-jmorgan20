import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected result:
 
 1.true
 2.false
 3. false
 4.true
 
 5.false
 6.true
 7.true
  
 */
public class P3_ConditionalExpressions {

	public static void main(String[] args) {
		int x = 4;
		int y = -3;
		int z = 4;
		
		// Replace "YOUR EXPRESSION HERE" with the expression you're validating
		System.out.println("Expression evaluates to: " + (x == 4) );
		System.out.println("Expression evaluates to: " + (x != z) );
		System.out.println("Expression evaluates to: " + (z == y) );
		System.out.println("Expression evaluates to: " + (x + y > 0) );
		System.out.println("Expression evaluates to: " + (y * y <= z) );
		System.out.println("Expression evaluates to: " + (y / y == 1) );
		System.out.println("Expression evaluates to: " + (x * (y + 2) > y - (y+ z) * 2) );
		
	}

}
