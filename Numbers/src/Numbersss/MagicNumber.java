package Numbersss;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		while(n>9)
		{
			sum=0;
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				sum=sum+n1;
			}
			n=sum;
		}
		if(n==1)
		{
			System.out.println("Magic number");
		}
		else
		{
			System.out.println("Not Magic number");

		}
	}

}
