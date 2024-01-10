package ex08class;

public class QuSimpleCalculator {

	static class CalculatorEx {
		//연산의 횟수를 카운트하기 위한 멤버변수
		private int addCount;
		private int minCount;
		private int mulCount;
		private int divCount;

		//멤버변수를 0으로 초기화한다.
		void init() {
			addCount = 0;
			minCount = 0;
			mulCount = 0;
			divCount = 0;
		}

		//사칙연산을 위한 메서드
		double add(double num1, double num2) {
			//연산을 진행할때마다 1씩 카운트한다.
			addCount++;
			return num1+num2;
		}
		double min(double num1, double num2) {
			minCount++;
			return num1-num2;
		}
		double mul(double num1, double num2) {
			mulCount++;
			return num1*num2;
		}
		double div(double num1, double num2) {
			divCount++;
			return num1/num2;
		}
		//연산의 횟수를 모두 출력한다.
		void showOpCount() {
			System.out.println("덧셈횟수 : "+ addCount);
			System.out.println("뺄셈횟수 : "+ minCount);
			System.out.println("곱셈횟수 : "+ mulCount);
			System.out.println("나눗셈횟수 : "+ divCount);
		}
	}
	
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		/* 함수 호출시 좌측항이 있거나 print문의 일부로 사용된다면
		반환값이 있는 형태로 정의해야 한다. 그렇지 않은 경우라면 반환값이
		없는 void로 정의하면 된다. */
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
