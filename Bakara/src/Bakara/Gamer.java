package Bakara;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class Gamer {

	Scanner sc = new Scanner(System.in);
	
	// 초기 자금 변경
	private final int INIT_GAMER_MONEY = 5000;
	
	private int balance;
	private int money;
	private String name;
	private int betPlayer;
	private int betBanker;
	
	private static Gamer gamer;
	
	private Gamer() {
		this.balance = INIT_GAMER_MONEY;
	}
	
	// 유저 싱글턴으로 구현
	public static Gamer getInstance() {
		if(gamer == null) {
			gamer = new Gamer();
		}
		return gamer;
	}

	
	public int getBalance() {
		return balance;
	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public int getBetPlayer() {
		return betPlayer;
	}

	public int getBetBanker() {
		return betBanker;
	}
}

