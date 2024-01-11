package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle {
	//멤버변수 : 가로, 세로를 표현
	int x;
	int y;
	//생성자 : 멤버변수를 초기화
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	public Rectangle(int i) {}
	public void showAreaInfo() {
		System.out.println("직사각형 면적: "+(x*y));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	int length;

	/* 직사각형은 가로, 세로 두 변의 길이가 서로 다르기 때문에 2개의
	멤버변수가 필요하다. 하지만 정사각형은 길이가 동일하므로 1개의 값으로
	2개의 멤버변수를 초기화할 수 있다.
	즉 해당 클래스는 멤버변수의 확장이 필요하지 않다. */
	public Square(int x) {
		super(x,x);
		this.length = x;
	}
//	public Square(int i) {
//		super(i);
//		this.length = i;
//	}

	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적: "+(super.x*super.y));
//		System.out.println("정사각형 면적: "+(length*length));
	}
}

class QuRectangleMain {
	public static void main(String[] args) {
		//직사각형을 표현
       	Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();

   		Square sqr = new Square(7);
       	sqr.showAreaInfo();
	}
}
