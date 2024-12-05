package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_9 {
//1 + 3 + 5 + 7 + 9 +	+ n
	public static void main(String[] args) 
	{
		int sum=0;
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+k;
			k+=2;
		}
		System.out.println("sum= "+sum);
	}

}
