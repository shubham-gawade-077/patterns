package general_Pattern;

public class EvenAlphabet 
{

	public static void main(String[] args) 
	{
		for(char i='A';i<='Z';i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
