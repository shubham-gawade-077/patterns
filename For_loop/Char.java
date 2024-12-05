package For_loop;

import java.util.Scanner;

class Char {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		System.out.println("Enter the range");
		 int n=sc.nextInt();
		 
		 for(int i=1;i<=n;i++)
		 {
			 System.out.print(ch+" ");
			 ch++;
		 }
	}

}
