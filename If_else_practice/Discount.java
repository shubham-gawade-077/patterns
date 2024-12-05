package If_else_practice;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product name(1.electronics or 2.clothing or 3.food)");
		String p=sc.nextLine();
		
		System.out.println("enter purchase amount of "+p);
		int rs=sc.nextInt();
		
		if(p.equals("electronics") && rs>=0)
		{
			System.out.println("10% discount on electronics");
		}
		else if(p.equals("clothing"))
		{
			if(rs>=0 && rs<=5000)
			{
				System.out.println("15% discount on clothing");
	
			}
			else if(rs>5000)
			{
				System.out.println("20% discount on clothing");

			}
			else
			{
				System.out.println("plz enter positive value");

			}
		}
		else if(p.equals("food"))
		{
			if(rs>=1000)
			{
				System.out.println("5% discount on food ");
			}else
			{
				System.out.println("no discount on food");
			}
		}
		else
		{
			System.out.println("plz enter valid product name(electronics,clothing,food");
		}
	}

}
