package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern2_11 
{
	public static void main(String[] args) 
	{
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+a)+" ");
				a++;
			}
			System.out.println();
		}
	}

}
  /*

 a
 b c
 d e f
 g h i j
 k l m n o

  */