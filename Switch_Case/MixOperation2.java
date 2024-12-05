package Switch_Case;

import java.util.Scanner;

public class MixOperation2 {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println(" 1.Even-Odd\n 2.divisible by 17\n 3.divisible by 5 & 7\n 4.divisible by 5 or 7\n 5.leap year or not\n 6.positive or negative\n 7.calculate electricity bill\n 8.age\n 9.discount\n 10.pin");
			System.out.println("Enter your choice");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the number");
				int n=sc.nextInt();
				if(n%2==0)
				{
					System.out.println("even number");
				}
				else if(n%2!=0)
				{
					System.out.println("odd number");
				}
				else
				{
					System.out.println("number is zero");
				}
				break;
			case 2:
				System.out.println("Enter the number");
				int n1=sc.nextInt();
				if(n1%17==0)
				{
					System.out.println("divisible by 17");
				}
				else
				{
					System.out.println("not divisible by 17");
				}
				break;
			case 3:
				System.out.println("Enter the number");
				int n2=sc.nextInt();
				if(n2%5==0 && n2%7==0)
				{
					System.out.println("divisible by 5 and 7");
				}
				else
				{
					System.out.println("not divisible by 5 and 7");
				}
				break;
			case 4:
				System.out.println("Enter the number");
				int n3=sc.nextInt();
				if(n3%5==0 || n3%7==0)
				{
					System.out.println("divisible by 5 or 7");
				}
				else
				{
					System.out.println("not divisible by 5 or 7");
				}
				break;
			case 5:
				System.out.println("Enter the number");
				int n4=sc.nextInt();
				if(n4%4==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
				break;
			case 6:
				System.out.println("Enter the number");
				int n5=sc.nextInt();
				if(n5>0)
				{
					System.out.println("positive number");
				}
				else if(n5<0)
				{
					System.out.println("negative number");
				}
				else
				{
					System.out.println("zero");
				}
				break;
			case 7:
				int unit;
				double uc,electricity_charge=0.0,ec,total;
				
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

				break;
			case 8:
				System.out.println("Enter the age");
				int n6=sc.nextInt();
				int age=n6*365;
				System.out.println("age in days= "+age);
				break;
			case 9:
				double amt,disc,totall;
				System.out.println("Enter the amount");
				amt=sc.nextDouble();
				
				if(amt<10000)
				{
					System.out.println("No discount");
				}
				else if(amt>=10000 && amt<=20000)
				{
					disc=amt*0.05;
					totall=amt-disc;
					System.out.println("amount= "+amt+" discount= "+disc+" total= "+totall);
					
				}
				else if(amt>=20000 && amt<50000)
				{
					disc=amt*0.07;
					totall=amt-disc;
					System.out.println("amount= "+amt+" discount= "+disc+" total= "+totall);
					
				}

				else
				{
					disc=amt*0.10;
					totall=amt-disc;
					System.out.println("amount= "+amt+" discount= "+disc+" total= "+totall);
					
				}
				break;
			case 10:
				System.out.println("Enter the pin");
				int pin=sc.nextInt();
				if(pin==1234)
				{
					System.out.println("pin is correct....you can withdrawal the money");
				}
				else {
					System.out.println("pin is incorrect....plz enter correct pin");
				}
				
				break;
			default:
				System.out.println("Invalid choice");
			}
			
			
		}while(ch<=10);
	}

}
