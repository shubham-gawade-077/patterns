package If_Else;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first subject mark");
		int a=sc.nextInt();
		
		System.out.println("Enter the second subject mark");
		int b=sc.nextInt();
		
		System.out.println("Enter the third subject mark");
		int c=sc.nextInt();
		
		int total=a+b+c;
		int per=total/3;
		System.out.println("total= "+total);
		System.out.println("percentage= "+per);
		System.out.print("class : ");
		if(a>=50 && b>=50 && c>=50)
		{
			if(per>=80 && per<=100)
			{
				System.out.println("first class with Distinction");
			}
			else if(per>=70 && per<=79)
			{
				System.out.println("first class");
			}
			else if(per>=60 && per<=69)
			{
				System.out.println("second class");
			}
			else if(per>=50 && per<=59)
			{
			System.out.println("pass with third class");
			}
		}
		else if(a>=50 && b>=50 && c>=50)
		{
			System.out.println("fail");
		}
		else 
		{
			System.out.println(" ATKT fail");
		}


	}

}
