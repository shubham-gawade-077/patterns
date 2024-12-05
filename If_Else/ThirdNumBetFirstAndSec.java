package If_Else;

import java.util.Scanner;

public class ThirdNumBetFirstAndSec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();

		
		if(a<c && b>c)
		{
			System.out.println(c+" is between "+a+" and "+b);
		}
		
		else
		{
			System.out.println(c+" is not between "+a+" and "+b);
		}



	}

}
