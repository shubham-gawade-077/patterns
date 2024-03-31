package Numbersss;

public class Arithmetic_Series {

	public static void main(String[] args) {
		int n=10;// length limit
		int d=3;//common difference
		int a =1;//starting point
		
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println(" "+a);
			 a=a+d;
		 }
	}

}
/*
eg. 1,4,7,10,13,16,19,... 
*/