package condition;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// switch문을 사용해서 A학점부터 F학점까지 나누긴

		Scanner sc = new Scanner(System.in);

		System.out.println("1~100까지 중 점수를 입력하여 주세요 : ");

		int score = sc.nextInt();
		String grade;
		switch (score / 10) {
		case 10:
		case 9: {
			grade="A학점";
			break;
		}

		case 8: {
			grade="B학점";
			break;
		}
		case 7: {
			grade="C학점";
			break;
		}
		case 6: {
			grade="D학점";
			break;
		}

		default:
			grade="F학점";
		}

		System.out.println("홍길동님의 점수는  : "+ score + "점 입니다.");
		System.out.println("홍길동님의 등급은  : "+ grade + "등급 입니다.");
	}

}
