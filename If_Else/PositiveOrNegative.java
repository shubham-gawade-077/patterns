package If_Else;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n>0)
		{
			System.out.println(n+" is positive");
		}
		else if(n<0)
		{
			System.out.println(n+" is negative");
		}
		else
		{
			System.out.println(n+" is zero");
		}

	}

}
