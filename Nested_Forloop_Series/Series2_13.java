package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_13 {
//1 + 3 + 6 + 10 +	+ n
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum+k;
			k+=1+i;
		}
		System.out.println("sum= "+sum);
	}

}
