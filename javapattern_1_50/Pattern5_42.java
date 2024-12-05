package javapattern_1_50;

public class Pattern5_42 {
public static void main(String[] args)
	{int a;
		for(int i=1;i<=5;i++)
		{
			a=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 42

 1
 2 3
 3 4 5
 4 5 6 7
 5 6 7 8 9
  */