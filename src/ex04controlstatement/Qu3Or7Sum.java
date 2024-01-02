package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int total = 0;
		int k = 1;
		while(k<=100) {
			if(k%3==0 || k%7==0) {
				total += k;
			}
			if(k%3==0 && k%7==0) {
				total -= k;
			}
			k++;
		}
		System.out.println("3또는4의배수의합:"+ total);
	}

}
