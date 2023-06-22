package modifier;

class Player{
	String name = "홍길동"; //인스턴스 맴버변수
	static String gameID = "기사"; //정적 맴버변수
	
	public static void gamePlay() {//정적메소드
		//System.out.println(name);
		//인스턴스 메소드, 인스턴스 필드 사용불가
		//인스턴스 메소드,필드는 인스턴스가 생성될 때 사용할 수 있기때문이다.
		
		System.out.println(gameID + "로 게임을 플레이 합니다.");
		
	}
}



public class Ex02 {

	public static void main(String[] args) {
		Player player = new Player();
		
		player.gamePlay();
		
		//정적메소드는 원칙적으로 클래스명으로 접근한다.
		Player.gamePlay();
		
		Math.random();//정적메소드이다.
	}

}
