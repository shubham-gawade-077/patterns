package Numbersss;

import java.util.Scanner;

public class Swap_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		
		System.out.println("before swaping "+"n1="+n1+" and "+"n2="+n2);
		int temp=n1;
		 n1=n2;
		 n2=temp;
		 
			System.out.println("after swaping "+"n1="+n1+" and "+"n2="+n2);	
		
	}

}
