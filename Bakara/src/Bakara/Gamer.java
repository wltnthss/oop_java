package Bakara;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gamer {

	Scanner sc = new Scanner(System.in);
	private List<Card> cards;
	private int money;
	private int balance;
	private boolean turn;
	private String name;
	
	public Gamer(String name) {
		this.cards = new ArrayList(); 
		this.name = name;
		gamerList();
	}
	
	// Gamer 의 리스트 생성
	// 1. 충전로직, 잔고확인, 게임시작, 게임종료
	public void gamerList() {
		System.out.println(this.name + "님이 입장하셨습니다.");
		while(true) {
			System.out.println("===== 메인화면 =====");
			System.out.print("1. 잔고확인 2. 잔고충전 3. 게임시작 4. 게임종료 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				showMoney();
			}else if(num == 2) {
				changeMoney();
			}else if(num == 3) {
				playGame();
			} else if(num == 4) {
				break;
			}
		}
	}
	
	// 게임시작
	public void playGame() {
		System.out.println("===== 게임 시작 =====");
		
		if(this.balance <= 0) {
			System.out.println("잔고충전을 먼저 진행해주세요.");
			return;
		}
	}
	
	// 잔고확인
	public void showMoney() {
		System.out.println("===== 잔고 확인 =====");
		System.out.println("현재 잔액은 " + balance + " 입니다.");
	}
	
	// 잔고에 돈 없을 시 충전 로직
	public int changeMoney() {
		System.out.println("===== 잔고 충전 =====");
		System.out.print("충전할 금액 : ");
		money = sc.nextInt();
		balance = balance + money;
		System.out.println("현재 금액은 총 : " + balance + " 입니다.");
		return balance;
	}
}
