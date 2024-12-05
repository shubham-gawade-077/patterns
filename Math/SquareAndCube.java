package Math;

import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int area=n*n;
		int cube=n*n*n;
		System.out.println("area= "+area+"\n"+"cube= "+cube);
		
	}

}
