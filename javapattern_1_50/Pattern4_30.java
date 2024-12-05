package javapattern_1_50;

public class Pattern4_30 {
public static void main(String[] args)	
	{
	int a=1;
		for(int i=1;i<=5;i++)
		{
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
 Pattern 30

 A B C D E
 F G H I J 
 K L M N O
 P Q R S T
 U V W X Y
  */