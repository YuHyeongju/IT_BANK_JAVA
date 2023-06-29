package string;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//Scanner를 사용해서 문자열로 주민번호를 입력받아
		//String 메소드를 이용하여 성별 맞추기
		
		System.out.println("예) 123456-1234567");
		System.out.println("주민등록번호를 입력하여주세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		String Jumin = sc.next();
		
		char gender = Jumin.charAt(7);
		
		if(gender == 1 || gender == 3) {
			
			System.out.println("남자입니다.");
			
		}else if(gender == 2 || gender == 4) {
			
			System.out.println("여성입니다.");
			
		}else {
			
			System.out.println("유효하지않은 주민등록번호 입니다.");
			
		}
		
		
	}

}
