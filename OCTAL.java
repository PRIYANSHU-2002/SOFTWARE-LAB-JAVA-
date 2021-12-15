                      //THIS PROGRAM IS MADE BY PRIYANSHU SINGH

import java.util.Scanner;
public class OCTAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the octal number to get its binary equivalent");
       
       String a=s.nextLine();  // Taking octal number as string input
       
       int b=Integer.parseInt(a,8);   // Converting this string input of base 8 into integer or decimal
      
       String c= Integer.toBinaryString(b); // Converting integer to binary string
       
       System.out.println("Binary equivalent of given octal number is "+c);
    		   
    	   
    		  
	}

}
