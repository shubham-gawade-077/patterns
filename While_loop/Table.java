package While_loop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=10)
		{
			int a=n*i;
			System.out.println(n+" * "+i+" = "+a);
			i++;
		}
	}

}
