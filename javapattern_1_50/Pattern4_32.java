package javapattern_1_50;

public class Pattern4_32 {
public static void main(String[] args) 
	{
	int a=1;
		for(int i=1;i<=5;i++)
		{
			a=i;
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(a+64)+" ");
				a+=5;
			}
			System.out.println();
		}
	}
}

  /*
 Pattern 32 

 A F K P U
 B G L Q U
 C H M R W
 D I N S X
 E J O T Y
  */