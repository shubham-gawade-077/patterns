package If_else_practice;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number");
		int a=sc.nextInt();
		
		if(a==1)
		{
			System.out.println("January : 31");
		}
		else if(a==2)
		{
			System.out.println("February : 28 or 29");
		}
		else if(a==3)
		{
			System.out.println("March : 31");
		}
		else if(a==4)
		{
			System.out.println("April : 30");
		}
		else if(a==5)
		{
			System.out.println("May : 31");
		}
		else if(a==6)
		{
			System.out.println("June : 30");
		}
		else if(a==7)
		{
			System.out.println("July : 31");
		}
		else if(a==8)
		{
			System.out.println("August : 31");
		}
		else if(a==9)
		{
			System.out.println("September : 30");
		}
		else if(a==10)
		{
			System.out.println("October : 31");
		}
		else if(a==11)
		{
			System.out.println("November : 30");
		}
		else if(a==12)
		{
			System.out.println("December : 31");
		}
		else 
		{
			System.out.println("plz enter 1 to 12 month number");
		}

	}

}
