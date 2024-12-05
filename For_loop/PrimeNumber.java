package For_loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
			
		}
		if(div==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
