package input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Scanner를 사용하여 이름, 나이, 키 ,몸무게를 입력받고 해당변수에 저장후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요 : ");
		double h = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요 : ");
		double w = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(h);
		System.out.println(w);
		
		sc.close();
		
	}

}
