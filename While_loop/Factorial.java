package While_loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i=n; //initiatize
		while(i>=1) //condition
		{
			f=f*i;
			i--; //increment/decrement
		}
		System.out.print("factorial : "+f);
	}

}
