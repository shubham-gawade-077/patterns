package Nested_if_else;

import java.util.Scanner;

public class AptitudeExam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 10th marks");
		int a=sc.nextInt();
		
		System.out.println("enter the 12th marks");
		int b=sc.nextInt();

		System.out.println("enter the degree marks");
		int c=sc.nextInt();
		
		if(a>=60 ) 
		{
			if(b>=60)
			{
				if(c>=60)
				{
					System.out.println("Eligible for aptitude test");
				}
				else
				{
					System.out.println("10th and 12th marks good but degree mark less");
				}
			}
			else
			{
			System.out.println("10th marks is good but 12th marks less");
			}	
		}
		else
		{
			System.out.println("Not eligible for aptitude test");
		}
		

	}

}
