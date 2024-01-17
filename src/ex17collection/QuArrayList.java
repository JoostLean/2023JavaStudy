package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		//1.검색할 이름을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = sc.nextLine();
			
		//2.확장for문으로 컬렉션 전체를 접근
		int index = -1;
		for(Student st : list) {
			if(searchName.equals(st.getName())) {
				System.out.println("오버라이딩 한 equals() 호출됨:"+searchName);
				index = list.indexOf(st);
				break;
			}
		}

		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력
		if(index == 0) {
			list.remove(index);
			System.out.println("[검색되었습니다]");
		}
		else {
			System.out.println("[검색결과가 없습니다]");
		}
//		list.remove(st);
//		System.out.println("오버라이딩한 equals() 호출됨:"+list.remove(index));
		
//		for(Student st : list) {
//			index = list.indexOf(st);
//			if(searchName.compareTo(st.getName())==0) {
//				System.out.println("오버라이딩 한 equals() 호출됨:"+st.getName());
//				list.remove(st);
//				System.out.println();
//				break;
//			}
//			else if(searchName.compareTo(st.getName())!=0) {
//				System.out.println("검색된 결과가 없습니다.");
//				break;
//			}
//		}
		
		//4.전체정보 출력
		System.out.println("[삭제후 정보출력]");
		for(Student st : list) {
			System.out.println(st);
		}
	}
}
