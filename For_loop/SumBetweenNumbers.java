package For_loop;

import java.util.Scanner;

public class SumBetweenNumbers {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		System.out.println("Enter thr y");
		int y=sc.nextInt();
		
		for(int i=x;i<=y;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum from "+x+" to "+y+" is "+sum);
	}

}
