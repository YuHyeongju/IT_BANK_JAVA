package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("예약 인원 수 입력: ");
		int inwon = sc.nextInt();
		
		String person[] = new String [inwon];
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.println(i+1+"번째 예약 손님 이름: ");
			person[i] = sc.next();
			
		}
		
		System.out.println("총 예약 인원은 " + inwon + "명 입니다.");
		
		for(int i = 0; i < inwon; i++) {
			System.out.println(i+1+"번째 예약 손님은 "+ person[i]+ "님 입니다.");
		}
		sc.close();
	}

}
