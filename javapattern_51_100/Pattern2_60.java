package javapattern_51_100;

public class Pattern2_60 {

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 60
 
 0
 1 1 
 0 0 0
 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1 1
 
  */