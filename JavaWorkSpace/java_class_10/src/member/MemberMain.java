package member;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		MemberServiceImpl service = new MemberServiceImpl();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("######## 회원가입 프로그램##########");
			System.out.println("## 1.회원목록 2.회원가입 3.회원조회##");
			System.out.println("## 4.회원수정 5.회원삭제 6.종료##");
			System.out.println();

			System.out.println("메뉴선택 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				service.memberList();
				break;
			case 2:
				service.memberJoin();
				break;
			case 3:
				service.memberInfo();
				break;
			case 4:
				service.memberEdit();
				break;
			case 5:
				service.memberDelete();
				break;
			case 6:
				System.out.println("회원관리 프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
