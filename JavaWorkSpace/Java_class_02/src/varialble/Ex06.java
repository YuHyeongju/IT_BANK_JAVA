package varialble;

public class Ex06 {
	public static void main(String[] args) {
		
		//byte a =128; //저장불가능 -128 ~ 127까지 저장가능
		byte b = 127;
		byte c = -128;
		
		System.out.println(b);
		System.out.println(c);
		
		long d = 1234567891L;
		float e = 123456789123456789123.0f;//실수는 정수보다 더 큰 수를 저장할 수 있다.
		
		System.out.println(d);
		System.out.println(e);
		
		double f = 3e2;//300.0 3 X 10제곱
		double g = 5e-3;//0.005 5 X 3분의1승 
		//부동소수점 방식에서 e 또는 E는 10의 지수를 나타낸다.
		
		System.out.println(f); 
		System.out.println(g);
		
	}
	
	
}
