package Switch_Case;

import java.util.Scanner;

public class Ovels {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is ovel");
			break;
		default:
			System.out.println(ch+" is not ovel");
		}
	}

}
