package For_loop;

import java.util.Scanner;

public class GCD_LCM {//Greatest common divisor
					 //Least common multiple
	public static void main(String[] args)
	{
		int gcd=0,lcm,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		
		System.out.println("Enter the b");
		int b=sc.nextInt();
		
		if(a<b)
		{
			n=a;
		}
		else
		{
			n=b;
		}
		for(int i=1;i<=n;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		
		}
		lcm=(a*b)/gcd;
		System.out.println("gcd="+gcd+" lcm="+lcm);
	}

}
