package io;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		
		File file = new File("C:\\aaa");//파일의 경로를 준다.
		//파일이 존재하지 않아도 상관없음
		
		
		File file1 = new File("C:\\aaa\\aaa.txt");
		//파일의 경로까지만 설정 하여 객체생성을 할 수 있다.
		
		File file2 = new File(file1, "aaa.txt");
		//파일경로에 객체를 넣어서 만들수 있음
		
		//윈도우 폴더 구별자 : \\
		//리눅스 폴더 구별자 : //
		
		//File.separator : 폴더 구별자
		
		File dir = new File("C:" + File.separator + "aaa");
		File file3 = new File(dir, "aaa.txt");
	}

}
