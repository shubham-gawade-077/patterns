package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern3_29 
{
	public static void main(String[] args) 
	{
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
  /*

  * * * * * 
  *       *
  *       *
  *       *
  * * * * *

  */