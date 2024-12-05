package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern4_34 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				if(k==1||k==(i*2)-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(n*2)-(i+3);k++)
			{
				if(k==1||k==(n*2)-(i+3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
	

  /*
      
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *

  */