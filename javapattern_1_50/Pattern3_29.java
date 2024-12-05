package javapattern_1_50;

public class Pattern3_29 {
public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 29

 E D C B A
 E D C B A
 E D C B A
 E D C B A
 E D C B A
  */