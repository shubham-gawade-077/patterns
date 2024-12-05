package Nested_if_else;

import java.util.Scanner;

public class DivisibleBy5And7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%5==0)
		{
			if(n%7==0)
			{
				System.out.println("divisible by 5 and 7");
			}
			else
			{
				System.out.println("divisible by 5 but not 7");
			}
		}
		else
		{
			if(n%7==0)
			{
				System.out.println("divisible by 7 but not 5");
			}
			else
			{
				System.out.println("not divisible by 5 and 7");
			}
		}

	}

}
