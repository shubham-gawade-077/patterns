package While_loop;

import java.util.Scanner;

public class TwinsPrime {

	public static void main(String[] args)
	{
		
		int div=0,div1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		
		System.out.println("Enter the b");
		int b=sc.nextInt();
		
			for(int j=2;j<=(a/2);j++)
			{
				
				if(a%j==0)
				{
					div=1;
					break;
				}
			}
			for(int k=2;k<=(b/2);k++)
			{
				
				if(b%k==0)
				{
					div=1;
					break;
				}
			}
		
			if((div==0 && div1==0 )&&(a-b==-2||a-b==2))
			{
				System.out.println("Twins prime");
			}
			else if(div==0 && div1==0  )
			{
				System.out.println("prime but not twins");
			}
			
			else
			{
				System.out.println("not prime");
			}
		
	}

}
