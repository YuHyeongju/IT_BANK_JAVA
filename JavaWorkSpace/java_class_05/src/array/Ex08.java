package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nums[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 정수 입력: ");
			nums[i] = sc.nextInt();
		}

		int temp = 0;

		// 이중 for문을 사용하여 nums배열 안의 5개의 숫자를
		// index 0 부터 작은 수 로 만들기
		// (배열, for문 ,if문 ,temp변수 사용)

		for (int i = 0; i < 5; i++) { // i가 0일때 j = 1234돈다 i가1일때 j는 234돈다....

			for (int j = i + 1; j < 5; j++) {

				if (nums[i] > nums[j]) {

					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}
			}
		}

		System.out.printf("작은 수로 정렬 : %d, %d, %d, %d ,%d\n", nums[0], nums[1], nums[2], nums[3], nums[4]);

		sc.close();
	}

}
