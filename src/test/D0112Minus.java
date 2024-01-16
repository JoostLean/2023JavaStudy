package test;

import java.util.Scanner;

public class D0112Minus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2;
		System.out.print("첫번째 숫자를 입력하세요:");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요:");
		num2 = scanner.nextInt();
		System.out.println(num1/num2);
	}
}
