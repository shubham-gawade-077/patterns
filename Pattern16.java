package javapattern;

public class Pattern16 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i+j-1)+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 16

 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7 
 4 5 6 7 8
 5 6 7 8 9
  */