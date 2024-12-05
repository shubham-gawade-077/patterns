package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_4 {
	//1! + 2! + 3! + 4!+	+ n!

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//terms
		{
			int f1=1;
			for(int j=i;j>1;j--)//factorial
			{
				f1=f1*j;
			}
			sum=sum+f1;
		}
		System.out.println("sum= "+sum);
	}

}
