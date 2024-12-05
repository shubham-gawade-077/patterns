package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_1 {  
	//sum=1X+2X+3X+.....

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*x);
		}
		System.out.println("sum= "+sum);
	}

}
