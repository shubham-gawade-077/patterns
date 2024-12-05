package javapattern_1_50;

public class Pattern5_47 {
public static void main(String[] args) 
	{
	int a;
		for(int i=1;i<=5;i++)
		{
			a=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print((a*j)+" ");
				
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 47
 
 1 
 2 4
 3 6 9
 4 8 12 16
 5 10 15 20 25
  */