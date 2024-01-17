package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Avengers avengers = (Avengers)obj;
		System.out.println("중복 제거용 equals()메소드 호출");
		if (avengers.getName()==this.getName() || 
				avengers.getHeroName()==this.getHeroName() || 
				avengers.getWeapon()==this.getWeapon()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getName().hashCode() + this.getHeroName().hashCode() + this.getWeapon().hashCode();
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤:");
		String searchName = sc.nextLine();
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers hero = itr.next();
			if(searchName.compareTo(hero.name)==0) {
				System.out.println(hero);
				System.out.println("요청하신 정보를 찾았습니다.");
				return;
			}
		}
		if(set.contains(searchName)!=true) {
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		}
	}
}
