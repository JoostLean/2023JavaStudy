package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		int result;
		for(int i=2 ; i<10 ; i++) {
			result = i * 1;
			System.out.printf("%d×1=%d\n", i, result);
			for(int j=2 ; j<9 ; j++) {
				result = i;
				System.out.printf("%d", i);
				for(int k = 2; k <= j; k++) {
					result *= i;
					System.out.printf("×%d",i);
				}
				System.out.printf("=%d", result);
				System.out.println();
			}
			System.out.println();
		}
	}
}
