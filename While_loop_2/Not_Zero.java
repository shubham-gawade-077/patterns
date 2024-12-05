package While_loop_2;

import java.util.Scanner;

public class Not_Zero {
a
	public static void main(String[] args) 
	{
		int n1;
		int div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			int n=i;
			div=0;
			
			while(n>0)
			{
				 n1=n%10;
				 n=n/10;
			
			
			if(n1==0)
			{
				div=1;
				
			}
			
			
			if(div==0)
			{
				System.out.print(i+",");
			}
		
			}
		}
	}

}
