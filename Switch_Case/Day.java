package Switch_Case;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		int dayNum;
		String dayType="",day="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  day number");
		dayNum=sc.nextInt();
		switch(dayNum)
		{
			case 1:
				day="Monday";dayType="WeekDay";
				break;
			
			case 2:
				day="Tuesday";dayType="WeekDay";
				break;
			case 3:
				day="Wednesday";dayType="WeekDay";
				break;
			case 4:
				day="Thursday";dayType="WeekDay";
				break;
			
			case 5:
				day="Friday";dayType="WeekDay";
				break;
			case 6:
				day="Saturday";dayType="WeekEnd";
				break;
			case 7:
				day="Sunday";dayType="WeekEnd";
				break;
				
			default:
				day="Invalid day";
		}
		System.out.println(day+" is "+dayType);
	}

}
