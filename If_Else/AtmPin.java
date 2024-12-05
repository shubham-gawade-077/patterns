package If_Else;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int n=sc.nextInt();

		if(n==1234)
		{
			System.out.println("pin is correct....you can withdrawal the money");
		}
		else {
			System.out.println("pin is incorrect....plz enter correct pin");
		}

	}

}
