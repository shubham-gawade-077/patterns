package If_Else;

import java.util.Scanner;

public class MinNumFrom3Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();

		if(a<b && a<c)
		{
			System.out.println(a+" is min");
		}
		else if(b<a && b<c)
		{
			System.out.println(b+" is min");
		}
		else if(c<a && c<b)
		{
			System.out.println(c+" is min");
		}
		else if(a==b && a<c)
		{
			System.out.println(a+" and "+b+" are is min and equal");
		}
		else if(a==c && c<b)
		{
			System.out.println(a+" and "+c+" are is min and equal");
		}
		else if(b==c && c<a)
		{
			System.out.println(b+" and "+c+" are is min and equal");
		}

		else {
			System.out.println("All are equals");
		}
	}

}