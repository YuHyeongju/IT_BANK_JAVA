package operation;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("문자열을"+"결합");
		
		System.out.println(2 + "학년" + 10 + "반");
		//한쪽이 문자열이면 +연산자는 문자열 결합연산자로 사용되어 다른 피연자를 문자열로 변환하고 결합한다.
		
		System.out.println("홍길동 나이 : " + 2 + 10 + 5 + "살");
		
		System.out.println("홍길동 나이 : " + (2+10+5) + "살");//17살로 만들고 싶으면 숫자에 우선순위 지정
		
	}

}
