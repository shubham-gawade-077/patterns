package If_Else;

import java.util.Scanner;

public class SpecialCharOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))
		{
			System.out.println(ch+" is not special character");
		}
		else
		{
			System.out.println(ch+" is special character");
		}
	}

}
