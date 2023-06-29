package api;

import java.util.Calendar;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//Calendar 클래스를 사용하여
		// 년도와 월을 입력받아 달력만들기
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("조회 할 년도 입력: ");
		 int year = sc.nextInt();
		 
		 System.out.println("조회 할 월을 입력: ");
		 int month = sc.nextInt();
		 
		 Calendar cal = Calendar.getInstance();
		 
		 
		 cal.set(year, month - 1 ,1);
		 //입력한 년도와 월 그리고 해당월의 1일로 초기화
		 
		 int week = cal.get(Calendar.DAY_OF_WEEK);
		 //월의 시작을 의미 
		 //1~7까지의 값을 반환(일 ~ 토요일을 의미)
		 int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 // 해당 월에 나타날 수 있는 최대 날짜값 반환
		 // 예) 2023년 6월 >> 30 반환
		 
		 System.out.println("week: " + week + ", lastDay : " + lastDay);
		 
		 //week 와 lastDay를 사용하여 달력만들기
	}

}
