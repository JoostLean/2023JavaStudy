package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	public static void main(String[] args) {
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		radius = scanner.nextInt();
		circleArea(radius);
		circleRound(radius);
	}
	static int circleArea(int radius) {
		System.out.println("넓이공식:"+(3.14*radius*radius));
		return radius;
	}
	static int circleRound(int radius) {
		System.out.println("넓이공식:"+(2*3.14*radius));
		return radius;
	}
}
