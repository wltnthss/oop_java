package Bakara;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

	private CardDeck cardDeck;
	
	// 뱅커가 뽑은 카드
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
