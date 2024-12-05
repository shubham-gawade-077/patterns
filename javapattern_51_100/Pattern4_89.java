package javapattern_51_100;

public class Pattern4_89 {

	public static void main(String[] args)
    {
		for(int i=5;i>=1;i--)
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
 Pattern 89
 
 E E E E E
 D D D D
 C C C
 B B
 A 

  */