package javapattern_1_50;

public class Pattern5_45 {
public static void main(String[] args) 
	{
	int a=1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 45

 1
 3 5
 7 9 11
 13 15 17 19
 21 23 25 27 29 
   */


