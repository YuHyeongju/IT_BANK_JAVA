package io;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("안녕하세요");
		pw.println("오늘은 종강일 입니다.");
		pw.println("언제나 화이팅 하세요");
		
		pw.close();
	}

}
