package Switch_Case;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("1:Area of circle \n 2:Area of  traingle\n3:Area of rectangle\n4:Kinetic Energy\n\5:Am & HM");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("enter the radius of circle");
			double r=sc.nextDouble();
			double a=3.14*r*r;
			System.out.println("Area of circle= "+a);
			break;
			
		case 2:
			System.out.println("enter the bredth of triangle");
			double b=sc.nextDouble();
			
			System.out.println("enter the height of triangle");
			double h=sc.nextDouble();
			
			double area=0.5*b*h;
			System.out.println("Area of triangle=  "+area);
			break;
		case 3:
			System.out.println("enter the bredth of rectangle");
			double br=sc.nextDouble();
			
			System.out.println("enter the length of rectangle");
			double l=sc.nextDouble();

			double areaa=l*br;
			System.out.println("area of rectangle= "+areaa);
			break;
			
		case 4:
			System.out.println("Enter m");
			double m=sc.nextDouble();
			
			System.out.println("Enter v");
			double v=sc.nextDouble();
			
			double ke=0.5*m*v;
			System.out.println("kinetic energy= "+ke);
			break;
		case 5:
			System.out.println("Enter a");
			double a1=sc.nextDouble();
			
			System.out.println("Enter b");
			double b1=sc.nextDouble();
			
			double am=(a1+b1)/2;
			System.out.println("am= "+am);
			break;
			
			default:
				System.out.println("Invalid choice");
		}
		}
		while(ch<=5);
	}

}
