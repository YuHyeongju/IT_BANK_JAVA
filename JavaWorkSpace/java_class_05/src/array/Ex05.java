package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 배열과 for문을 사용해서 3명의 이름을 입력 받은 후
		// 배열의 각 요소에 저장하고 출력하기

		Scanner sc = new Scanner(System.in);

		String name[] = new String[3];

		for (int i = 0; i < name.length; i++) {
			
			System.out.println(i + 1 + "번 째 이름을 입력: ");
			name[i] = sc.next();
			// scanner로 읽어온 이름을 name 배열의 각 요소에 저장
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 입력한 이름 : " + name[i]);
		}

		sc.close();

	}

}
