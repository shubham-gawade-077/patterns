package If_Else;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		System.out.println("Enter the y");
		int y=sc.nextInt();
		
		if(x>0 && y>0)
		{
			System.out.println(x+" and "+y+" are on Quadrant 1");
		}
		else if(x>0 && y<0)
		{
			System.out.println(x+" and "+y+" are on Quadrant 2");

		}
		else if(x<0 && y<0)
		{
			System.out.println(x+" and "+y+" are on Quadrant 3");

		}
		else if(x<0 && y>0)
		{
			System.out.println(x+" and "+y+" are on Quadrant 4");

		}
		else if(x>0 && y==0)
		{
			System.out.println(x+" is on +x axis");

		}
		else if(x<0 && y==0)
		{
			System.out.println(x+" is on -x axis");

		}
		else if(x==0 && y>0)
		{
			System.out.println(x+"is on +y axis");

		}
		else if(x==0 && y<0)
		{
			System.out.println(x+"is on -y axis");

		}
		else 
		{
			System.out.println(x+" and "+y+" are on origin");

		}

	}

}
