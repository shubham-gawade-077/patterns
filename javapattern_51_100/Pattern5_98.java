package javapattern_51_100;

public class Pattern5_98 {

	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 98
 
            5
	      4 4
	    3 3 3
	  2 2 2 2
	1 1 1 1 1

  */