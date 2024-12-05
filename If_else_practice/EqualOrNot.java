package If_else_practice;

import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		if(a==b && b==c && a==c)
		{
			System.out.println("are are equal");
		}
		else
		{
			System.out.println("all are not equal");
		}

	}

}
