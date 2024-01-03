package ex07string;

import java.util.Scanner;

public class E02StringMethod4s {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.print("주민등록번호를 입력하세요:");
		String minbun = scanner.nextLine();
		int minbun1 = minbun.charAt(7);
		/* 숫자가 아니라 문자열로 들어가기 때문에 '(싱글쿼테이션)으로 비교해야한다.
		그렇지 않은 경우 변환해서 넣어야함 */
		switch (minbun1) {
		case 49:
			System.out.println("남자입니다.");
			break;
		case 50:
			System.out.println("여자입니다.");
			break;
		case 51:
			System.out.println("남자입니다.");
			break;
		case 52:
			System.out.println("여자입니다.");
			break;
		case 53:
			System.out.println("외국인입니다.");
			break;
		case 54:
			System.out.println("외국인입니다.");
			break;
		default:
			System.out.println("잘못된 주민번호입니다.");
		}

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String okEmail = "hong@daum.net";
		System.out.println("첫번째:"+okEmail);
		String noEmail = "not@naver"; 
		System.out.println("두번째:"+noEmail);
		System.out.println("====================");
		System.out.print(okEmail+" => ");
		if (okEmail.contains("@") && okEmail.contains(".")) {
			System.out.println("이메일형식임");
		} else {
			System.out.println("이메일형식이아님");
		}
		System.out.print(noEmail+" => ");
		if (noEmail.contains("@") && noEmail.contains(".")) {
			System.out.println("이메일형식임");
		} else {
			System.out.println("이메일형식이아님");
		}

		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()를
		이용해서 작성하시오.
		*/
		int minbun2 = minbun.indexOf("-")+1;
		System.out.println(minbun.charAt(minbun2));
		if(minbun.charAt(minbun2)==49 || minbun.charAt(minbun2)==51 ) {
			System.out.println("남자입니다.");
		}
		else if(minbun.charAt(minbun2)==50 || minbun.charAt(minbun2)==52 ) {
			System.out.println("여자입니다.");
		}
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String myfile = "my.file.images.jpg";
		System.out.println("파일명 : "+ myfile);
		int FileStringIndex = myfile.lastIndexOf(".");
		String FileExt = myfile.substring(FileStringIndex);
//		String FileExt = myfile.substring(FileStringIndex,(FileStringIndex+4));
		System.out.println("확장자 : "+ FileExt);
	}

}
