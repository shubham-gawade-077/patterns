package Numbersss;

import java.util.Scanner; //ctrl + shift + o

public class Palindrome_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");	
		int n=sc.nextInt();	
		int m=0;
		int n1=n;
		
		while(n>0)
		{
			m=m*10+(n%10);
			n=n/10;
		}
		if(n1==m)
		{
			System.out.println(n1+" is palindrome number");
		}
		else
		{
			System.out.println(n1+" is not palindrome number");
		}
	}

}
/*
eg. 11,22,333,4444,55555,121,3443,24542
 same number that is read forward and backward.
*/