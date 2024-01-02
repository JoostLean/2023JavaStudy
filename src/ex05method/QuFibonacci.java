package ex05method;

public class QuFibonacci {

	public static void fibo(long fibo) {
		long x = 0;
		long y = 1;
		System.out.print(x+", "+y);
		for(long i=2 ; i<fibo ; i++) { 
			long sum = x+y;
			System.out.print(", "+sum);
			x=y;
			y=sum;
		}
	}
	public static void main(String[] args) {
		long fibo = 93;
		fibo(fibo);
	}
}
