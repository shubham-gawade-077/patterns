package If_Else;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary");
		double bs=sc.nextDouble();
		
		if(bs<150000)
		{
			System.out.println("no tax");
		}
		else if(bs>150000 && bs<300000)
		{
			double tax=bs*0.05;
			System.out.println("tax= "+tax);
		}
		else 
		{
			double tax=bs*0.07;
			System.out.println("tax= "+tax);
		}

	}

}
