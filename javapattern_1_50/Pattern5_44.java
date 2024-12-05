package javapattern_1_50;

public class Pattern5_44 {
public static void main(String[] args) 
	{
	int a;
	for(int i=1;i<=4;i++)
	{
		a=(i*(i+1)/2);
		for(int j=1;j<=i;j++)
		{
			System.out.print(a+" ");
			a--;
		}
		System.out.println();
		}
	}
}

  /*
 Pattern 44

 1
 3 2
 6 5 4
 10 9 8 7
  */