package If_Else;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price");
		double cp=sc.nextDouble();
		
		System.out.println("Enter selling price");
		double sp=sc.nextDouble();
		
		if(cp>sp)
		{
			double amt=cp-sp;
			double dics=(amt/cp)*100;
			System.out.println("loss = "+amt+" percentage = "+dics);
		}
		else if(sp>cp)
		{
			double amt=sp-cp;
			double disc=(amt/cp)*100;
			System.out.println("profit = "+amt+" percentage = "+disc);
		}
		else
		{
			System.out.println("no profit no loss");
		}
	}

}
