package ex08class;

class Triangle {
	//멤버변수
	int bottom;//밑변
	int height;//높이

	//초기화를 위한 메서드
	void init(int bottom, int height) {
		/* 멤버변수와 매개변수의 이름이 동일하면 구분하기 어려우므로
		this를 붙여서 구분하면된다. this는 자신의 멤버를 가리키는
		키워드로 사용된다. */
		this.bottom = bottom;
		this.height = height;
	}

	int getArea() {
		return (bottom*height)*1/2;
	}
	//밑변을 설정하는 메서드
	void setBottom(int bottom) {
		this.bottom = bottom;
	}
	//높이를 설정하는 메서드
	void setHeight(int h) {
		height = h;
	}
}

public class QuTriangle {

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}
}
