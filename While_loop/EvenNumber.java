package While_loop;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			
			if(i%2==0)
			{
				System.out.print(i+",");
				
			}
			i++;
		}
	}

}
