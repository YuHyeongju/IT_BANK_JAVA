package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		Date now = new Date();
		//현재 시스템의 시간으로 객체를 생성
		// 그 외에는 잘 사용안함.
		
		System.out.println(now.toString());
		
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy.MM.dd"); //날짜 포맷변경
		SimpleDateFormat sdf2 = new SimpleDateFormat("a hh:mm:ss"); //시간 포맷 변경
		
		String date = sdf1.format(now);
		String time = sdf2.format(now);
		
		System.out.println("Date : " + date);
		System.out.println("Time : " + time);
		
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		//추상클래스로써 직접 객체를 생성하지않음
		// getInstance 메소드는 Calender 클래스를 구현한 클래스의 인스턴스를 반환
		
		int year = cal.get(Calendar.YEAR);
		//get메소드에 인자로 Calendar의 필드를 주어서 해당하는값을 정수로 얻을 수 있다.
		
		int month = cal.get(Calendar.MONTH) + 1;
		
		//사람은 1월부터 12월이지만  컴퓨터는 0월부터 11월이라 +1을 해줘야한다.
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜 : %d년 %d월 %d일\n", year, month, day);
		
		//cal.get(Calendar.HOUR); //12시간제 
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간제
		
		int minute =cal.get(Calendar.MINUTE);
		int second =cal.get(Calendar.SECOND);
		
		System.out.printf("현재시간 : %d시 %d분 %d초\n", hour, minute, second);
	}

}
