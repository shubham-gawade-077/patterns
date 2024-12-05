package javapattern_51_100;

public class Pattern2_62 {

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 62
 
 0
 0 1
 0 1 0
 0 1 0 1
 0 1 0 1 0
 0 1 0 1 0 1
 
  */