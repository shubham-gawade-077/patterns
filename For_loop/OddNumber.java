package For_loop;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2)
		{
			System.out.print(" "+i);
		}
	}

}
