package condition;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		//주민번호를 입력받아 성별 맞추기
		
		char gender = ' '; //성별
		String ssn = " ";  //주민번호
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하여주세요");
		System.out.println("ex)123456-123456");
		System.out.println("입력 : ");
		
		ssn = sc.next();
		gender = ssn.charAt(7);//문자중에 0부터시작해서 7번째 문자를 뽑는다. 7번째 자리가 성별
		//주민등록번호 1,3은 남자 2,4는 여자 
		
		switch(gender){
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
			
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		
		default:
			System.out.println("유효하지않은 주민번호 입니다.");
		}
	}

}
