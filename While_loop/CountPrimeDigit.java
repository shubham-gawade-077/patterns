package While_loop;

import java.util.Scanner;

public class CountPrimeDigit {

	public static void main(String[] args) 
	{
		int n1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0)
		{
		n1=n%10;
		n=n/10;
		
		if(n1==2 || n1==3 || n1==5 || n1==7)
		{
			count++;
		}
		}
		System.out.println("No.of prime digit= "+count);
	}

}
