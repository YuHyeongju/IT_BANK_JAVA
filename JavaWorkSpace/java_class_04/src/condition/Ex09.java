package condition;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.println("출생년도를 입력:  ");
		year = sc.nextInt();
		
		//쥐,소,범,소,토끼,용,뱀,말,양,원숭이,닭,개,돼지
		//출생년도 / 12 = 원숭이띠는 나머지가 0
		
		switch(year%12) {
		case 0:
			System.out.println("원숭이띠 입니다.");
			break;
		case 1:
			System.out.println("닭띠입니다.");
			break;
		case 2:
			System.out.println("개띠입니다.");
			break;
		case 3:
			System.out.println("돼지띠입니다.");
			break;
		case 4:
			System.out.println("쥐띠입니다.");
			break;
		case 5:	
			System.out.println("소띠입니다.");
			break;
		case 6:
			System.out.println("호랑이띠입니다.");
			break;
		case 7:
			System.out.println("토끼띠입니다.");
			break;
		case 8:
			System.out.println("용띠입니다.");
			break;
		case 9:
			System.out.println("뱀띠입니다.");
			break;
		case 10:
			System.out.println("말띠입니다.");
			break;
		case 11:
			System.out.println("양띠입니다.");
			break;
			
		}
	}

}
