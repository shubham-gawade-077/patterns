package Nested_if_else;

import java.util.Scanner;

public class MaxFrom4Num {
	public static void main(String[] args) {   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a");
		int a=sc.nextInt();
		
		System.out.println("enter the b");
		int b=sc.nextInt();

		System.out.println("enter the c");
		int c=sc.nextInt();
		
		System.out.println("enter the d");
		int d=sc.nextInt();

		
		if(a>b) //max a
		{
			if(a>c) //max a
			{
			
				if(a>d)//max a
				{
					System.out.println("max= "+a);
				}
				else //max d
				{
					System.out.println("max= "+d);
				}
				}
			
			else //max c
				{
					if(c>d) //max c
					{
					System.out.println("max= "+c);
					}
					else //max d
					{
						System.out.println("max= "+d);
					}
				}
			}
		
		else //max b
		{
			if(b>c)//max b
			{
				if(b>d) //max b
				{
					System.out.println("max= "+b);
				}
				else //max d
				{
				System.out.println("max= "+d);
			}}
			else  //max c
			{
				if(c>d) //max c
				{
					System.out.println("max= "+c);
				}
				else //max d
				{
					System.out.println("max= "+d);
				}
				}
			}
		}

	}


