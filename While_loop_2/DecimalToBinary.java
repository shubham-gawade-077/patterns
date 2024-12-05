package While_loop_2;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		int p=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		while(n>0)
		{
			int n1=n%2;
			 n=n/2;
			 sum=sum+(n1*p);
			 p=p*10;
		}
		System.out.println("binary= "+sum);
	}

}
