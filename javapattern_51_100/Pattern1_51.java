package javapattern_51_100;

public class Pattern1_51 {
public static void main(String[] args) 
	{
	int a=15;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 51
 
 15
 14 13
 12 11 10
 9 8 7 6 
 5 4 3 2 1
   */
