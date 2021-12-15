                /* THIS PROGRAM IS MADE BY PRIYANSHU SINGH
                 
                       PROGRAM  NO. 15    */

import java.util.Scanner;
public class BINARY_TO_OCTAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary number to get its octal equivalent");
        String a = s.nextLine(); // Taking binary number as string input
        
        int b = Integer.parseInt(a,2);  // Converting binary string of base 2 into decimal or integer
        
        String c = Integer.toOctalString(b);   //  Converting integer to octal string
        
        System.out.println("Octal equivalent of given binary number is "+c);
        
	}

}
