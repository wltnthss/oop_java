package Bakara;

import java.util.List;

public class Dealer {

	private List<Card> cards;

	// gamer 잔고가 0이면 파산.
	public boolean moneyCheck(Gamer gamer) {
		boolean balanced = false;
		
		if(gamer.getBalance() <= 0) {
			balanced = true;
		}
		return balanced;
	}
	
	public void gameFlowing() {
		
	}
	
}
