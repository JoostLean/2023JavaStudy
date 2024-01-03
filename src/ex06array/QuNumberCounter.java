package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
				
//		System.out.println(answer[8]);
//		System.out.println(counter.length);
		for(int num=0 ; num<answer.length ; num++) {
			int i = answer[num];
			counter[i - 1]++;
		}	
		for(int num=0 ; num<counter.length ; num++) {
			System.out.printf("counter[%d]=>%d\n",num,counter[num]);
		}
	}
}
