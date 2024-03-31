package Pyaramid;

public class InvertedPyramid {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
           * * * * * 
 		    * * * *
 		     * * * 
 		      * *
 		       * 
*/