package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int scores[] = new int [5];
		
		int sum = 0;
		double avg = 0.0;
		
		//for문을 사용하여 5명의 학생의 점수를 입력받아 scores 배열의 각 요소에 저장하기
		
		//for문을 사용하여 각 학생의 점수 출력
		
		// 총 점수의 합과 평균을 구한 후 합과 평균 출력
		
		for (int i = 0; i < 5; i++) {

			System.out.println(i + 1 + "번째 학생의 점수를 입력 : ");

			scores[i] = sc.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 학생의 점수: " + scores[i]);
		}

		for (int i = 0; i < 5; i++) {
			sum += scores[i];
		}

		System.out.println("학생들의 총 점수 : " + sum);

		avg = sum / 5.0;

		System.out.println("학생들의 평균점수 : " + avg);

		sc.close();
	}

}
