package Switch_Case;

import java.util.Scanner;

public class MaxNumFrom2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is maxi");
		}
		else if(b>a)
		{
			System.out.println(b+" is max");
		}
		else
		{
			System.out.println("both aare equal");
		}
	}

}
