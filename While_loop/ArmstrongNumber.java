package While_loop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();//153
		int p=n;
		while(n>0)
		{
			int n1=n%10;
			    n=n/10;
			    sum=sum+(n1*n1*n1);
		}
		if(sum==p)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}
