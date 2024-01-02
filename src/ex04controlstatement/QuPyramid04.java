package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		int num = 5;

		for (int x=0 ; x<num ; x++) {
			for(int y=0 ; y<=x ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i=0 ; i<num ; i++) {
			for (int j=1 ; j<num-i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
