package While_loop_2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		int sum=0,p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0)
		{
			int n1=n%10;
			 n=n/10;
			 sum=sum+(n1*p);
			 p=p*2;
		}
		System.out.println("Decimal= "+sum);
	}

}
