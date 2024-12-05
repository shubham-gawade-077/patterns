package javapattern_1_50;

public class Pattern5_41 {
public static void main(String[] args)
	{
	int a=1;
		for(int i=1;i<=5;i++)
		{
			
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
 Pattern 41

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15 
  */