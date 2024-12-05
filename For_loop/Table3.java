package For_loop;

import java.util.Scanner;

public class Table3 {

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		a=n;
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(a);
			a+=n;
		}
	}

}
