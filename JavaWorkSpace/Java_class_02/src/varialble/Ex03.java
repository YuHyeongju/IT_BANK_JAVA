package varialble;

public class Ex03 {
	
	
	public static  void main(String[] args) {
		byte  a = 100; //1바이트
		 
		short  b = 200; //2바이트
		
		char  c1 = 'A'; //2바이트
		char  c2 = 65;//char는 내부적으로 정수로 저장되기때문에 오류가 나진 않음 대문자A의 아스키코드
		
		int d  = 1000; //4바이트
		long e = 12345678L; //8바이트
		
		float f = 3.14F;    //4바이트
		double g = 3.141592;  //8바이트
		
		boolean h = true;     //1바이트
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
