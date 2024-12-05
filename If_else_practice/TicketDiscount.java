package If_else_practice;

import java.util.Scanner;

public class TicketDiscount 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		 if(age>=0 && age<=12 ||age>=65)
		 {
			 System.out.println("they can get discount");
		 }
		 else if(age<0)
		 {
			 System.out.println("plz enter positive number");
		 }
		 else
		 {
			 System.out.println("cannot get discount");
		 }
	}

}
