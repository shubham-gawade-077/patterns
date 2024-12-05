package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern2_12 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+""+(char)(96+j)+" ");
			
			}
			System.out.println();
		}
	}

}
  /*

 Aa
 Aa Bb
 Aa Bb Cc
 Aa Bb Cc Dd
 Aa Bb Cc Dd Ee

  */