package Nested_Forloop_Series;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int n1=sc.nextInt();
		for(int j=1;j<=n1;j++)
		{
		int sum=0;
		int n=j;
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				System.out.print(n+",");
			}
		}
	}

  
}
