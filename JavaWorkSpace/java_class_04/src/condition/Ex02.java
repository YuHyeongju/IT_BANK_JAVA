package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 100 사이 중에 점수를 하나 입력해주세요 : ");
		int score = sc.nextInt();

		// 등급나누기
		if (score >= 90 && score <= 100) {
			System.out.println("A등급");
		}
		if (score >= 80 && score <= 89) {
			System.out.println("B등급");
		}
		if (score < 80) {
			System.out.println("c등급");
		}
		
		//좀 더 편리하게 쓸려고 else문을 사용
		
		System.out.println("==========================================");

		if (score < 80) {
			System.out.println("C등급입니다.");
		} else if (score < 90) {
			System.out.println("B등급입니다.");
		} else {
			System.out.println("A등급입니다.");
		}

	}
}