package While_loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr number");
		int n=sc.nextInt();
		
		while(n>0)
		{
			int n1=n%10;
			    n=n/10;
			 sum=(sum*10)+n1;   
		}
		System.out.println("Reverse= "+sum);
	}

}
