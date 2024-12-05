package While_loop;

import java.util.Scanner;

public class S_magic {

	public static void main(String[] args) 
	{
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Magic number series:");
		for(int i=1;i<=range;i++)
		{
			int n=i;
			while(n>9)
			{
				sum=0;
				while(n>0)
				{
					int n1=n%10;
					n=n/10;
					sum=sum+n1;
				}
				n=sum;
			}
			if(n==1)
			{
				System.out.print(i+",");
			}
		}
	}

}
