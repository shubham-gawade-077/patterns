package If_Else;

import java.util.Scanner;

public class DigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is digit");
		}
		else
		{
			System.out.println(ch+" is not digit");
		}
	}

}
