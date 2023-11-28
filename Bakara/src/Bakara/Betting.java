package Bakara;

import java.util.Scanner;

public class Betting {

	
	Scanner sc = new Scanner(System.in);
	
	public void bettingStart() {
		Gamer gamer = Gamer.getInstance();
		
		// 유저 잔고 조회
		int balance = gamer.getBalance();
		// 배팅 금액 입력
		int input = 0;
		
		System.out.printf("[현재 잔고 : %d]\n", balance);
		
		int choiceNum = choice();
			
		switch(choiceNum) {
		case 1:
			System.out.print(">>> Player에 배팅할 금액을 입력하세요 : ");
			input = sc.nextInt();
			System.out.println("===== Player에 배팅하셨습니다.=====");
			break;
		case 2:
			System.out.print(">>> Banker에 배팅할 금액을 입력하세요 : ");
			input = sc.nextInt();
			System.out.println("===== Banker에 배팅하셨습니다.=====");
			break;
		case 3:
			System.out.print(">>> Tie에 배팅할 금액을 입력하세요 : ");
			input = sc.nextInt();
			System.out.println("===== Tie에 배팅하셨습니다.=====");
			break;
		}
	}
	
	public int choice() {
		
		System.out.println("===== 배팅할 지역을 고르세요 =====");
		System.out.println("===== 1. Player =====");
		System.out.println("===== 2. Banker =====");
		System.out.println("===== 3. Tie =====");
		System.out.println("===========================");
		int num = sc.nextInt();
		
		return num;
	}
}
