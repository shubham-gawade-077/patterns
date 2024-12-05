package javapattern_51_100;

public class Pattern4_81 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 81
 
 1 1 1 1 1
 0 0 0 0
 1 1 1
 0 0
 1 

  */