package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern4_30 
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
				if(i==3||j==3)
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

     *
     *
 * * * * *
     * 
     * 

  */