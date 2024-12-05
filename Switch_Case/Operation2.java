package Switch_Case;

import java.util.Scanner;

public class Operation2 {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		do
		{
			System.out.println(" 1.Addition\n 2.substraction\n 3.multiplication\n 4.division\n 5.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			int add=a+b;
			int sub=a-b;
			int mul=a*b;
			double div=a/b;
			
			switch(ch)
			{
			case 1:
				System.out.println("Addition= "+a+" + "+b+"= "+add);
				break;
				
			case 2:
				System.out.println("substraction= "+a+" - "+b+"= "+sub);
				break;
				
			case 3:
				System.out.println("multiplication= "+a+" * "+b+"= "+mul);
				break;
				
			case 4:
				System.out.println("division= "+a+" / "+b+"= "+div);
				break;
			case 5:
				System.exit(0);
				default :
					System.out.println("Invalid choice");
			}
		}
		while(ch<=5);
		
	}

}
