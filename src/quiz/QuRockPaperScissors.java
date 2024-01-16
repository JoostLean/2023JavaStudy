package quiz;

import java.util.Scanner;

public class QuRockPaperScissors {

	static void Game() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
		int userNumber = scanner.nextInt();
		int cpuNumber = (int)((Math.random()*3)+1);

		String userResult;
		String cpuResult;

		switch (userNumber) {
			case 1:
				userResult = "가위"; break;
			case 2:
				userResult = "바위"; break;
			case 3:
				userResult = "보"; break;
			default:
				userResult = "undefined"; break;
		}
		switch (cpuNumber) {
			case 1:
				cpuResult = "가위"; break;
			case 2:
				cpuResult = "바위"; break;
			case 3:
				cpuResult = "보"; break;
			default:
				cpuResult = "undefined"; break;
		}
		
		if (userResult != "undefined") {
			System.out.println("사용자 : "+ userResult + ", " + "컴퓨터 : " + cpuResult);
		}

		if (userResult == "undefined")
			System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
		else if(userNumber == 1 && cpuNumber == 1)
			System.out.println("비겼습니다.");
		else if (userNumber == 1 && cpuNumber == 2)
			System.out.println("졌습니다.");
		else if (userNumber == 1 && cpuNumber == 3)
			System.out.println("이겼습니다.");
		else if (userNumber == 2 && cpuNumber == 1)
			System.out.println("이겼습니다.");
		else if (userNumber == 2 && cpuNumber == 2)
			System.out.println("비겼습니다.");
		else if (userNumber == 2 && cpuNumber == 3)
			System.out.println("졌습니다.");
		else if (userNumber == 3 && cpuNumber == 1)
			System.out.println("졌습니다.");
		else if (userNumber == 3 && cpuNumber == 2)
			System.out.println("이겼습니다.");
		else if (userNumber == 3 && cpuNumber == 3)
			System.out.println("비겼습니다.");
	}

	static void GameStart() {
		for(int i=1 ; i<6 ; i++) {
			Game();
			System.out.println("….게임진행...");
		}
		Restart();
	}
	
	static void Restart() {
		Scanner sc = new Scanner(System.in);
		System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
		int restart = sc.nextInt();
		if(restart == 1) {
			System.out.println("….게임재시작...");
			for(int i=1 ; i<6 ; i++) {
				GameStart();
				System.out.println("….게임진행...");
			}
		} else if(restart == 0) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		GameStart();
	}
}
