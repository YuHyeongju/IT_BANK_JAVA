package method;

import java.util.Scanner;

public class Ex05 {

	//1. 전원을 켭니다 .출력해주는 powerOn메소드만들기
	// 전원을 끕니다 .출력해주는 powerOff 메소드만들기
	
	//2. 두개의 정수를 매개변수로 받아서 더한 다음 결과를 반환해주는 메소드 만들기 add
	// 	 두개의 정수를 매개변수로 받아서 뺀 다음 결과를 반환해주는 메소드 만들기  subtract
	// 	 두개의 정수를 매개변수로 받아서 곱한 다음 결과를 반환해주는 메소드 만들기 multiply
	// 	 두개의 실수를 매개변수로 받아서 나눈 다음 결과를 반환해주는 메소드 만들기 devide
	
	//3. 정수 하나를 매개변수로 받아서 그 정수를 출력해주는 메소드 만들기 outPut
	//3. 정수 하나를 매개변수로 받아서 그 실수를 출력해주는 메소드 만들기 outPut
	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
		System.exit(0);//프로그램 종료
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double devide(double a, double b) {//정수값이 들어와도 자동타입변환이 된다.
		return a / b;
	}
	
	public static int outPut(int z) {
		System.out.println("결과 값: "+z);
		return z;
	}
	public static double outPut(Double z) {
		System.out.println("결과 값: "+ z);
		return z;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		powerOn();
		
		while(true) {
			System.out.println("=====================================");
			System.out.println("1.더하기 2. 빼기 3.곱하기 4.나누기 5.전원끄기");
			System.out.println("=====================================");
			System.out.println("선택: ");
			int choice = sc.nextInt();
			
			if(choice == 5) {
				powerOff();
			}else if(choice < 1 || choice > 5){
				System.out.println("잘못입력하였습니다.");
				continue;
			}
			System.out.println("첫번째 계산할 정수 입력 : ");
			int a = sc.nextInt();
			System.out.println("두번째 계산할 정수 입력 : ");
			int b = sc.nextInt();
			
			switch(choice) {
			case 1: 
				outPut(add(a , b));
				break;
			case 2:
				outPut(subtract(a , b));
				break;
			case 3:
				
				outPut(multiply(a , b));
				break;
			case 4:	
				outPut(devide(a , b));
				break;
			}
		}
		
		
			
	}

}
