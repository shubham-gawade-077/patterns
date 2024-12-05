package If_Else;

import java.util.Scanner;

public class BalncAndWithdAmount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		double b=sc.nextDouble();
		
		System.out.println("Enter the withdrawal");
		double w=sc.nextDouble();
		
		if(w>b){
			System.out.println("Insuffisient balance");
	
		}
		else {
			System.out.println("balance= "+(b-w));
		}

	}

}
