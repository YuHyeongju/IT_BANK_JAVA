package print;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 3.14);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("문자열 : %s\n", "Hello World");
		System.out.println();
		System.out.printf("%5d\n", 123);
		//서식지정자안에 숫자를 넣으면 출력시 해당 위치에 숫자 값만큼 공간확보를 하고 값을 출력
		//왼쪽이 공백으로 채워진다.
		System.out.printf("%-5d\n", 123);
		//오른쪽이 공백으로 채워진다.
		System.out.printf("%.2f\n", 12.1234);
		//실수값을 출력할때 서식지정자안에 %.숫자f로작성하면 해당숫자까지의 소수점자리를 출력해줌
		System.out.printf("%7.2f\n", 12.1234);
	}
}
