package Numbersss;

import java.util.Scanner;

public class Prime_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int x=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				x++;
			}
		}
			if(x==1)
			{
				System.out.println(n+" is prime number");
			}
			else
			{
				System.out.println(n+" is not prime number");

			}
		}
	}


