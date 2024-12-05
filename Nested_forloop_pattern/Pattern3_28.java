package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern3_28 
{
	public static void main(String[] args) 
	{int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			a=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+j));
			}
			for(int k=9;k>=(i*2)-1;k--)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print((char)(96+a));
				a--;
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			a=1;
			for(int j=1;j<=5-i;j++)
			{
				System.out.print((char)(96+a));
				a++;
				
			}
			for(int k=1;k<=(i*2)+1;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=5-i;l++)
			{
				
				System.out.print((char)(95+a));
				a--;
			}
			System.out.println();
		}
	}

}
  /*

a         a
ab       ba
abc     cba
abcd   dcba
abcde edcba
abcd   dcba
abc     cba
ab       ba
a         a

  */