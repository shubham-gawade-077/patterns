package While_loop;

import java.util.Scanner;

public class S_TwinPrime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Twin Prime series:");
		
		for(int i=3;i<=range;i++)
		{
			int a=i;
			int b=i+2;
			int div=0;
			int div1=0;
			for(int j=2;j<=(a/2);j++)
			{
				if(a%j==0)
				{
					div=1;
					break;
				}
			}
			for(int k=2;k<=(b/2);k++)
			{
				if(b%k==0)
				{
					div=1;
					break;
				}
			}
			if(div==0 && div1==0)
			{
				System.out.print(a+" and "+b+", ");
			}
		}
	
	}

}
