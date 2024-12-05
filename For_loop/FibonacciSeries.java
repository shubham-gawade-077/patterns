package For_loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int f1=0,f2=1,f3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid number");
		}
		else if(n==1)
		{
			System.out.println(f1);
		}
		else
		{
			System.out.println(f1+"\n"+f2);
			
			for(int i=3;i<=n;i++)
			{
				f3=f1+f2;
				System.out.println(f3);
				f1=f2;
				f2=f3;
			}
		}
	}

}
