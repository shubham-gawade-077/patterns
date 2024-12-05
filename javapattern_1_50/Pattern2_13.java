package javapattern_1_50;

public class Pattern2_13 //difficult
{
	public static void main(String[] args)
	{
		int x;
		int y;
	
		for(int i=1;i<=5;i++)
		{
			x=i;
			y=5-i+1;
			for(int j=1;j<=5;j++)
			{
				if(j%2==1)
				{
					System.out.print(x+" ");
				
				}
				else
				{
					System.out.print(y+" ");
				}
				x=x+5;
				y=y+5;
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