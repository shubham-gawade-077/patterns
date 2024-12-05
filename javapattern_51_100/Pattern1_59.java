package javapattern_51_100;

public class Pattern1_59 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 59
 
 1
 0 0
 1 1 1
 0 0 0 0
 1 1 1 1 1
 
  */