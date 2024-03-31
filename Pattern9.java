package javapattern;

public class Pattern9 
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+i*j);
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 9
 
 1 2 3 4 5
 2 4 6 8 10
 3 6 9 12 15
 4 8 12 16 20
 5 10 15 20 25
  */
