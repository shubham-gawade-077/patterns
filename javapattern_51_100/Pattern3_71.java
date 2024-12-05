package javapattern_51_100;

public class Pattern3_71 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 71
 
 1 1 1 1 1
 2 2 2 2
 3 3 3
 4 4
 5 
 
  */