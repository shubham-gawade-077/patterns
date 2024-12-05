package javapattern_1_50;

public class Pattern4_39 {
public static void main(String[] args) 
	{
	int a;
		for(int i=5;i>=1;i--)
		{
			a=i;
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
 Pattern 39

 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
  */