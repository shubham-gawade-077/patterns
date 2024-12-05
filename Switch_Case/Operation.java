package Switch_Case;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		do {
			System.out.println(" 1.Addition\n 2.substraction\n 3.multiplication\n 4.division");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition= "+(a+b));
			break;
			
		case 2:
			System.out.println("substraction= "+(a-b));
			break;

		case 3:
			System.out.println("multiplication= "+(a*b));
			break;
		case 4:
			System.out.println("Division= "+(a/b));
			break;
		default:
			System.out.println("plz enter valid choice number");
			

		}
		
		}while(ch<=4);
		
	}

}
