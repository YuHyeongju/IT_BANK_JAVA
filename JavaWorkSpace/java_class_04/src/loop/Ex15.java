package loop;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		
		do {
			
			System.out.println("[1]아메리카노 [2]라떼 [3]오렌지주스 [4] 그만주문");
			System.out.println("손님 어떤 메뉴를 주문하시겠습니까?");
			System.out.println("입력:  ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("#아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("#라떼 주문하셨습니다.");
				break;
			case 3:
				System.out.println("#오렌지주스 주문하셨습니다.");
				break;
			case 4:	
				System.out.println("#다음에 또 오세요~~!!");
				break;
			default:
				System.out.println("잘못 주문하셧습니다.");
			}
			
			
		}while(menu != 4);
			
			
	}

}
