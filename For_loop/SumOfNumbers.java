package For_loop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of 1 to "+n+" = "+sum);
	}

}
