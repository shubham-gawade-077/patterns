package javapattern_51_100;

public class Pattern3_77 {

	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			
		}
	}

}

  /*
 Pattern 77
 
  1  2  3 4 5
  6  7  8 9
 10 11 12
 13 14 
 15

  */