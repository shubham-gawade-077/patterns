package javapattern_51_100;

public class Pattern2_65 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 65
 
 A
 B B
 C C C
 D D D D
 E E E E E
 
  */