package Numbersss;

import java.util.Scanner;

public class DisariumNumber2 {//reverse method

	public static void main(String[] args)
	{
		int sum=0;
		int a=0;
		int power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int p=n;
		int num;
		while(n>0)
		{
			int n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		 num=sum;
		while(num>0)
		{
			int n2=num%10;
			num=num/10;
		
			int p1=1;
			for(int i=1;i<=power;i++)
			{
				p1=p1*n2;
			}
			power++;
			a=a+p1;
		}
	   if(a==p)
	   {
		   System.out.println("Disarium number");
	   }
	   else
	   {
		   System.out.println("not Disarium number");
	   }
	}

}
