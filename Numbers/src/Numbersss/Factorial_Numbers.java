package Numbersss;

import java.util.Scanner;

public class Factorial_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
				
			System.out.println("Enter Number");	
			int n=sc.nextInt();
			int sum=1;
			
			for(int i=1;i<=n;i++)
			{
				sum=sum*i;
			}
			System.out.println("factorial of "+n+" is "+sum);
	}

}
/*
eg. 5=5*4*3*2*1=120
	multiplies a number by every number below it till 1
*/