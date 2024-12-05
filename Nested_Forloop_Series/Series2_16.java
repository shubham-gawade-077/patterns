package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_16 {
//1/2 + 3/4 + 5/6 +……… + n/n+1
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int k=1;
		int j=2;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(k/j);
			k+=2;
			j+=2;
		}
		System.out.println("sum= "+sum);
	}

}
