package javapattern_51_100;

public class Pattern2_68 {

	public static void main(String[] args) 
	{
		for(char i=5;i>=1;i--)
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
 Pattern 68
 
 E
 D D
 C C C
 B B B B
 A A A A A
 
  */