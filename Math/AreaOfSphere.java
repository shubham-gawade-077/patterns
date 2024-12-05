package Math;

import java.util.Scanner;

public class AreaOfSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double a=4*3.14*r*r;
		System.out.println("Area of sphere "+a);
		
		
	}

}
