package input;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//원의 반지름을 입력받아 원의 면적을 계산하고 
		//원의 면적을 출력하는 프로그램 작성하기 
		
		//3.14*r*r
		
		System.out.println("원의 반지름을 입력하여주세요 : ");
		
		int r = sc.nextInt();
		
		double area = r * r *3.141592;
		
		System.out.println("원의 면적:" + area);//자바에서는 ,가 아니라 +사용
		
		sc.close();
		
		

	}

}
