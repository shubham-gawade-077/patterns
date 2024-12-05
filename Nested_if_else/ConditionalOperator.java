package Nested_if_else;

import java.util.Scanner;

public class ConditionalOperator {  // ternary operator

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		System.out.println("enter the third number");
		int c=sc.nextInt();

		
		int d=(a>b && a>c)?a:b;
		System.out.println("max= "+d);

	}

}
