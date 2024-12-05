package Switch_Case;

import java.util.Scanner;

public class Calender_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date number");
		int d=sc.nextInt();
		
		System.out.println("Enter the month number");
		int m=sc.nextInt();
		
		System.out.println("Enter the year ");
		int y=sc.nextInt();
		
		if(y>=1000 && y<=9999)
		{
			if(m>=1 && m<=12)
			{
				if(d>=1 && d<=31)
				{
					switch(m)
					{
					case 1:case 3:case 5:case 7:case 8:case 10:case 12:
						System.out.println(d+"/"+m+"/"+y+" is valid date");
						break;
					case 4:case 6: case 9: case 11:
						if(d<=30)
						{
						 System.out.println(d+"/"+m+"/"+y+" is valid date");	
						}
						else
						{
							System.out.println(d+"/"+m+"/"+y+" is invalid date");
						}
						break;
					case 2:
						if(y%4==0 && d<=29)
						{
							System.out.println(d+"/"+m+"/"+y+" is valid date");
						}
						else if(y%4!=0 && d<=28)
						{
							System.out.println(d+"/"+m+"/"+y+" is valid date");
						}
						else
						{
							System.out.println("invalid date");
						}
						break;
						default:
							System.out.println("Invalid choice");
							break;
					}
				}
				else
				{
					System.out.println("Invalid date number");
				}
			}
			else
			{
				System.out.println("Invalid month");
			}
		}
		else
		{
			System.out.println("Invalid year");
		}
		
	}

}
