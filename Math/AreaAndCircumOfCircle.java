package Math;

import java.util.Scanner;

public class AreaAndCircumOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double a=3.14*r*r;
		double circum=2*3.14*r;
		System.out.println("Area of circle "+a+"\n"+"circumference of circle "+circum);
	}

}
