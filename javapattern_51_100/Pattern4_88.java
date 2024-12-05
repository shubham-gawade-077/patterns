package javapattern_51_100;

public class Pattern4_88 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 88
 
 A B C D E
 A B C D
 A B C
 A B
 A

  */