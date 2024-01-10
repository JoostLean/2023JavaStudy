package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		//입력받은 정수를 순서대로 입력할 배열
		int[] arrNumber = new int[10];
		//홀,짝을 구분해서 입력할 배열 선언
		int[] num = new int[10];
		int numEnd = 9;
		int numStart = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<arrNumber.length; i++) {
			System.out.print((i + 1)+"번째 정수를 입력하세요:");
			arrNumber[i] = scanner.nextInt();
		}
		
		System.out.println("순서대로입력된결과");
		for(int i = 0 ; i<arrNumber.length ; i++)
			System.out.print(arrNumber[i]+ " ");

		System.out.println();
		System.out.println("홀수/짝수 구분입력결과");
		for(int i = 0 ; i<arrNumber.length ; i++) {
			int numState = arrNumber[i];
			if(numState%2 == 0) {
				num[numEnd] = numState;
				numEnd--;
			} else {
				num[numStart] = numState;
				numStart++;
			}
		}
		for(int i = 0 ; i<num.length ; i++) {
			System.out.print(num[i]+ " ");
		}
	}

}
