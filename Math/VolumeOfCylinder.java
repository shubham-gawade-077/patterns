package Math;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		
		System.out.println("enter the height");
		double h=sc.nextDouble();

		double volume=3.14*(r*r)*h;
		System.out.println("volume of cylinder "+volume);
		
		
	}

}
