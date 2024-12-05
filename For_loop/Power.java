package For_loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the power");
		int p=sc.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			a=a*n;
		}
		System.out.println(a);
	}

}
