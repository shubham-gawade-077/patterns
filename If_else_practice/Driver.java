package If_else_practice;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender(male or female");
		String g=sc.nextLine();
		
		System.out.println("Is married(yes or no)");
		String m=sc.nextLine();
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		
		if(m.equals("yes"))
		{
			System.out.println("Insures");
		}
		else
		{
			if(m.equals("no"))
			{
				if(g.equals("male"))
				{
					if(age>=30)
					{
						System.out.println("insures");
					}
					else
					{
						System.out.println("not insures");
					}
				}
				else
				{
					if(g.equals("female"))
					{
						if(age>=25)
						{
							System.out.println("Insures");
						}
						else
						{
							System.out.println("not insures");
						}
					}
					else
					{
						System.out.println("plz enter valid gender");
					}
				}
			}
			else
			{
				System.out.println("plz enter valid married status");
			}
		}
	}

}
