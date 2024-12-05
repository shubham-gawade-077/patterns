package If_Else;

import java.util.Scanner;

public class Vaccine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vaccines");
		int n=sc.nextInt();

		if(n==2)
		{
			System.out.println("Eligible for interview");
		}
		else if(n>2)
		{
			System.out.println("only 2 vaccines are there");
		}
		else {
			System.out.println("not eligible for interview");
		}


	}

}
