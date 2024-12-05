package javapattern_1_50;

public class Pattern2_19 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(((i+j)%2)+" ");	
			}
			System.out.println();
		}

	}
}

  /*
 Pattern 19

 1 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1
  */