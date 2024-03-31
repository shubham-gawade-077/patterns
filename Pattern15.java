package javapattern;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		int r=5;
		int c=5;
		int x;
		int y;
		for(int i=1;i<=r;i++)
		{
			x=i;
			y=c-i+1;
			for(int j=1;j<=c;j++)
			{
				if(j%2==0)
				{
					System.out.print(" "+x);
				}
				else
				{
					System.out.print(" "+y);
				}
				x=x+c;
				y=y+c;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 15

 5 6 15 16 25
 4 7 14 17 24
 3 8 13 18 23
 2 9 12 19 22
 1 10 11 20 21
  */