package If_Else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is even");
		}
		else {
			System.out.println(n+" number is odd");
		}
	}

}
