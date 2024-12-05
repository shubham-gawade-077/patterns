package If_else_practice;

import java.util.Scanner;

public class MiddleDigitNumerEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int n=sc.nextInt();
		int a,b;
		a=n%10; //  n=132 a=2
		n=n/10; // n=132/10=13
		b=n%10; // b=3
		n=n/10; //n=1
		
		if(b==(a+n))
		{
			System.out.println("numerically equal");
		}
		else
		{
			System.out.println("not numerically equal");
		}
	}

}
