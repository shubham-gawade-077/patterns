package javapattern_1_50;

public class Pattern3_20
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(((i*j)%2)+" ");	
			}
			System.out.println();
		}

	}
}

  /*
 Pattern 20

 1 0 1 0 1
 0 0 0 0 0
 1 0 1 0 1
 0 0 0 0 0
 1 0 1 0 1
  */