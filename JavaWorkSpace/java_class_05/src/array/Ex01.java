package array;

public class Ex01 {

	public static void main(String[] args) {
		
		int intArray1[] = {1,2,3}; 
		//배열에 들어갈 실제 목록을 알고 있을때 선언과 동시에 배열을 생성하면 
		//new 연산자를 생략할 수 있음.
		//배열은 123을 가지고있고, 그 배열의 주소값이 intArray1변수에 저장된다.
		
		System.out.println(intArray1);
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		//배열 사용은 [] 안에 인덱스를 통해서 사용한다.
		
		int intArray2[] = null;
		//배열변수는 null값으로 초기화 할 수 있다.
		
		//intArray2 = {10,20,30}; //배열변수를 이미 선언했다면 중괄호만 사용한 배열 생성이 허용이 안됨
		
		intArray2 = new int[] {10,20,30};
		
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int intArray3[] = new int[3];
		//저장할 배열의 요소의 길이만 지정할 때 
		
		intArray3[0] = 100;
		intArray3[1] = 200;
		intArray3[2] = 300;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
		
		
	}

}
