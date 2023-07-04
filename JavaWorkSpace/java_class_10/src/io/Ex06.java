package io;

import java.io.*;
public class Ex06 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		DataInputStream dis = new DataInputStream(bis);
		
		//데이터를 넣은 순서대로 꺼내야함
		
		int a = dis.readInt();
		double b  = dis.readDouble();
		String c  = dis.readUTF();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		dis.close();
	}

}
