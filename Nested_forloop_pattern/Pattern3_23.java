package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern3_23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
  /*
   
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

  */