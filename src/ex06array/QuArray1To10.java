package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		int[] arrNumber = new int[10];
		int sum = 0;
		System.out.println("초기화된 배열 요소");
		for(int i=1 ; i<=arrNumber.length ; i++) {
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();
		System.out.println("배열전체요소의합:"+sum);
	}
}
