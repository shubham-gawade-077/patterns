package If_Else;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else if(age<0)
		{
			System.out.println("invalid age");
		}
		else {
			System.out.println("not eligible to vote");
		}

	}

}
