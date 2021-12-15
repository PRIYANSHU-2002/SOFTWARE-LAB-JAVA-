                         /* THIS PROGRAM IS MADE BY PRIYANSHU SINGH
                                PROGRAM NO. 13   */

import java.util.Scanner;
public class HEXADECIMAL {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hexadecimal number to get its bnary equivalent");
		
		String a= sc.nextLine();   // Taking hexadecimal number as string input
		
		int b = Integer.parseInt(a,16);  // Converting string input hex number to decimal or integer
		
		String c= Integer.toBinaryString(b);  // Converting integer to binary number
		
		System.out.println("Binary Equivalent of given hexadecimal number is "+c);
		
	}

}
