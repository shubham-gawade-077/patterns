package javapattern_51_100;

public class Pattern6_100 {

	public static void main(String[] args) 
	{int a;
		for(int i=1;i<=5;i++)
		{
			a=i;
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 100
 
            1
	      2 1
	    3 2 1
	  4 3 2 1
	5 4 3 2 1

  */