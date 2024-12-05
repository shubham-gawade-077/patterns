package If_else_practice;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day(weekday or weekend)");
		String day=sc.nextLine();
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(day.equals("weekday"))
		{
			if(age>=0 && age<=13)
			{
				System.out.println("Ticket price is 100");
			}
			else if(age>=13 && age<=64)
			{
				System.out.println("Ticket price is 150");
			}
			else if(age>65)
			{
				System.out.println("Ticket price is 130");
			}

			else
			{
				System.out.println("plz enter positive age number");
			}
		}
		else if(day.equals("weekend"))
		{
			if(age>=0 && age<=13)
			{
				System.out.println("Ticket price is 120");
			}
			else if(age>=13 && age<=64)
			{
				System.out.println("Ticket price is 180");
			}
			else if(age>65)
			{
				System.out.println("Ticket price is 150");
			}

			else
			{
				System.out.println("plz enter positive age number");
			}

		}
		else
		{
			System.out.println("plz enter valid day(weekday or weekend ");
		}

	}

}
