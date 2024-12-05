package javapattern_51_100;

public class Pattern2_66 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 66
 
 A
 A B
 A B C
 A B C D
 A B C D E
 
  */