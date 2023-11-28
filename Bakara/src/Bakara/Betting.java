package Bakara;

import java.util.Scanner;

public class Betting {

	
	Scanner sc = new Scanner(System.in);
	
	public void bettingStart() {
		Gamer gamer = Gamer.getInstance();
		
		int balance = gamer.getBalance();
		
		System.out.printf("[현재 잔고 : %d]\n", balance);
		
		int choiceNum = choice();
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
