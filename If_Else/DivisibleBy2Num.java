package If_Else;

import java.util.Scanner;

public class DivisibleBy2Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%7==0 && n%5==0)
		{
			System.out.println(n+" is divisible by 5 and 7");
		}
		else
		{
			System.out.println(n+" is not divisible by 5 and 7");
		}
}

}
