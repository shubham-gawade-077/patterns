package Math;

import java.util.Scanner;

public class VolumeOfCone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=sc.nextInt();
		
		System.out.println("Enter the height");
		int h=sc.nextInt();

		double volume=(3.14*r*r*h)/3;
		System.out.println("volume of cuboid= "+volume);
	}

}
