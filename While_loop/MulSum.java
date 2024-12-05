package While_loop;

import java.util.Scanner;

public class MulSum {

	public static void main(String[] args) 
	{
		int sum=0;
		int n1;
		int a=0;
		int z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();//1234
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		n=sum;//4321
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			
			int b=a*n1;
			z=z+b;
			a=n1;
			
		}
		System.out.println(z);
	}

}
