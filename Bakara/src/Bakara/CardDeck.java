package Bakara;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {

	private List<Card> cards;
	
	public CardDeck() {
		cards = generateCards();
		// 카드 생성과 동시에 셔플
		Collections.shuffle(cards);
	}
	
	// 카드 생성 메서드 분리, cardDeck에서만 사용하기에 private 접근제어
	private List<Card> generateCards(){
		
		// 카드를 draw할 때 데이터의 추가/삭제에 유리한 LinkedList 사용
		cards = new LinkedList<Card>();
		
		for(Card.Num num : Card.Num.values()) {
			for(Card.Pattern pattern : Card.Pattern.values()) {
				Card card = new Card(num, pattern);
				cards.add(card);
			}
		}
		
		return cards;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Card card : cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	// 랜덤한 카드 
	public Card draw() {
		
		// 랜덤 카드 1개 가져오기
		Card selectedCard = getRandomCard(); 
		// 가져온 랜덤 카드 제거
		cards.remove(selectedCard);
		
		return selectedCard;
	}
	// 카드덱에서 랜덤으로 카드 1개를 뽑는다.
	// CardDeck class에서만 사용하므로 private
	private Card getRandomCard() {
		int size = cards.size();
		int rand = (int)(Math.random() * size);
		
		return cards.get(rand);
	}

	public List<Card> getCards() {
		
		return cards;
	}
}
