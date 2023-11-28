package Bakara;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class Gamer {

	Scanner sc = new Scanner(System.in);
	
	// 초기 자금 변경
	private final int INIT_GAMER_MONEY = 5000;
	
	private List<Card> cards;
	private int balance;
	private int money;
	private String name;
	private int betPlayer;
	private int betBanker;
	
	public Gamer() {
		this.cards = new ArrayList(); 
		this.balance = INIT_GAMER_MONEY;
	}
	
	public void showInfo() {
		StringBuilder sb = new StringBuilder();
		
		for (Card card : cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

	public List<Card> getCards() {
		return cards;
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

