package Math;

import java.util.Scanner;

public class CelToFahre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		double c=sc.nextDouble();
		double f=(1.8*c)+32.0;
		System.out.println("temp in fahren= "+f);
	}

}
