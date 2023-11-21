package Tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Bakara.Card;
import Bakara.CardDeck;

class CardDeckTest {

	@DisplayName("CardDeck 확인")
	@Test
	void cardDeckConstructorTest() {
		CardDeck cardDeck = new CardDeck();
//		System.out.println(cardDeck.toString());
	}
	
	@DisplayName("CardDeck 개수 확인")
	@Test
	void cardDeckTotal() {
		
		CardDeck cardDeck = new CardDeck();
		cardDeck.getCards();
		
		assertEquals(cardDeck.getCards().size(), 52);
	}
	
	@DisplayName("CardDeck draw")
	@Test
	void cardDeckDraw() {
		
		CardDeck cardDeck = new CardDeck();
		cardDeck.getCards();
		
		assertEquals(cardDeck.getCards().size(), 52);
		
		cardDeck.draw();
		
		assertEquals(cardDeck.getCards().size(), 51);
		
	}
}
