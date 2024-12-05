package If_Else;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%7==0)
		{
			System.out.println(n+" is divisible by 7");
		}
		else
		{
			System.out.println(n+" is not divisible by 7");
		}
	}

}
