package If_Else;

import java.util.Scanner;

public class LoanInterestEMI {

	public static void main(String[] args) {
		double n,emi,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount");
		n=sc.nextDouble();  //n=loan amount
		
		if(n<100000)
		{
			si=(n*0.09*5)/100;
		}
		else if(n>=100000 && n<1000000)
		{
			si=(n*0.07*5)/100;
			
		}
		else
		{
			si=(n*0.05*5)/100;
		}
		emi=(n+si)/(12*5);
		System.out.println("si= "+si);
		System.out.println("emi= "+emi);
	}

}
