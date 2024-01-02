package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {
	static void QuNumber() throws IOException {
		int asciiCode;
		System.out.print("하나의 문자를 입력하세요:");
		asciiCode = System.in.read();
		
		String result = (asciiCode>=48 && asciiCode<=57) ? "숫자입니다" : "숫자가 아닙니다";
		System.out.println(result);
	}
	
	public static void main(String[] args) throws IOException {
		QuNumber();
	}
}
