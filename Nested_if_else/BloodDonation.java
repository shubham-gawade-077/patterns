package Nested_if_else;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		System.out.println("enter the weight");
		int w=sc.nextInt();

		System.out.println("enter the hb");
		int hb=sc.nextInt();
		
		if(age>=18)
		{
			if(w>=50)
			{
				if(hb>=12)
				{
					System.out.println("Eligible for Blood donation");
				}
				else
				{
					System.out.println("Not eligible for blood donation");
				}
			}
			else
			{
				System.out.println("Age is valid but weight is not valid");
			}

				
		}
		else
		{
			System.out.println("not valid for blood donation");
		}

		

	}

}
