package input;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException { //예외처리
		
		System.out.print("키코드 입력하고 엔터 :  ");
		
		int keycode;
		
		keycode = System.in.read();
		//한 바이트의 내용을 읽어냄, 한글을 1바이트로 표현불가
		//숫자와 영문 그리고 특수문자만 입력가능
		System.out.println(keycode); 
		
		
		keycode = System.in.read(); //엔터값 처리 
		System.out.println(keycode);
		
		keycode = System.in.read(); //엔터값 처리
		System.out.println(keycode);
		
		//엔터값 13,10
		
	}

}
