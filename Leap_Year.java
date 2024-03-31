package Numbersss;

import java.util.Scanner;//ctrl+shift+o 

public class Leap_Year 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int n=sc.nextInt();
		
		if(n%4==0)
		{
			System.out.println(n+" is leap year");
		}
		else
		{
			System.out.println(n+" is not leap year");
		}
	}

}
