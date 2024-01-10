package ex07string;

import java.util.Scanner;

public class QuValidateIds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String inputId = scanner.nextLine();

		if((inputId.length()>=8 && inputId.length()<=12)) {
			if(idValidate(inputId)) {
				System.out.println("사용할 수 있는 아이디입니다.");
			} else {
				System.out.println("사용할 수 없는 아이디입니다.");
			}			
		} else {
			System.out.println("사용할 수 없는 아이디입니다.");
		}
	}
	static boolean idValidate(String inputId) {
		int length = inputId.length();
		for(int i=1 ; i<=length; i++) {
			int idChar = inputId.charAt(i-1);
			if(!((idChar>='a' && idChar<='z') || 
					(idChar>='0' && idChar<='9'))) {
				return false;
			}
		}
		return true;
	}
}
