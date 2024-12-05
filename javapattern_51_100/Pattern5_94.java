package javapattern_51_100;

public class Pattern5_94 {

	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+a)+" ");
				a++;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 94
 
 A 
 B C 
 D E F
 G H I J
 K L M N O

  */