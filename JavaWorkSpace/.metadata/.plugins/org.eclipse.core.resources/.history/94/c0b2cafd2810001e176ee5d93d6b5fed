package class1.array;

import java.util.Scanner;

class Member {// 필드
	private String id;
	private String pw;
	private String name;

	public Member(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getID() { // 메소드
		return id;
	}

	public void setID(String iD) {
		id = id;
	}

	public String getPW() {
		return pw;
	}

	public void setPW(String pW) {
		pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class MemberService {

	Member[] member = new Member[3];
	Scanner sc = new Scanner(System.in);

	public void memberJoin() {
		// 반복문을 사용해서 회원의 아이디,비밀번호, 이름을 입력받아
		// Member 객체를 생성한 후
		// member배열의 각 요소에 저장

		for (int i = 0; i < member.length; i++) {

			System.out.println(i + 1 + "회원의 아이디:");
			String id = sc.next();

			System.out.println(i + 1 + "회원의 비밀번호:");
			String pw = sc.next();

			System.out.println(i + 1 + "회원의 이름:");
			String name = sc.next();

			member[i] = new Member(id, pw, name);
		}

	}

	public void memberList() {
		// 반복문으로 member 배열 안의 각 요소에 접근하여
		// 회원의 아이디, 비밀번호, 이름,출력

		for (int i = 0; i < member.length; i++) {
//		System.out.println("회원의 아이디: "+ member[i].getID());
//		System.out.println("회원의 비밀번호: "+ member[i].getPW());
//		System.out.println("회원의 이름: "+ member[i].getName());

			String id = member[i].getID();
			String pw = member[i].getPW();
			String name = member[i].getName();

			System.out.println("===========================");
			System.out.println(i + 1 + "회원의 아이디: " + id);
			System.out.println(i + 1 + "회원의 비밀번호: " + pw);
			System.out.println(i + 1 + "회원의 이름: " + name);
			System.out.println("===========================");

		}
	}
}

public class Ex03 {

	public static void main(String[] args) {

		MemberService ms = new MemberService(); 

		ms.memberJoin();

		ms.memberJoin();

		
//		해당 코드는 MemberService 클래스의 인스턴스를 생성하여 ms 변수에 할당하는 코드입니다.
//
//		반면에 new MemberService(); 이 코드는 단순히 MemberService 클래스의 새로운 인스턴스를 생성하는 코드입니다. 
//
//		이 경우에는 생성된 인스턴스에 대한 참조를 어떠한 변수에도 할당하지 않았으므로, 생성된 인스턴스를 추후에 사용할 수 없습니다.
//
//		따라서 위의 두 코드의 차이점은 인스턴스의 할당 여부입니다. 첫 번째 코드에서는 생성된 인스턴스를 ms 변수에 할당하여 나중에 
//		사용할 수 있지만,  두 번째 코드에서는 인스턴스를 할당하지 않았기 때문에 이후에는 사용할 수 없습니다.
		
		
		
	}

}
