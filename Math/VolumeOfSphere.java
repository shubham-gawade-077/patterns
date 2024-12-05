package Math;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double volume=(4*3.14*r*r*r)/3;
		System.out.println("volume of sphere "+volume);
		
		
	}

}
