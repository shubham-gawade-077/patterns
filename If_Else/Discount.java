package If_Else;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		double amt,disc,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		amt=sc.nextDouble();
		
		if(amt<10000)
		{
			System.out.println("No discount");
		}
		else if(amt>=10000 && amt<=20000)
		{
			disc=amt*0.05;
			total=amt-disc;
			System.out.println("amount= "+amt+" discount= "+disc+" total= "+total);
			
		}
		else if(amt>=20000 && amt<50000)
		{
			disc=amt*0.07;
			total=amt-disc;
			System.out.println("amount= "+amt+" discount= "+disc+" total= "+total);
			
		}

		else
		{
			disc=amt*0.10;
			total=amt-disc;
			System.out.println("amount= "+amt+" discount= "+disc+" total= "+total);
			

		}

	}

}
