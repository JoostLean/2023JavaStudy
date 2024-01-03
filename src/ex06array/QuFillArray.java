package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		int[] arrNumber = new int[10];
		int[] num = new int[10];
		int num1 = 9;
		int num2 = 0;
		
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
				num[num1] = numState;
				num1--;
			} else {
				num[num2] = numState;
				num2++;
			}
		}
		for(int i = 0 ; i<num.length ; i++) {
			System.out.print(num[i]+ " ");
		}
	}

}
