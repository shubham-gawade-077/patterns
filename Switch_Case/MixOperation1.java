package Switch_Case;

import java.util.Scanner;

public class MixOperation1 {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		do {
			System.out.println(" 1.Addition\n 2.swap two number\n 3.max from 2 number\n 4.min from 2 number\n 5.exit");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition= "+(a+b));
			break;
		case 2:
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("a= "+a+" b= "+b);
			break;
		case 3:
			if(a>b)
			{
				System.out.println("max= "+a);
			}
			else if(b>a)
			{
				System.out.println("max= "+b);
			}
			else
			{
				System.out.println("both are equal");
			}
			break;
		case 4:
			if(a<b)
			{
				System.out.println("min= "+a);
			}
			else if(b<a)
			{
				System.out.println("min= "+b);
			}
			else
			{
				System.out.println("both are equal");
			}
			break;
		case 5:
			System.exit(0);
			break;
			default:
				System.out.println("Invalid choice");
		}
			
		
	}
		while(ch<=5);

}
}