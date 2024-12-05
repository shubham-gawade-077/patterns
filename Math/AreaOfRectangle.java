package Math;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length ");
		double l=sc.nextDouble();
		
		System.out.println("enter the bredth ");
		double b=sc.nextDouble();

		double a=l*b;
		System.out.println("Area of rectangle "+a);
		
		

	}

}
