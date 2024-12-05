package javapattern_51_100;

public class Pattern5_97 {

	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 97
 
            1
	      1 2
	    1 2 3
	  1 2 3 4
	1 2 3 4 5 

  */