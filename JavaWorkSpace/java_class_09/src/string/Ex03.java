package string;

public class Ex03 {

	public static void main(String[] args) {
		
		//String 생성자로 String 객체 생성하기
		
		//배열 전체로  String 객체 생성하기
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //아스키코드
		
		String str1 = new String(bytes);
		
		System.out.println(str1);
		
		//배열의 인덱스 위치부터 길이만큼 String 객체로 생성
		
		String str2 = new String (bytes, 6 ,4); 
		
		System.out.println(str2);
		
		//문자열을 byte 배열로 반환
		String str3 = "Hello Java";
		byte[] byteArray =str3.getBytes();
		
		for(byte b : byteArray ) {//향상된 for문
			//배열에서 꺼낸 요소 저장할 변수 : 배열명
			System.out.print(b + " ");
		}
	}

}
