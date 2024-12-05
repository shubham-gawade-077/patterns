package If_Else;

import java.util.Scanner;

public class NumDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		if(n>=0 && n<=9)
		{
			System.out.println("one digit");
		}
		else if(n>=10 && n<=99)
		{
			System.out.println("two digit");
		}
		else if(n>=100 && n<=999)
		{
			System.out.println("three digit");
		}
		else {
			System.out.println("more than four digit");
		}

	}

}
