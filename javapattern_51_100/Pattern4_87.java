package javapattern_51_100;

public class Pattern4_87 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 87
 
 A A A A A
 B B B B
 C C C
 D D
 E

  */