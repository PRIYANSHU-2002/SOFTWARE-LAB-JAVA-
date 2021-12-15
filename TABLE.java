                              /* THIS PROGRAM IS MADE BY PRIYANSHU SINGH
                                          PROGRAM NO.17                  */
import java.util.Scanner; 
public class TABLE {
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number to get its table");
	int n= s.nextInt();
	int i;
	System.out.println("Table of "+n+" is :- \n");
	
	for (i=1;i<=10;i++) 
	{
		int p = n*i;
		System.out.println(n+" x "+i+" = "+p);
	}
	
}
}
