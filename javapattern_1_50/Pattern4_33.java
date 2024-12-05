package javapattern_1_50;

public class Pattern4_33 {
public static void main(String[] args)
	{
	int a=1;
	for(int i=5;i>=1;i--)
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
 Pattern 33

 E J O T Y
 D I N S X
 C H M R W
 B G L Q V
 A F K P U
  */