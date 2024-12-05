package javapattern_51_100;

public class Pattern5_95 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 95
 
            *
	      * *
	    * * *
	  * * * *
	* * * * * 

  */