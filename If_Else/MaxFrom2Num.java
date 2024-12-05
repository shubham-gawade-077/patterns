package If_Else;

import java.util.Scanner;

public class MaxFrom2Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is max");
		}
		else if(a<b)
		{
			System.out.println(b+" is max");
		}
		else
		{
			System.out.println("both are same");
		}

	}

}
