package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_15 {
//1/1 + 1/3 + 1/5 + 1/7 + ………
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int k=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/k);
			k+=2;
		}
		System.out.println("sum= "+sum);
	}

}
