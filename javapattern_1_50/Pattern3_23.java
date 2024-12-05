package javapattern_1_50;

public class Pattern3_23 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
}
}

/*
 Pattern 23

 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
*/