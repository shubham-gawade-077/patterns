package While_loop;

import java.util.Scanner;

public class S_PrimePalindrom {
a
	public static void main(String[] args) 
	{
		int div=0,div1=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		
		System.out.println("prime palindrom series:");
		for(int i=2;i<=range;i++)
		{
			int n=i;
			
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					div=1;
					break;
				}
			}
			
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				sum=(sum*10)+n1;
						
			}
			if(sum==i)
			{
				div1=1;
			}
			if(div==0&& div1==1)
			{
				System.out.print(i+",");
			}
		}

	}

}
