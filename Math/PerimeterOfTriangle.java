package Math;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side 1");
		int s1=sc.nextInt();
		
		System.out.println("enter the side 2");
		int s2=sc.nextInt();
		
		System.out.println("enter the side 3");
		int s3=sc.nextInt();

		int peri=s1+s2+s3;
		System.out.println("Perimeter of triangle "+peri);
		
	}

}
