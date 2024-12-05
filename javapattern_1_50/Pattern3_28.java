package javapattern_1_50;

public class Pattern3_28 {
public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 28

 E E E E E
 D D D D D
 C C C C C
 B B B B B
 A A A A A
  */