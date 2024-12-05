package While_loop;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args)
	{
		int sum=0;
		int digits=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p=n;
		int num=n;
		
		while(num>0)
		{
			digits++;
			num=num/10;
		}
		while(n>0)
		{
			int n1=n%10;
			n=n/10;
			int f1=1;
			for(int i=1;i<=digits;i++)
			{
				f1=f1*n1;
			}
			digits--;
			sum=sum+f1;
		}
		if(sum==p)
		{
			System.out.println("Disarium Number");
		}
		else
		{
			System.out.println("not Disarium Number");

		}
	}

}
