package For_loop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			 f=f*i;
		}
		System.out.println(f);
	}

}
