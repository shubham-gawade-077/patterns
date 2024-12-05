package Switch_Case;

import java.util.Scanner;

public class MixOperation4 {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" 1.max from 2 number\n 2.loss or profit\n 3.Quadrant\n 4.Bank money(ATM)");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" enter 2 numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a>b)
				{
					System.out.println(a+" is max");
				}
				else if(b>a)
				{
					System.out.println(b+" is max");
				}
				else
				{
					System.out.println("both are equal");
				}
				break;
				
			case 2:
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

				break;
				
			case 3:
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

				break;
				
			case 4:
				System.out.println("Enter the balance");
				double b1=sc.nextDouble();
				
				System.out.println("Enter the withdrawal");
				double w=sc.nextDouble();
				
				if(w>b1){
					System.out.println("Insuffisient balance");
			
				}
				else {
					System.out.println("balance= "+(b1-w));
				}


				break;
				
				default:
					System.out.println("invalid choice");
			}
		}
		while(ch<=4);
	}

}
