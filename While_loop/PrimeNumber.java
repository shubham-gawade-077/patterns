package While_loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
			i++;
		}	
			if(div==0)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		
		
	}

}
