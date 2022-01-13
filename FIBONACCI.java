                          /*  THIS PROGRAM IS MADE BY PRIYANSHU SINGH 
                                     PROGRAM NO.20  ( ALTERNATIVE )                      */

import java.util.Scanner;
public class FIBONACCI {

	public static void main(String[] args) {
    int n,i,sum=1;
    int [] arr= new int[50] ;
		
	Scanner s = new Scanner(System.in);
    System.out.println("For how many terms do you want to display the Fibonacci series");
    n = s.nextInt();
     
    System.out.println("Fibonacci Series :-");
    System.out.println("0");
    for(i=1;i<=n;i++)
    {
     System.out.println(sum);
     arr[i]= sum;
     sum=sum+arr[i-1];
    }

	}

}
