package If_Else;

import java.util.Scanner;

public class Alphabate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is alphabate");
		}
		else
		{
			System.out.println(ch+" is not alphabate");
		}
	}

}
