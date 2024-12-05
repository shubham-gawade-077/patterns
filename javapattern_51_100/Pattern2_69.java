package javapattern_51_100;

public class Pattern2_69 {

	public static void main(String[] args) 
	{
		char a='A';
		for(char i='A';i<='E';i++)
		{
			a=i;
			for(char j='A';j<=i;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}

  /*
 Pattern 69
 
 A
 B A
 C B A
 D C B A
 E D C B A
 
  */