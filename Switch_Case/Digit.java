package Switch_Case;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("It is 1");
				break;
			
			case 2:
				System.out.println("It is 2");
				break;
			case 3:
				System.out.println("It is 3");
				break;
			case 4:
				System.out.println("It is 4");
				break;
			
			case 5:
				System.out.println("It is 5");
				break;
				
			default:
				System.out.println("plz enter only 1 to 5 numbers");
				
		}
	}

}
