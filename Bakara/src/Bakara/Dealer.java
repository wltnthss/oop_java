package Bakara;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

	private CardDeck cardDeck;
	
	// 딜러가 뽑은 카드
	private ArrayList<Card> playerCards = new ArrayList<Card>();
	private ArrayList<Card> BankerCards = new ArrayList<Card>();
	
	
	public Dealer() {
		cardDeck = new CardDeck();
	}

	// gamer 잔고가 0이면 파산.
	public boolean moneyCheck(Gamer gamer) {
		boolean balanced = false;
		
		if(gamer.getBalance() <= 0) {
			balanced = true;
		}
		return balanced;
	}
	
	public void gameFlowing() {
		
		Betting bet = new Betting();
		
		// 게이머 객체 받아와서 배팅 로직
		System.out.println("===== 베팅을 시작합니다 =====");
		
		// 배팅 로직 구현
		bet.bettingStart();
		
		// 베팅 시작 10초 후 마감
		try {
			System.out.println("===== 10초후 베팅이 마감됩니다 =====");
			for (int i = 10; i >= 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("===== 베팅을 종료합니다 =====");
		
		// 딜러 카드덱에서 카드 뽑기 
		cardDraw();
		
	}
	
	// 딜러가 카드를 받고 player -> banker 순으로 각각 2장씩 지급
	public void cardDraw() {
		System.out.println("===== player 1번째 카드 =====");
		secondDelay();
		playerCards.add(cardDeck.draw());
		System.out.println("[ player 1번째 카드 : " + playerCards.get(0) + "]");
		
		System.out.println("===== banker 1번째 카드 =====");
		secondDelay();
		BankerCards.add(cardDeck.draw());
		System.out.println("[ banker 1번째 카드 : " + BankerCards.get(0) + "]");
		
		System.out.println("===== player 2번째 카드 =====");
		secondDelay();
		playerCards.add(cardDeck.draw());
		System.out.println("[ player 2번째 카드 : " + playerCards.get(1) + "]");
		
		System.out.println("===== banker 2번째 카드 =====");
		secondDelay();
		BankerCards.add(cardDeck.draw());
		System.out.println("[ banker 2번째 카드 : " + BankerCards.get(1) + "]");
	}
	
	// 딜러 player, banker 카드 확인
	public void secondDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Card> getPlayerCards() {
		return playerCards;
	}

	public ArrayList<Card> getBankerCards() {
		return BankerCards;
	}
}
