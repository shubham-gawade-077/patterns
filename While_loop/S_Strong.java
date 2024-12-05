package While_loop;

import java.util.Scanner;

public class S_Strong {

	public static void main(String[] args) 
	{
		int sum=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Strong number series:");
		for
		(int i=1;i<=range;i++)
		{
			n=i;
			sum=0;
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				int f1=1;
				for(int j=n1;j>1;j--)
				{
					f1=f1*j;
				}
				sum=sum+f1;
			}
			if(sum==i)
			{
				System.out.print(i+",");
			}
		}
		
	}

}
