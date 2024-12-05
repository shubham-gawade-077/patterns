package javapattern_1_50;

public class Pattern4_36 {
public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	/*
	int a;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				a=j;
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		*/
	}
}

  /*
 Pattern 36

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
  */