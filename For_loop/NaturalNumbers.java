package For_loop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) 
	{
//		for(int i=1;i<=100;i++)
//		{
//			System.out.print(" "+i);
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+i);
		}
	}

}
