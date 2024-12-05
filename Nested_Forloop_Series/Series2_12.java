package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_12 {
//1 + 8 + 27 + 64 +	+ n
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i*i);
		}
		System.out.println("sum= "+sum);
	}

}
