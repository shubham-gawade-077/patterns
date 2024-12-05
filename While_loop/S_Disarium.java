package While_loop;

import java.util.Scanner;

public class S_Disarium {
a
	public static void main(String[] args) 
	{
		int sum=0;
		int digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		
		System.out.println("Disarium number series:");
		for(int i=1;i<=range;i++)
		{
			int n=i;
			int num=i;
			digit=0;
			while(num>0)
			{
				digit++;
				num=num/10;
			}
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				int f1=1;
				for(int j=1;j<=digit;j++)
				{
					f1=f1*n1;
				}
				digit--;
				sum=sum+f1;
			}
			if(sum==i)
			{
				System.out.print(i+",");
			}
		}
	}

}
