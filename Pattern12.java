package javapattern;

public class Pattern12 
{
	public static void main(String[] args)
	{
		int r=5;
		int c=5;
		int n=1;
		for(int i=1;i<=r;i++)
		{
			n=i;
			for(int j=1;j<=c;j++)
			{
				System.out.print(" "+n);
				n+=c;
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