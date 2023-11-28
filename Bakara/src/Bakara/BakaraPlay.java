package Bakara;

public class BakaraPlay {

	public void play() {
		System.out.println("===== Bakara Play =====");
		
 		boolean isContinue = false;
		
		do {
			Dealer dealer = new Dealer();
			Gamer gamer = Gamer.getInstance();
			
			// 딜러가 게임을 중재합니다.
			dealer.gameFlowing();
			
			if(dealer.moneyCheck(gamer)) {
				System.out.println(gamer.getName() + "님은 파산하셨습니다." );
				break;
			}
			
			
			
			
		}while(isContinue);
		
	}
}
