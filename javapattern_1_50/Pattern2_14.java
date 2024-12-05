package javapattern_1_50;

public class Pattern2_14 
{
	public static void main(String[] args)
	{
		int n;
		//for(int i=1;i<=5;i++)
		for(int i=5;i>=1;i--)
		{
			//n=5-i+1;
			n=i;
			for(int j=1;j<=5;j++)
			{
				System.out.print(n+" ");
				n=n+5;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 14

 5 10 15 20 25
 4 9 14 19 24
 3 8 13 18 23
 2 7 12 17 22
 1 6 11 16 21
  */