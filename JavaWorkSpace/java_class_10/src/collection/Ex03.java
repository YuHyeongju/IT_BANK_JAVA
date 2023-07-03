package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("바나나");
		list.add("수박");
		list.add("포도");
		list.add("딸기");
		
		Iterator<String> iterator=list.iterator();
		//반복자: 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것.
		
		//hasNext : 컬렉숀에 저장된 요소 있음 -> true, 없음 -> false 반환
		//next: 컬렉션에 저장된 다음요소를 가져온다.
		//remove : next메소드로 가져온 요소를 삭제한다.
		
		while(iterator.hasNext()) {
			
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		
		System.out.println();
		//iterator는 일회성이다. 
		//필요하면 객체를 다시 얻어와야한다.
		iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
			iterator.remove();
		}
		
		if(list.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}	

}
