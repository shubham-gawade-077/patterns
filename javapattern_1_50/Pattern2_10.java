package javapattern_1_50;

public class Pattern2_10 
{
	public static void main(String[] args) 
	{
		int n=5;
		int m=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(j+" "+i+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 10
 
 1 1 2 1 3 1 
 1 2 2 2 3 2
 1 3 2 3 3 3
 1 4 2 4 3 4
 1 5 2 5 3 5
  */