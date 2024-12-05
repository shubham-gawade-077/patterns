package Nested_Forloop_Series;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int n1=sc.nextInt();
		for(int j=2;j<n1;j++)
		{
			int n=j;
			int div=0;
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
		}
		if(div==0)
		{
			System.out.print(n+",");
		}
		}
	}
}
