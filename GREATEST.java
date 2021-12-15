// THIS PROGRAM IS MADE BY PRIYANSHU SINGH 

import java.util.*;
public class GREATEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner inp = new Scanner(System.in);
     System.out.println(" ENTER NUMBER 1 ");
     int a = inp.nextInt();
     System.out.println(" ENTER NUMBER 2 ");
     int b = inp.nextInt();
     System.out.println(" ENTER NUMBER 3 ");
     int c = inp.nextInt();
     
     if(a>b && a>c)
     {
    	 System.out.println(a+" IS THE GREATEST AMONG ALL THE THREE NUMBERS .");
     }
     else if(b>a && b>c)
     {
    	 System.out.println(b+" IS THE GREATEST AMONG ALL THE THREE NUMBERS .");
     }
     else
     {
    	 System.out.println(c+" IS THE GREATEST AMONG ALL THE THREE NUMBERS .");
     }
     
	}

}
