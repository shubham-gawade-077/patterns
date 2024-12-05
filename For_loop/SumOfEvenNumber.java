package For_loop;

import java.util.Scanner;

class SumOfEvenNumber {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i+=2)
		{
			sum=sum+i;
		}
		System.out.println("sum of 1 to "+n+" even number is "+sum);
	}

}
