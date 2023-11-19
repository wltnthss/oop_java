package Tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Bakara.Card;

class CardTest {

	@DisplayName("Card 패턴 확인")
	@Test
	void cardPatternTest() {
		
		// given
		Card card = new Card();
		
		// when 
		card.setPattern(Card.Pattern.CLOVER);
		
		// then
		assertEquals(card.getPattern(), Card.Pattern.CLOVER);
	}
	
	@DisplayName("Card Num 확인")
	@Test
	void cardNumTest() {
		
		// given
		Card card = new Card();
		
		// when 
		card.setNum(Card.Num.ACE);
		
		// then
		assertEquals(card.getNum().getPoint(), 1);
	}


}
