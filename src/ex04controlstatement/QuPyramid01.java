package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int x=1;
		do {
			int y=1;
			do {
				if(x>=y) {
					System.out.print("* ");					
				}
				y++;
			}while(y<=5);
			x++;
			System.out.println();
		}while(x<=5);
	}
}
