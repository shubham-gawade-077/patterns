package If_Else;

import java.util.Scanner;

public class SecNumBetFirstAndThird {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();

		
		if(a<b && c>b)
		{
			System.out.println(b+" is between "+a+" and "+c);
		}
		
		else
		{
			System.out.println(b+" is not between "+a+" and "+c);
		}



	}

}
