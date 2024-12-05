package Switch_Case;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the input");
		char ch=sc.next().charAt(0);
		
		if(ch>='0' && ch<='9')
		{
			ch=1;
		}
		else if(ch>='A' && ch<='Z')
		{
			ch=2;
		}
		else if(ch>='a' && ch<='z')
		{
			ch=3;
		}
		
		switch(ch)
		{
		case 1:
			System.out.println("Digit");
			break;
		
		case 2:
			System.out.println("uppercase character");
		break;
		
		case 3:
			System.out.println("lowercase character");
		    break;
		    
		default:
				System.out.println("special character");
		}
		
		
	}
}


