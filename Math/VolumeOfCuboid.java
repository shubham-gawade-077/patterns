package Math;

import java.util.Scanner;

public class VolumeOfCuboid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		
		System.out.println("Enter the width");
		int w=sc.nextInt();
		
		System.out.println("Enter the height");
		int h=sc.nextInt();

		int volume=l*w*h;
		System.out.println("volume of cuboid= "+volume);
	}

}
