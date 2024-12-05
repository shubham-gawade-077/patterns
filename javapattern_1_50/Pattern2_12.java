package javapattern_1_50;

public class Pattern2_12 
{
	public static void main(String[] args)
	{
		int row=5;
		int col=5;
		int n;
		for(int i=1;i<=row;i++)
		{
			n=i;
			for(int j=1;j<=col;j++)
			{
				System.out.print(n+" ");
				n+=5;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 12

 1 6 11 16 21
 2 7 12 17 22
 3 8 13 18 23
 4 9 14 19 24
 5 10 15 20 25
  */