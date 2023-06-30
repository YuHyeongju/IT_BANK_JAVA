package collection;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		//String 타입의 ArrayList를 생성한 후 
		//연애인 5명의 이름을 저장하기 
		//이름을 향상된 for문과 일반for으로 출력하기
		
		ArrayList<String> list = new ArrayList<String>();
											  //<안에 생략가능> 						
		list.add("송중기");
		list.add("송지효");
		list.add("소간지");
		list.add("톰크루즈");
		list.add("톰홀랜드");
		
		for(String name : list) {//향상된 for문
			
			System.out.println(name);
			
		}
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			
			String name = list.get(i);
			System.out.println(i + " : " + name);
			
		}
		
	}

}
