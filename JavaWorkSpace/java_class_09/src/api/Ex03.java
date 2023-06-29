package api;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		//Random r = new Random(123456);
		Random r = new Random(System.currentTimeMillis());
		//종자값(seed)을 설정하여 난수를 발생
		// 기본적으로 System.currentTimeMillis()로 지정하여
		// 종자값이 다르게 설정함
		
		System.out.println(r.nextInt()); //int 범위의 난수발생
		System.out.println(r.nextLong()); //Long 범위의 난수발생
		
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		//0.0 ~ 1.0미만의 Float / double 타입의 난수생성
		
		System.out.println(r.nextBoolean());
		//true False 중 하나 발생 , 반환
		
		byte[] bytes = new byte[5];
		
		r.nextBytes(bytes);
		//byte[]배열에 byte 타입 난수를 발생시켜 채워줌
		
		for(byte b : bytes) {
			System.out.println(b + " ");
		}
		
	}

}
