package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle {
 	//블라블라
	int x;
	int y;
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Rectangle(int i) {}
	public void showAreaInfo() {
		System.out.println("직사각형 면적: "+(x*y));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
 	//블라블라
	int length;

	public Square(int i) {
		super(i);
		this.length = i;
	}

	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적: "+(length*length));
	}
}

class QuRectangleMain {
	public static void main(String[] args) {
       	Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();

   		Square sqr = new Square(7);
       	sqr.showAreaInfo();
	}
}
