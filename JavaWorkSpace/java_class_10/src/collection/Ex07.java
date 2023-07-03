package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		
		//데이터 넣기
		map.put(new Integer(1),new String("홍길동"));	
		map.put(2, "성춘향");
		map.put(3, "이몽룡");
		map.put(1, "홍길순");
		//동일한 key 객체로 저장하는 코드를 작성하면 value 객체가 대체된다.
		
		int size = map.size(); // 저장된 Entry 수 반환
		
		System.out.println("전체 Entry 수 : " + size);
		
		System.out.println(map); //전체출력
		
		String str1 = map.get(1); 
		//key 객체를 통해서 value 객체를 얻을 수 있다.
		System.out.println(str1);
		System.out.println();
		
		//객체를 하나씩 처리
		Set<Integer> keySet = map.keySet();
		//전체 key 객체의 목록을 Set타입으로 변환
		
		Iterator<Integer> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			String value = map.get(key);
			
			System.out.println("key : " + key + "value" + value);
		}
		System.out.println();
		
		map.remove(1); //key객체로 Entry 삭제
		map.remove(2);
		
		System.out.println(map);
		
		map.clear(); //전체삭제
		
		if(map.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
