                              /* THIS PROGRAM IS MADE BY PRIYANSHU SINGH
                                          PROGRAM NO.19 */

import java.lang.Math;
import java.util.Scanner;
public class SQUARE_ROOT {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter any number to get its square root");
	int a = s.nextInt();
	double b = Math.sqrt(a);   // Calculating the square root of given number
	System.out.println("Square root of "+a+" is "+b);
	}

}
