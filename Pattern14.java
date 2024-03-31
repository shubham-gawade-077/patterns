package javapattern;

public class Pattern14 
{
	public static void main(String[] args)
	{
		int r=5;
		int c=5;
		int n;
		for(int i=1;i<=r;i++)
		{
			n=c-i+1;
			for(int j=1;j<=c;j++)
			{
				System.out.print(" "+n);
				n=n+c;
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