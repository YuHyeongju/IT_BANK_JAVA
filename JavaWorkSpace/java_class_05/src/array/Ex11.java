package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int total[] = new int[3];
		int rank[] = new int[3];

		// 1.for문을 사용하여 각 배열에 데이터를 입력받아 넣기
		// (이름,국어점수,영어점수) 입력받으면서 총점 구하기

		// 2.순위구하기(이중 for문, if문)
		// 우선 1등으로 초기화 한 후 다른 학생 성적의 총점과 내 성적의 총점을 비교한 후
		// 내 성적의 총점이 더 작다면 순위를 하나 올려줌

		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 학생의 이름을 입력하여주세요: ");
			name[i] = sc.next();

			System.out.println(i + 1 + "번째 학생의 국어 성적을 입력하여주세요: ");
			kor[i] = sc.nextInt();

			System.out.println(i + 1 + "번째 학생의 영어 성적을 입력하여주세요: ");
			eng[i] = sc.nextInt();

			total[i] = kor[i] + eng[i];

		}

		for (int i = 0; i < 3; i++) {

			rank[i] = 1;

			for (int j = 0; j < 3; j++) {

				if (total[i] < total[j]) {

					rank[i]++;

				}

			}
		}
		for (int i = 0;  i< 3; i++) {
			
			System.out.printf("%s님의 총점은 %d점이고, 순위는  %d등 입니다.\n", name[i], total[i], rank[i]);
			
		}
	}
}
