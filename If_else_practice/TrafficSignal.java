package If_else_practice;

import java.util.Scanner;

public class TrafficSignal 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the traffic colour");
		String colour=sc.nextLine();
		 if(colour.equals("red"))
		 {
			 System.out.println("Stop");
		 }
		 else if(colour.equals("yellow"))
		 {
			 System.out.println("Go slow");
		 }
		 else if(colour.equals("green"))
		 {
			 System.out.println("Go fast");
		 }
		 else
		 {
			 System.out.println("plz enter valid colour");
		 }
	}

}
