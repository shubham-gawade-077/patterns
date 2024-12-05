package javapattern_51_100;

public class Pattern3_74 {

	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=6-i;j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 74
 
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5

  */