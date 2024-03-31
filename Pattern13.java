package javapattern;

public class Pattern13 
{
	public static void main(String[] args)
	{
		int r=5;
		int c=5;
		int x;
		int y;
	
		for(int i=1;i<=5;i++)
		{
			x=i;
			y=c-i+1;
			for(int j=1;j<=c;j++)
			{
				if(j%2==1)
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
 Pattern 13

 1 10 11 20 21
 2 9 12 19 22
 3 8 13 18 23
 4 7 14 17 24
 5 6 15 16 25
  */