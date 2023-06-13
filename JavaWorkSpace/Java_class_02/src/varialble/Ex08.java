package varialble;

public class Ex08 {

	public static void main(String[] args) {
		
		byte a = 65;
		char ch =(char)a; //강제타입변환(캐스팅)
		/*char는 음수가 없는 특수 자료형이기 때문에 자동타입변환 예외이다.->강제타입변환해준다.*/
		System.out.println(ch);
		
		int b = 128;
		//byte c = b;// x
		byte c = (byte)b;//캐스팅
		//지정된 타입보다 값이 더 클경우 강제 타입변환을 하면 가장작은값으로 돌아간다.(overflow)
		System.out.println(c);
		
		float e = 3.14f;
		//int f = e;//자동타입변환 불가 
	    int f = (int)e;//소수점부분 잘라내고 정수부분만 저장
	    System.out.println(f);
	}

}
