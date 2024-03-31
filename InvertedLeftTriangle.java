package Pyaramid;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=0;k<=(n-i)*2;k++)
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

}//wrong
/*
	* * * * *
	  * * * *
	    * * *
	      * *  
	        *
*/