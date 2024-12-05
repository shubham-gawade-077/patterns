package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_10 {
//1 + 4 + 9 + 16 +	+ n
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
		}
		System.out.println("sum= "+sum);
	}

}
