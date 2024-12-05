package javapattern_51_100;

public class Pattern4_82 {

	public static void main(String[] args) 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 82
 
 0 0 0 0 0
 1 1 1 1
 0 0 0
 1 1
 0

  */