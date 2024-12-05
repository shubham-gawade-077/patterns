package Switch_Case;

import java.util.Scanner;

public class Calender_3 {  //previous date

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
						if(d==1 && m==1)
						{
							d=31;
							m=12;
							y--;
							System.out.println(d+"/"+m+"/"+y+" is previous date");
						}
						else if((d>=2 && d<=31)&& m==1)
						{
							d--;
							m=m;
							y=y;
							System.out.println(d+"/"+m+"/"+y+" is previous date");
						}
						else if((d>=2 && d<=31) && m>=3 && m<=12)
						{
							d--;
							m=m;
							y=y;
							System.out.println(d+"/"+m+"/"+y+" is previous date");
						}
						else if((d==1) && (m>=5 && m<=12))
						{
							d=30;
							m--;
							System.out.println(d+"/"+m+"/"+y+" is previous date");
						}
						else if(d==1&& m==3)
						{
							if(y%4==0)
							{
								d=29;
								m=2;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
							else
							{
								d=28;
								m=2;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
						}
						else
						{
							System.out.println("invalid date");
						}
						break;
					case 4:case 6: case 9: case 11:
						if(d<=30)
						{
						 System.out.println(d+"/"+m+"/"+y+" is valid date");
						 
						 if((d==1) && m>=1 && m<=11)
							{
								d=31;
								m--;
								y=y;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
							
							else if((d>=2 && d<=30) && m>=1 && m<=11)
							{
								d--;
								m=m;
								y=y;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
							else
							{
								System.out.println("invalid date");
							}
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
							if(d==1&& m==2)
							{
								d=31;
								m=1;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
							else if((d>=2&& d<=29) && m==2)
							{
								d--;
								m=m;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
						}
						else if(y%4!=0 && d<=28)
						{
							System.out.println(d+"/"+m+"/"+y+" is valid date");
							if(d==1 && m==2)
							{
								d=31;
								m=1;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
							else if((d>=2 && d<=28)&&m==2)
							{
								d--;
								m=m;
								System.out.println(d+"/"+m+"/"+y+" is previous date");
							}
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
