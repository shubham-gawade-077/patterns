package While_loop;

import java.util.Scanner;

public class Sum_First_Last_Digit {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int first=0;
		int last=n%10;
		while(n>0)
		{
			 first=n;
			n=n/10;
		}
		sum=first+last;
		System.out.println(sum);
	}

}
