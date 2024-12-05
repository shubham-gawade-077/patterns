package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern1_5 
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
				System.out.print(a+"\t");
				a+=2;
			}
			System.out.println();
		}
	}

}
  /*

 1
 3 5
 7 9 11
 13 15 17 19
 21 23 25 27 29

  */