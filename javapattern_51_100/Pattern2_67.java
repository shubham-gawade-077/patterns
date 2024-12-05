package javapattern_51_100;

public class Pattern2_67 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(70-j)+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 67
 
 E
 E D
 E D C
 E D C B 
 E D C B A
 
  */