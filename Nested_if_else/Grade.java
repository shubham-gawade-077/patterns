package Nested_if_else;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m1 mark");
		int m1=sc.nextInt();
		
		System.out.println("enter the m2 mark");
		int m2=sc.nextInt();

		System.out.println("enter the m3 mark");
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		double per=total/3;
		System.out.println("total= "+total);
		System.out.println("percentage= "+per);
		
		if(m1>=40 && m2>=40 && m3>=40)
		{
			if(per>80 && per<=100)
			{
				System.out.println("distinction");
			}
			else if(per>70 && per<=80)
			{
				System.out.println("first class");
			}
			else if(per>60 && per<=70)
			{
				System.out.println("second class");
			}
			else if(per>50 && per<=60)
			{
				System.out.println("pass");
			}

		}
		else if(m1<40 && m2<40 && m3<40)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("ATKT fail");
		}
	}
}
