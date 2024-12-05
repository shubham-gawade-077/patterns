package Nested_if_else;

import java.util.Scanner;

public class ConditionalOperator2 {  // ternary operator

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		int c=(a>b)?a:b;
		System.out.println("max= "+c);

	}

}
