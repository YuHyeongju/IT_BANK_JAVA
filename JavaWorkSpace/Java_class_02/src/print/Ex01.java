package print;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("print()는 ()안에 내용 출력후 줄바꿈을 하지않음");
		
		System.out.println("확인");
		
		System.out.println();// 줄바꿈만 한다.
		
		System.out.printf("좋은하루 되세요~!!");//println이랑 다르게 줄바꿈을 하지않음
		
		System.out.printf("이름 : %s\n", "홍길동");
		
		System.out.printf("나이 : %d\n", 20);
		
		System.out.printf("이름 : %s, 나이: %d\n", "성춘향", 20 );

	}

}
