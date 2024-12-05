package javapattern_51_100;

public class Pattern2_61 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 61
 
 1
 1 0
 1 0 1
 1 0 1 0
 1 0 1 0 1
 
  */