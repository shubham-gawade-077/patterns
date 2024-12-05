package If_Else;

import java.util.Scanner;

public class CapitalOrSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is capital");
		}
		else
		{
			System.out.println(ch+" is not capital (this is small)");
		}
	}

}
