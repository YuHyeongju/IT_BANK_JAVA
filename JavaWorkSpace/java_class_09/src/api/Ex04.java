package api;

public class Ex04 {

	public static void main(String[] args) {
		
		//Math클래스는 여러가지 수학적인 함수의 기능을 이용하기 위해 사용되는 클래스
		//모든메소드는 정적으로 구성 되어있어 클래스로 편하게 접근가능 
		
		//abs 메소드는 매개값으로 넘긴 데이터의 절대값을 반환
		int a = Math.abs(-10);
		System.out.println(a);
		
		int b = Math.max(1, 9);
		//max메소드는 전달된 데이터 중 더 큰 수 반환
		
		System.out.println(b);
		
		int c = Math.min(1, 9);
		//min메소드는 전달된 데이터 중 더 작은 수 반환
		System.out.println(c);
		
		double d = Math.random();
		System.out.println(d);
		
		double e =Math.ceil(1.1);
		//ceil 메소드는 전달된 데이터를 올림하여 반환
		System.out.println(e);
		
		Double f = Math.floor(9.9);
		//floor 메소드는 전달된 데이터를 버림하여 반환
		System.out.println(f);
		
		long g =Math.round(5.3);
		long h = Math.round(5.7);
		//round 메소드는 전달된 데이터를 반올림하여 반환
		System.out.println(g);
		System.out.println(h);
	}

}
