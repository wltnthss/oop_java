package Bakara;

import java.util.LinkedList;
import java.util.List;

/*
 * enum 사용법 참고 블로그 https://www.nextree.co.kr/p11686/
 * 
 * Q. enum 으로 정의한 이유?
 * A. enum 을 사용함으로써 단순 문자열, 숫자 표현 시 잘못된 값이 들어온지 체크하기 위함입니다. 
 * 	( 제시되있는 것 외에는 허용되지 않기에 예외발생하나 단순 문자열이나, 숫자는 컴파일러가 알려주지 못하기 때문에 사용함 )
 * Q. enum 의 장점?
 * A. 코드 단순, 가독성, 인스턴스 생성과 상속 방지, 구현 의도가 열거임을 나타냅니다. (타입체크에 유리)
 * 		
 * 1. enum 의 경우 Card 외에는 사용되는 곳이 없기에 inner type으로 선언하였습니다.
 * 
 * 궁금했던 점
 * 1. 상수 대신 enum 을 왜 사용할까?
 * 		-> 주석과 상수를 사용하는 부분이 달라지면 숫자들이 어떠한 것을 의미하는지 코드의 가독성이 떨어짐.
 * 		-> 상수의 개수가 많아질수록 중복된 이름이 생길 수 있어 컴파일 오류가 발생할 수도 있는 문제점이 생김.
 * 2. 그렇다면 interface로써 용도를 묶어서 사용하는 방법을 사용하면 되지 않는가?
 * 		-> 서로 다른 집합에 정의된 상수들을 비교할 때 컴파일 단계에서 오류로 잡아내지 않아 런타임 단계에서 에러가 발생할 수 있습니다.
 * 3. 그렇다면 interface로 작성된 상수들의 집합을 class로써 사용하면 되지 않는가?
 * 		-> 각각의 상수들이 서로 다른 데이터는 가지고 있으나, 같은 집합의 상수들은 같은 데이터 타입을 갖는 문제점이 있습니다.
 * 		-> 컴파일 단계에서 에러는 잡아낼 수 있으나, switch문에서의 데이터 타입이 제한적이여서 에러가 발생합니다.
 * 
 * 이러한 문제점들을 해결해주는 것이 enum 클래스
 */

public class Card {

	private Num num;
	private Pattern pattern;
	
	public Card() {
	}
	public Card(Num num, Pattern pattern) {
		super();
		this.num = num;
		this.pattern = pattern;
	}

	public Num getNum() {
		return num;
	}
	public void setNum(Num num) {
		this.num = num;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return "num=" + num + ", pattern=" + pattern;
	}

	public enum Num{
		ACE("A", 1),
        TWO("2", 2),
        THREE("3", 3),
        FOUR("4", 4),
        FIVE("5", 5),
        SIX("6", 6),
        SEVEN("7", 7),
        EIGHT("8", 8),
        NINE("9", 9),
        TEN("10", 10),
        JACK("J", 10),
        QUEEN("Q", 10),
        KING("K", 10);
		
		private String mark;
		private int point;
		
		private Num() {
			
		}

		private Num(String mark, int point) {
			this.mark = mark;
			this.point = point;
		}
		
		public int getPoint() {
			return this.point;
		}
	}
	  
	public enum Pattern{
		SPADE("♠"),
		DIAMOND("◆"),
		HEART("♥"),
		CLOVER("♣");
		
		private String shape;

		private Pattern() {
			
		}
		
		private Pattern(String shape) {
			this.shape = shape;
		}
	}
}

