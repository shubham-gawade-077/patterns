package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_2 {  
	//sum=1x+3x+5x+7x

	public static void main(String[] args) 
	{
		int sum=0;
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+(k*x);
			k+=2;
		}
		System.out.println("sum= "+sum);
	}

}
