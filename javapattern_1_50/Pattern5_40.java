package javapattern_1_50;

public class Pattern5_40 {
public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((2*j)+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 40

 2
 2 4
 2 4 6
 2 4 6 8
 2 4 6 8 10
  */