package condition;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, temp;
		
		System.out.println("첫번째 정수 입력: ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 정수 입력: ");
		num2 = sc.nextInt();
		
		System.out.println("세번째 정수 입력: ");
		num3 = sc.nextInt();
		
		//if문과 temp 변수를 사용해서  num1,num2,num3 작은수로 정렬
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1 > num3) {
			temp = num1;
			num1 = num3;
			temp = num3;
		}
		
		System.out.printf("작은 수로 정렬: %d, %d, %d\n",num1,num2,num3);
	}

}
