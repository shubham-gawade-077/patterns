package javapattern;

public class Pattern18 
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(((i+j)%2)+" ");	
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 18

 0 1 0 1 0
 1 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1
 0 1 0 1 0
  */