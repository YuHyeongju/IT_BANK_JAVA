package array;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("동전으로 교환할 돈 입력: ");
		
		int money = sc.nextInt();
		
		int coin[] = {500, 100, 50, 10};
		
		//1770 >> 500원 3개, 100원 2개 , 50원 1개 , 10원 2개
		
		//for문과 배열을 사용하여 500원 부터 동전의 갯수 출력하기
		
		for(int i = 0; i < coin.length; i++) {
			
			System.out.println(coin[i] + "원 : " + (money/coin[i]) + "개");
			money = money % coin[i];//각 동전으로 교환하고 남은 돈 저장
			
		}
		
		System.out.println("잔돈: "+ money +"원");
		sc.close();
	}
}
