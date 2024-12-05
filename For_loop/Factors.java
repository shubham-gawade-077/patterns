package For_loop;

import java.util.Scanner;

class Factors {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.println(" factor is: "+i);
			}
		}
	}

}
