      // THIS PROGRAM IS MADE BY PRIYANSHU SINGH

import java.util.Scanner;
public class BIN_TO_DECIMAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         
         System.out.println("Enter binary number to get its decimal equivalent");
         String a = s.nextLine();  // Taking binary number as string input
         
         int b = Integer.parseInt(a,2);  // Converting a string of base 2 ,i.e., a to decimal number
         System.out.println("Decimal equivalent of given binary number is "+b);
	}

}
