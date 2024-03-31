package Pyaramid;

public class Rhombus2 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
   * * * * * 
    * * * * * 
     * * * * * 
      * * * * * 
       * * * * * 

*/