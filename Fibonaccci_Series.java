package Numbersss;

public class Fibonaccci_Series {

	public static void main(String[] args) {
		int n=15;//size
		int a=0;
		int b=1;
		int c=a+b;
		
		while(c<=n)
		{
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
/*
eg. 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,.....
    sequence of number in which each number in the sequence is equal to the 
    sum of two numbers before it
*/