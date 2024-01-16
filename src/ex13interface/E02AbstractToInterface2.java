package ex13interface;

/*
추상클래스를 인터페이스로 변경하기
	abstract class => interface
	메서드인 경우 public abstract 제거
	멤버변수인 경우 public static final 제거
*/
interface PersonalNumberStorage {
	//인력 정보를 저장하는 기능의 추가메서드
	void addPersonalInfo(String juminNum, String name);
	//저장된 정보를 검색하는 기능의 추상메서드
	String searchPersonalInfo(String juminNum);
}

/*
VO(Value Object) : 값만 저장할 수 있는 객체라는 뜻으로 데이터 저장용
	클래스를 의미한다.
*/
class PersonalInfoVO {
	//멤버변수로 주민번호와 이름을 정의
	private String name;
	private String juminNum;
	//생성자
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	/* getter/setter : DTO에 private으로 선언된 멤버변수의 값을 
	설정하거나 반환할 때 사용한다. */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getJuminNum() { return juminNum; }
	public void setJuminNum(String juminNum) { this.juminNum = juminNum; }
}

/*
클래스가 클래스를 상속할때 => extends
클래스가 인터페이스를 상속할때 => implements
매우 드물지만 인터페이스가 인터페이스를 상속할때 => extends

extends는 "상속"이라 부르고, implements는 "구현"이라 표현한다.
*/
class PersonalNumberStorageImpl implements PersonalNumberStorage {

	//정보저장용 객체배열과 인덱스 카운트를 위한 멤버변수 선언
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;

	//생성자 : 객체배열 생성 및 인덱스 변수 초기화
	public PersonalNumberStorageImpl(int arrSize) {
		//매개변수로 전달된 정수를 통해 배열의 크기를 지정함
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}

	/*
	상속을 통해 추상메서드를 포함하게 되므로 반드시 아래와 같이 오버라이딩
	해야한다. 이는 필수사항이며 하지 않을 경우 에러가 발생하게 된다. 
	*/
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		//이름과 주민번호를 통해 인스턴스를 생성한 후 배열에 저장한다.
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, juminNum);
		//인덱스로 사용할 변수를 1증가 시킨다.
		numOfPerInfo++;
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		//저장된 정보의 갯수만큼 반복
		for(int i=0 ; i<numOfPerInfo ; i++) {
			/* 주민번호가 일치하는지 판단한다. 주민번호는 private으로
			선언된 멤버이므로 직접 접근이 불가능하다. 따라서 아래와 같이
			getter를 통해 값을 반환받아 사용해야 한다. */
			if(juminNum.compareTo(
					personalArr[i].getJuminNum())==0) {
				//일치하는 경우 이름을 반환한다.
				return personalArr[i].getName();
			}
		}
		return null;
	}
}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		//정보저장용 인스턴스 생성
		PersonalNumberStorageImpl storage =
				new PersonalNumberStorageImpl(10);

		//2개의 인력 정보를 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");

		//검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001234-1090333"));
	}
}
