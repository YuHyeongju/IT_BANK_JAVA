package poly;

import java.util.Scanner;

class Game{
	
	String user;
	
	public Game(String user) {
		this.user = user;
	}
	public void play() {
		System.out.println(user + "이(가) 게임을  플레이 합니다.");
	}

	
	//Game클래스를 상속받는 AirplaneGame 클래스를 만든다.
	//필드는 String arir planeName; 이다.
	//생성자로 필드초기화(user와 airplaneName 매개값 2개를 받고 user는 부모생성자를 호출)
	//missileAttack() 메소드를 만들어서 내용을 채워보자
	// play()메소드를 오버라이딩하여 AirplaneGame에 맞게끔 재정의 	
	
	
}	
	
class AirplaneGame extends Game{
	String airplaneName;
	
	public AirplaneGame(String user,String airplaneName) {
		super(user);
		this.airplaneName = airplaneName;
	}
	
	public void missileAttack() {
		System.out.println(airplaneName + "비행기가 미사일을 쏩니다.");
		
	}
	@Override
	public void play() {
		super.play();
		missileAttack();
	}
		
}

//Game클래스를 상속받는 LOLGame 클래스를 만든다.
//LOLGame 클래스는 필드는 String charName이다.
//생성자로 필드초기화(user와 charName 매개값 2개를 받고 user는 부모생성자를 호출)
//attack() 메소드를 만들어서 내용채우기
//play() 메소드를 오버라이딩하여 LOLGame에 맞게 재정의

class LOLGame extends Game{
	String charName;
	
	public LOLGame(String user,String charName) {
		super(user);
		this.charName = charName;
	}
	
	public void attack() {
		System.out.println(charName + "이(가) 몬스터를 공격합니다.");
		
	}
	@Override
	public void play() {
		super.play();
		attack();
	}
		
}


public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 할 유저의 이름: ");
		String user = sc.next();

		System.out.println("1.비행기게임 2.롤게임");
		System.out.println("선택: ");
		int choice = sc.nextInt();
		
		Game game = null;
		
		if(choice == 1) {
			
			System.out.println("비행기 이름: ");
			String airplaneName = sc.next();
			
			game = new AirplaneGame(user, airplaneName);
			
			
		}else if(choice ==2) {
			
			System.out.print("캐릭터이름: ");
			String charName = sc.next();
			
			game = new LOLGame(user,charName);
			
		}else {
			System.out.println("잘못입력하셨습니다.");
			System.exit(0);
		}
		
		game.play();
	}

}
