import java.util.Scanner;
public class ARTHEMATIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER NUMBER 1 ");
  int a = sc.nextInt();
  System.out.println("ENTER NUMBER 2 ");
  int b = sc.nextInt();
  int sum,diff,prod,quo;
  sum = a+b;
  diff=a-b;
  prod=a*b;
  quo=a/b;
  System.out.println("SUM OF "+a+" AND "+b+" IS "+sum);
  System.out.println("DIFFERENCE OF "+a+" AND "+b+" IS "+diff);
  System.out.println("PRODUCT OF "+a+" AND "+b+" IS "+prod);
  System.out.println(a+"/"+b+" GIVES "+quo+" AS QUOTIENT ");
	}

}
