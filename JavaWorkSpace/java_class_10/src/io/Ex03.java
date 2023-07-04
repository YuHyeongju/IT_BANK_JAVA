package io;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true); //FileOutputStream 객체생성
		
		//파일이 없으면 만든다.
		//객체생성시 true면 이어쓰기, false면 다시쓰기, 디폴트 false
		
		//fos.write(65); //아스키코드
		//한 바이트의 내용 전송
		//fos.write('B');
		
		String msg = "Hello Java";
		
		byte[] byteArray = msg.getBytes();
		
		fos.write(byteArray,6,4);
		//byte배열의 인덱스 6부터 4길이 만큼 데이터 전송
		
		fos.close();
		
		
	}

}
