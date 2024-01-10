package ex08class;

interface CalculatorEx {
	double add(double a, double b);
	double min(double a, double b);
	double mul(double a, double b);
	double div(double a, double b);
}

public class QuSimpleCalculator1 implements CalculatorEx {
	private int addCount;
	private int minCount;
	private int mulCount;
	private int divCount;

	void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}

	@Override
	public double add(double a, double b) {
		addCount++;
		return a+b;
	}
	@Override
	public double min(double a, double b) {
		minCount++;
		return a-b;
	}
	@Override
	public double mul(double a, double b) {
		mulCount++;
		return a*b;
	}
	@Override
	public double div(double a, double b) {
		divCount++;
		return a/b;
	}

	public void showOpCount() {
		System.out.println("덧셈횟수 : "+ addCount);
		System.out.println("뺄셈횟수 : "+ minCount);
		System.out.println("곱셈횟수 : "+ mulCount);
		System.out.println("나눗셈횟수 : "+ divCount);
	}
	
	public static void main(String[] args)
	{
		QuSimpleCalculator1 cal = new QuSimpleCalculator1();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
