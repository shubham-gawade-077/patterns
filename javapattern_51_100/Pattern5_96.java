package javapattern_51_100;

public class Pattern5_96 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 96
 
            1
	      2 2
	    3 3 3
	  4 4 4 4
	5 5 5 5 5

  */