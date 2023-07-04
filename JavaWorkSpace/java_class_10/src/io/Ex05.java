package io;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		
		File file = new File(dir,"aaa.txt");
		
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//버퍼에 담는다 (성능향상)
		DataOutputStream dos = new DataOutputStream(bos);
		//원하는 데이터를 형태로 저장(기능향상)
		
		int a = 100;
		double b = 3.14;
		String c = "Hello World";
		
		dos.writeInt(a); //a값을 int값으로 내보내기
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		dos.close();
		
	}

}
