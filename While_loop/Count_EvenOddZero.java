package While_loop;

import java.util.Scanner;

public class Count_EvenOddZero {

	public static void main(String[] args) 
	{
		int n1;
		int odd=0,even=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			
			if(n1==0)
			{
				zero++;
			}
			else if(n1%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("no.of zero digit= "+zero);
		System.out.println("no.of even digit= "+even);
		System.out.println("no.of odd digit= "+odd);
	}

}
