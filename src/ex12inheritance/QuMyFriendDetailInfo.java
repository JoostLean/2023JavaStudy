package ex12inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo{
	private String name;
	int age;

	//클래스와 동일한 메서드 형태의 생성자
	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
	private String phone;

	//생성자
	public MyFriendDetailInfo(String name, int age, String addr, String phone) {
		super(name, age);
		this.addr = addr;
		this.phone = phone;
	}

	public void showMyFriendDetailInfo(){
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
public class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo info = 
				new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		//정보Print
		info.showMyFriendDetailInfo();
	}
}
