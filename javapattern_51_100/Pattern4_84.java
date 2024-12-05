package javapattern_51_100;

public class Pattern4_84 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 84
 
 0 1 0 1 0
 0 1 0 1
 0 1 0
 0 1
 0

  */