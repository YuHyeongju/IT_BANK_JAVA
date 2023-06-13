package varialble;

public class Ex07 {

	public static void main(String[] args) {
		
		byte a = 10;
		int b = a;
		
		//char ch = a; //자동타입변환 불가 - 음수를 저장할수있는 byte타입을 
		             //저장할수없는char타입으로 변환할수없다.
		System.out.println(b);
		
		byte c = 10;
		byte d = 20;
		
		//byte result1 = c + d; //오류 c와d가 자동타입변환이 되어 int형으로 변환되는데 그것을 바이트에 넣으려고
		                      //하니 넣을수가없다.
		int result2 =c + d;//int 형으로 받아줘야함
		System.out.println(result2);
		
		int e = 10;
		double f = 10.2;
		//int 타입의 피연산자가 double 타입으로 자동변환되어 연산
		double result3 = e + f;
		System.out.println(result3);
		
		char ch1 = 'A';
		int g = ch1; //char 값은 실제로는 정수로 저장 
		
		System.out.println(g);
	}

}
