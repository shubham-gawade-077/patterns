package While_loop;

import java.util.Scanner;

public class S_Armstrong {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Armstrong series:");

		for(int i=1;i<=range;i++)
		{
			sum=0;
			int n=i;
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				sum=sum+(n1*n1*n1);
			}
			if(sum==i)
			{
				System.out.print(i+",");
			}
		}

	}

}
