// THIS PROGRAM IS MADE BY PRIYANSHU SINGH 

import java.util.*;
import java.lang.Math;
public class SMALLEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("ENTER NUMBER 1 ");
int a = input.nextInt();
System.out.println("ENTER NUMBER 2 ");
int b = input.nextInt();
System.out.println("ENTER NUMBER 3 ");
int c = input.nextInt();

int d = Math.min(a, b);   // COMPARING a AND b AND STORING THE SMALLER NUMBER IN d
int e = Math.min(d,c);    // COMPARING d AND c AND STORING THE SMALLER NUMBER IN e

// THE SMALLEST NUMBER GETS STORED IN e 
if (a==b && a==c)
{
System.out.println("ALL THE THREE NUMBERS ARE EQUAL .");
}
else
{
System.out.println(e+" IS THE SMALLEST NUMBER .");
}
	}

}

