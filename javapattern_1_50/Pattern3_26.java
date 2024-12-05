package javapattern_1_50;

public class Pattern3_26 {
public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		/*
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
	}
}

  /*
 Pattern 26

 A A A A A 
 B B B B B
 C C C C C
 D D D D D
 E E E E E
  */