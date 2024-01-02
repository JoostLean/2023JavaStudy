package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {
		int cels;
		double fahren;
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨를 입력하세요.");
		cels = scanner.nextInt();
		Fahrenheit(cels);
		System.out.println("화씨를 입력하세요.");
		fahren = scanner.nextInt();
		Celsius(fahren);
	}
	static int Fahrenheit(int cels) {
		System.out.println("화씨:"+(1.8*cels+32));
		return cels;
	}
	static double Celsius(double fahren) {
		System.out.println("섭씨:"+(fahren-32)/1.8);
		return fahren;
	}
}
