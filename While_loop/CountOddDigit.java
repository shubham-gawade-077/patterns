package While_loop;

import java.util.Scanner;

public class CountOddDigit {

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
			
			if(n1%2!=0)
			{
				count++;
			}
		}
		System.out.println("No.of odd digit= "+count);
	}

}
