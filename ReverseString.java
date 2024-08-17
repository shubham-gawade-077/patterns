package general_Pattern;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name");
		String s=sc.nextLine();
		
		String b="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);
	}

}
