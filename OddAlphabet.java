package general_Pattern;

public class OddAlphabet 
{

	public static void main(String[] args)
	{
		//for(char i='A';i<='Z';i++)
		for(int i=1;i<=26;i++)
		{
			if(i%2!=0)
			{
				//System.out.print(i+",");
				System.out.print((char)(i+64)+",");  //65=A
			}
		}
	}

}
