package Switch_Case;

import java.util.Scanner;

public class MixOperation3 {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		do
		{
			System.out.println(" 1.first no is between Secod no and third no \n 2.min from 3 numbers\n 3.max from 2 number\n 4.ATKT\n 5.triangle \n 5.blood donation\n 6.Aptitude exam");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				if(a>b && c>a)
				{
					System.out.println(a +" is between "+ b +" and "+c);
					}
					else
					{
					System.out.println(a +" is not between "+ b +" and "+c);
					}

				break;
				
			case 2:
				if(a<b && a<c)
				{
					System.out.println(a+" is min");
				}
				else if(b<a && b<c)
				{
					System.out.println(b+" is min");
				}
				else if(c<a && c<b)
				{
					System.out.println(c+" is min");
				}
				else if(a==b && a<c)
				{
					System.out.println(a+" and "+b+" are is min and equal");
				}
				else if(a==c && c<b)
				{
					System.out.println(a+" and "+c+" are is min and equal");
				}
				else if(b==c && c<a)
				{
					System.out.println(b+" and "+c+" are is min and equal");
				}

				else {
					System.out.println("All are equals");
				}
				break;
				
			case 3:
				if(a>b && a>c)
				{
					System.out.println(a+" is max");
				}
				else if(b>a && b>c)
				{
					System.out.println(b+" is max");
				}
				else if(c>a && c>b)
				{
					System.out.println(c+" is max");
				}
				else if(a==b && a>c)
				{
					System.out.println(a+" and "+b+" are is max and equal");
				}
				else if(a==c && c>b)
				{
					System.out.println(a+" and "+c+" are is max and equal");
				}
				else if(b==c && c>a)
				{
					System.out.println(b+" and "+c+" are is max and equal");
				}

				else {
					System.out.println("All are equals");
				}
				break;
	
			case 4:
				System.out.println("Enter the first subject mark");
				int a1=sc.nextInt();
				
				System.out.println("Enter the second subject mark");
				int b1=sc.nextInt();
				
				System.out.println("Enter the third subject mark");
				int c1=sc.nextInt();
				
				int total=a1+b1+c1;
				int per=total/3;
				System.out.println("total= "+total);
				System.out.println("percentage= "+per);
				System.out.print("class : ");
				if(a1>=50 && b1>=50 && c1>=50)
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
				else if(a1>=50 && b1>=50 && c1>=50)
				{
					System.out.println("fail");
				}
				else 
				{
					System.out.println(" ATKT fail");
				}


				break;
	
			case 5:
				System.out.println("Enter the x");
				int x=sc.nextInt();
				
				System.out.println("Enter the y");
				int y=sc.nextInt();
				
				System.out.println("Enter the z");
				int z=sc.nextInt();

				    if((x*x)+(y*y)==(z*z)||(y*y)+(z*z)==(x*x)|| (z*z)+(x*x)==(y*y))
				    {
					System.out.println(":Right angled triangle");
				    
				    }
					else if((x==y) && (y==z))
					{
					System.out.println("Equilateral triangle");
					}
					else if((x==y) || (y==z) || (z==x))
						{
						System.out.println("Isosceles");
						}
					else if((x!=y&& y==z && z!=x))
					{
						System.out.println("Scalene");
					}
					else
					{
						System.out.println("no triangle");
					}				

				break;
				
			case 6:
				System.out.println("enter the age");
				int age=sc.nextInt();
				
				System.out.println("enter the weight");
				int w=sc.nextInt();

				System.out.println("enter the hb");
				int hb=sc.nextInt();
				
				if(age>=18)
				{
					if(w>=50)
					{
						if(hb>=12)
						{
							System.out.println("Eligible for Blood donation");
						}
						else
						{
							System.out.println("Not eligible for blood donation");
						}
					}
					else
					{
						System.out.println("Age is valid but weight is not valid");
					}

						
				}
				else
				{
					System.out.println("not valid for blood donation");
				}

				
			break;
	
			case 7:
				System.out.println("enter the 10th marks");
				int p=sc.nextInt();
				
				System.out.println("enter the 12th marks");
				int q=sc.nextInt();

				System.out.println("enter the degree marks");
				int r=sc.nextInt();
				
				if(p>=60 ) 
				{
					if(q>=60)
					{
						if(r>=60)
						{
							System.out.println("Eligible for aptitude test");
						}
						else
						{
							System.out.println("10th and 12th marks good but degree mark less");
						}
					}
					else
					{
					System.out.println("10th marks is good but 12th marks less");
					}	
				}
				else
				{
					System.out.println("Not eligible for aptitude test");
				}
				

				break;
	
			default:
	
				System.out.println("Invalid choice");
			}
		}
		while(ch<=7);
		
	}

}
