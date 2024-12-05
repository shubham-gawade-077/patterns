package javapattern_51_100;

public class Pattern3_76 {

	public static void main(String[] args) 
	{
		int a;
		for(int i=5;i>=1;i--)
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
 Pattern 76
 
 5 6 7 8 9
 4 5 6 7
 3 4 5
 2 3
 1

  */