package javapattern_1_50;

public class Pattern4_31 {
public static void main(String[] args) 
	{
	int a=1;
		for(int i=1;i<=5;i++)
		{
			a=i;
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(a+64)+" ");
				a++;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 31

 A B C D E
 B C D E F
 C D E F G 
 D E F G H
 E F G H I
  */