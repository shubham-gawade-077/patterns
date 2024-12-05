package Math;

import java.util.Scanner;

public class FahreToCel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		double f=sc.nextDouble();
		double c=(f-32)/1.8;
		System.out.println("temp in celcius= "+c);
	}

}
