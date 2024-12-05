package While_loop;

import java.util.Scanner;

public class StrongOrKrishnmurthy {

	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p=n;
		while(n>0)
		{
			int n1=n%10;
			n=n/10;
			int f1=1;
			for(int i=n1;i>1;i--)
			{
				f1=f1*i;
			}
			sum=sum+f1;
		}
		if(sum==p)
		{
			System.out.println("Strong/Krishnmurthy number");
		}
		else
		{
			System.out.println("not Strong/Krishnmurthy number");
		}
	}

}
