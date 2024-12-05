package Numbersss;

import java.util.Scanner;

public class Perfect_Numbers {

	public static void main(String[] args)
	{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=(n/2);i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		System.out.println("Perfect number");
	}
	else
	{
		System.out.println("not perfect number");
	}
	}

}
/*
eg. 6=>(3,2,1)=>3+2+1=6
   28,496,8128
*/