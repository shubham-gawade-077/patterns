package If_Else;

import java.util.Scanner;

public class LightBill {

	public static void main(String[] args) {
		int unit;
		double uc,electricity_charge=0.0,ec,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit");
		unit=sc.nextInt();
		
		if(unit<=100)
		{
			electricity_charge=unit*3.44;
			System.out.println("electricity charge= "+electricity_charge);
		}
		else if(unit>=101 && unit<=300)
		{
			electricity_charge=unit*7.34;
			System.out.println("electricity charge= "+electricity_charge);
			
		}
		else if(unit>=301 && unit<=500)
		{
			electricity_charge=unit*10.36;
			System.out.println("electricity charge= "+electricity_charge);
			
		}
		else if(unit>=501 && unit<=1000)
		{
			electricity_charge=unit*12.82;
			System.out.println("electricity charge= "+electricity_charge);
			
		}
		else
		{
			electricity_charge=unit*11.92;
			System.out.println("electricity charge= "+electricity_charge);
		}
		uc=unit*1.38;
		ec=((102+electricity_charge+uc)*0.16);
		total=electricity_charge+uc+ec;
		
		System.out.println("unit charge= "+uc);
		System.out.println("tax= "+ec);
		System.out.println("total bill= "+total);
	}

}
