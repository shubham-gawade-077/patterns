package javapattern_51_100;

public class Pattern1_54 {
public static void main(String[] args) 
	{
	int a=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((a-i)+" ");
				
				a++;
			}
			System.out.println();
			
		}
	}
}

  /*
 Pattern 54
   
 1
 1 2
 2 3 4
 4 5 6 7
 7 8 9 10 11
   */
