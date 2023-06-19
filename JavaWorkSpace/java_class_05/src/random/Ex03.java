package random;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 로또게임

		Scanner sc = new Scanner(System.in);

		int[] lotto = new int[6];
		int[] myLotto = new int[6];
		int count = 0;

		// 1. lotto 배열에 중복 수 없이 1 ~ 45 번호를 각 요소에 저장하기
		

		for (int i = 0; i < 6; i++) {

			lotto[i] = ((int) Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {

					i--;
					break;

				}
			}
		}

		// 2. Scanner를 사용하여 myLotto 배열에 1 ~ 45 번호를 각 요소에 저장하기
	    // myLotto 배열도 중복수 X, 1~45까지만 받게끔 조건걸기
				
		for (int i = 0; i < 6; i++) {

			
			System.out.print(i+1+"번째 로또번호를 입력: ");
			myLotto[i] = sc.nextInt();
			
			
			if( myLotto[i] < 1 || myLotto[i] > 45) {//1~45까지 로또번호 입력받기
				
				System.out.println("1부터 45사이의 번호를 입력하여주세요");
				
				i--;
				
				continue;
			}
			for(int j = 0; j < i; j++) {
				
				if(myLotto[i]==myLotto[j]) {
					
					System.out.println("전과 같은 수를 입력할 수 없습니다.");
					i--;
					break;
				}
				
			}

		}
		// 3. lotto배열과 mylotto 배열의 각 요소를 비교하여
		// 몇 개의 수가 일치되는지 확인후 count변수에 일치되는 수 저장
		for(int i = 0; i < 6; i++) {
			
			for(int j=0; j < 6; j++) {
				
				if(lotto[i] == myLotto[j]) {
					
					count++;
					
				}
			}
		}
		System.out.printf("이번주 로또번호는 %d, %d, %d, %d, %d, %d 입니다.\n",lotto[0],lotto[1],lotto[2],lotto[3],
				lotto[4],lotto[5]);
		
		System.out.println(count +"개를 맞추셨습니다.");
		sc.close();

	}
}
