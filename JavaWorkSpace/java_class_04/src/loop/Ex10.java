package loop;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("while문 안 입니다. i : "+ i);
			i++;
		}
		System.out.println("while문을 나왔습니다. i : "+ i);
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10 + 20의 정답을 입력하여주세요");
		System.out.println("정답: ");
		int answer = sc.nextInt();
		
		while(answer !=30) {
			System.out.println("정답이 아닙니다. 다시입력하여주세요!!");
			System.out.println("10 + 20의 정답을 입력하여주세요");
			System.out.println("정답: ");
			answer = sc.nextInt();
		}
		System.out.println("정답을 맞추셨습니다.");
		
		System.out.println("입력하신 정답은 : " + answer);
		
		sc.close();
		
	}

}
