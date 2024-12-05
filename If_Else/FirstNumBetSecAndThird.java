package If_Else;

import java.util.Scanner;

public class FirstNumBetSecAndThird {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();

		
		if(a<b && a<c)
		{
			System.out.println(a+" is between "+b+"and"+c);
		}
		
		else
		{
			System.out.println(a+" is not between "+b+" and "+c);
		}


	}

}
