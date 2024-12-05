package If_Else;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		
		System.out.println("Enter the b");
		int b=sc.nextInt();
		
		System.out.println("Enter the c");
		int c=sc.nextInt();

		    if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b))
		    {
			System.out.println(":Right angled triangle");
		    
		    }
			else if((a==b) && (b==c))
			{
			System.out.println("Equilateral triangle");
			}
			else if((a==b) || (b==c) || (c==a))
				{
				System.out.println("Isosceles");
				}
			else if((a!=b&& b==c && c!=a))
			{
				System.out.println("Scalene");
			}
			else
			{
				System.out.println("no triangle");
			}


	}

}
