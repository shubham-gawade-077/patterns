package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_14 {
//1.0 + 1.1 + 1.2 + 1.3 + ……… 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double sum=1.0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+0.1;
			
			
			
		}
		System.out.println("sum= "+sum);
	}

}
