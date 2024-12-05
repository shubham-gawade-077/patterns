package javapattern_1_50;

public class Pattern2_17 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((2*(i+j))-3+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 17

 1 3 5 7 9
 3 5 7 9 11
 5 7 9 11 13
 7 9 11 13 15
 9 11 13 15 17
  */