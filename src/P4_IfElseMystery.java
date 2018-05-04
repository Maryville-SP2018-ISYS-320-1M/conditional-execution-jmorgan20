/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1.3
 2.4
 3. 29
 4.30
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		ifElseMystery(10, 2);
		ifElseMystery(3, 8);
		ifElseMystery(4, 4);
		ifElseMystery(10, 30);

	}
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }

}
