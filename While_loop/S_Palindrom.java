package While_loop;

import java.util.Scanner;

public class S_Palindrom {

	public static void main(String[] args) 
	{
		int sum=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Palindrom series:");

		for(int i=1;i<=range;i++)
		{
			n=i;
			sum=0;
			while(n>0)
			{
				int n1=n%10;
				n=n/10;
				sum=(sum*10)+n1;
			}
			if(sum==i)
			{
				System.out.print(i+",");
			}
		}
	}

}
