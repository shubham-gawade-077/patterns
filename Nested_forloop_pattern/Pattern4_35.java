package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern4_35 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=5;i>=1;i--)
		{
			int a=(n-i)+1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			int b=i;
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+(1);k++)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}
				
	}
}
	

  /*
      
 1 2 3 4 5
  2 3 4 5
   3 4 5
    4 5
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5

  */