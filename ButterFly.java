package Pyaramid;

public class ButterFly {

	public static void main(String[] args) {
		int n=5;
		
		//upper part
		for(int i=1;i<=n;i++)
		{
			for(int j=1;i<=i;i++)
			{
				System.out.print("* ");
			}
			int x=2*(n-i);
			for(int k=1;k<=x;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("* ");
				
			}
			
		    System.out.println();
		}
		//lower part
		for(int i=n;i>=1;i--)
		{
			for(int j=1;i<=i;i++)
			{
				System.out.print("* ");
			}
			int x=2*(n-i);
			for(int k=1;k<=x;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{					
				System.out.print("* ");
			}
					
		    System.out.println();
		}
				
	}

}
/* 
	*                 *
	* *             * *
	* * *         * * *
	* * * *     * * * *
	* * * * * * * * * *
	* * * * * * * * * *
  	* *	* *     * * * *
	* * *         * * *
	* *             * *
	*                 *
	                
*/