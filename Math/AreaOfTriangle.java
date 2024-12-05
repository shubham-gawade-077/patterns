package Math;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height ");
		double h=sc.nextDouble();
		
		System.out.println("enter the bredth ");
		double b=sc.nextDouble();

		double a=0.5*h*b;
		System.out.println("Area of triangle "+a);
		
		

	}

}
