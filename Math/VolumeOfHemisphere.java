package Math;

import java.util.Scanner;

public class VolumeOfHemisphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=sc.nextInt();

		double volume=(2*3.14*r)/3;
		System.out.println("volume of cuboid= "+volume);
	}

}
