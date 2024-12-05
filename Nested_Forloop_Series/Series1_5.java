package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_5 {
	// 1!/1 + 2!/2 + 3!/3 + 4!/4+	+ n!/n


	public static void main(String[] args) 
	{
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int f1=1;
			for(int j=i;j>1;j--)
			{
				f1=f1*j;
			}
			sum=sum+(double)(f1/i);
		}
		System.out.println("sum= "+sum);
	}

}
