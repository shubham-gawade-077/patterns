package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern4_31 
{
	public static void main(String[] args) 
	{int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1&&j==1||i==n&&j==1||i==1&&j==n-1||i==n&&j==n-1)
				{
					System.out.print("  ");
				}
				if(i==1||i==n|j==1||j==n)
				{
					System.out.print("* ");
				}
				else 
				{
						System.out.print((j-1)+" ");		
				}
			}
			System.out.println();
		}
	}

}
  /*

  * * * *  
* 1 2 3 4 *
* 1 2 3 4 *
* 1 2 3 4 *
* 1 2 3 4 *         
  * * * * 

  */