package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	static void arithmetic() {
		int num1;
		int num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scanner.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scanner.nextInt();
		int addition = (num1 + num2);
		int subtraction = (num1 - num2);
		int multiplication = (num1 * num2);
		int res = (num1 / num2);
		int remainder = (num1 % num2);
		System.out.print("덧셈결과->"+ addition +"\n");
		System.out.print("뺄셈결과->"+ subtraction +"\n");
		System.out.print("곱셈결과->"+ multiplication +"\n");
		System.out.print("나눗셈 몫->"+ res +"\n");
		System.out.print("나눗셈 나머지->"+ remainder +"\n");
	}
	public static void main(String[] args) {
		arithmetic();
	}
}
