package Switch_Case;

import java.util.Scanner;

public class NumeratorAndDenominator {

	public static void main(String[] args) {
		int ch,num,den;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		
		System.out.println("Enter value of c");
		int c=sc.nextInt();
		
		System.out.println("Enter value of d");
		int d=sc.nextInt();
		
		do
		{
			System.out.println(" 1.Addition \n 2.substraction\n 3.multipiy");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				 num=(a*d+(b*c));
				 den=(b*d);
				System.out.println("Addition=" +num+ "/" +den);
				
				break;
				
			case 2:
				num=(a*d-(b*c));
				 den=(b*d);
				System.out.println("substraction=" +num+ "/" +den);
				
				break;
			case 3:
				num=(a*c);
				den=(b*d);
				System.out.println("multiply=" +num+ "/" +den);
				
				break;
							
				default:
					System.out.println("Invalid choice");
			}
		}
		while(ch<=3);

	}

}
