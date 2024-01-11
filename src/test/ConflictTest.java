package test;

abstract class PersonalNumberStorage {
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonalInfo(String juminNum);
}

class AAA extends PersonalNumberStorage {
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		// TODO Auto-generated method stub
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		// TODO Auto-generated method stub
		return null;
	}
}

class AAAA {
	int a;
	String b;
	//Alt+Shift+S
	//Generate Getters and Setters
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	//Generate Constructor using Fields
	public AAAA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
}

public class ConflictTest {

	public static void main(String[] args) {
		System.out.println("1.집에서 작업");
		System.out.println("2.학원에서 추가작업");
	}

}
