package operation;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		String str = (10 > 20) ? "참입니다." : "거짓입니다."; //삼항연산자 :의 앞또는 뒤를 선택하는 연산자
		
		System.out.println(str);
		
		//1~100 까지 정수 중 하나를 입력받아 조건 연산자를 사용하여 정수가 80점이상이면 합격입니다.출력
		//80점 미만이면 불합격입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하여주세요 : ");
		int a = sc.nextInt();
		
		System.out.println((a >=80) ? "합격입니다." : "불합격입니다.");
	}

}
