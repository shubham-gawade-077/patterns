package While_loop;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args)
	{
		int sum=0,div=0,div1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p=n;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
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
		if(sum==p)
		{
			div1=1;
		}
		if(div==0 && div1==1)
		{
            System.out.println("Prime Palindrom");
		}
		else if(div==0)
		{
			System.out.println("Prime, Not Palindrom");
		}
		else if(div==1)
		{
			System.out.println("Not Prime, Palindrom");
		}
        else
        {
            System.out.println("Not Prime, Not Palindrom");
        }

	}

}
