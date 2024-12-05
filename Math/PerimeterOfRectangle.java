package Math;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		
		System.out.println("enter the bredth");
		int b=sc.nextInt();

		int peri=2*(l+b);
		System.out.println("Perimeter of rectangle "+peri);
		


	}

}
