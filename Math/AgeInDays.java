package Math;

import java.util.Scanner;

public class AgeInDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int n=sc.nextInt();
		int age=n*365;
		System.out.println("Age in days is "+age);
		
		
	}

}
