package javapattern_51_100;

public class Pattern3_75 {

	public static void main(String[] args)
	{
		int a;
		for(int i=1;i<=5;i++)
		{
			a=4+i;
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 75
 
 5 4 3 2 1
 6 5 4 3
 7 6 5
 8 7
 9 

  */