package Pyaramid;

public class DoubleHill {

	public static void main(String[] args) {
		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k1=n+n-2;k1>=x;k1--)
			{
				System.out.print(" "); 	
			}
			for(int j1=1;j1<=i;j1++ )
			{
				System.out.print("* ");
			}
			x+=2;
			System.out.println();
		}
	}

}
/*
         *       *   
 	    * *     * *
 	   * * *   * * *
 	  * * * * * * * *
 	 * * * * * * * * *
*/