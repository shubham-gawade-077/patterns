package javapattern_1_50;

public class Pattern5_43 {
public static void main(String[] args) 
	{
	int a;
	for(int i=1;i<=5;i++)
	{
		a=(i*2)-1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(a+" ");
			a+=2;
		}
		System.out.println();
	}
	}
}

  /*
 Pattern 43

 1
 3 5
 5 7 9
 7 9 11 13
 9 11 13 15 17
  */