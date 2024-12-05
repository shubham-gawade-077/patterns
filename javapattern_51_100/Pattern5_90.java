package javapattern_51_100;

public class Pattern5_90 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 90
 
 E D C B A
 E D C B
 E D C
 E D
 E 

  */