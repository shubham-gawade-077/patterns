package If_Else;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		double amt,commi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		amt=sc.nextDouble();
		if(amt<5000)
		{
			System.out.println("No commision");
		}
		else if(amt<10000 && amt>=5000)
		{
			commi=200+amt*(0.03);
			System.out.println("commision= "+commi);
			
		}
		else if(amt>=10000 && amt<20000)
		{
			commi=250+amt*(0.05);
			System.out.println("commision= "+commi);
			
		}
		else if(amt>=20000 && amt<3000)
		{
			commi=300+amt*(0.09);
			System.out.println("commision= "+commi);
			
		}
		else if(amt>=30000 && amt<40000)
		{
			commi=325+amt*(0.12);
			System.out.println("commision= "+commi);
			
		}
		else if(amt>=40000 && amt<50000)
		{
			commi=370+amt*(0.14);
			System.out.println("commision= "+commi);
			
		}

		else
		{
			commi=375+amt*(0.16);
			System.out.println("commision= "+commi);

		}

	}

}
