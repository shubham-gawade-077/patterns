package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern2_13 
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
				System.out.print((char)(64+i)+""+(char)(96+i)+" ");
			
			}
			System.out.println();
		}
	}

}
  /*

 Aa
 Bb Bb
 Cc Cc CC 
 Dd Dd Dd Dd
 Ee Ee Ee Ee Ee

  */