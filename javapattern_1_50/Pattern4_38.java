package javapattern_1_50;

public class Pattern4_38 {
public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 38

 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
  */