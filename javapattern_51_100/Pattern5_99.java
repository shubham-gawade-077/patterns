package javapattern_51_100;

public class Pattern5_99 {

	public static void main(String[] args)
	{
		int a;
		for(int i=5;i>=1;i--)
		{
			a=i;
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++)
			{
				
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 99
 
            5
	      4 5
	    3 4 5
	  2 3 4 5
	1 2 3 4 5

  */