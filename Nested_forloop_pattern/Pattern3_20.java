package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern3_20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
	}

}
  /*

 a b c d e
 a b c d
 a b c
 a b
 a 
 a b
 a b c
 a b c d
 a b c d e

  */