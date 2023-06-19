package method;

public class Ex03 {

	public static void profile(String name,int age) {//매개변수
		
		System.out.println("이름은: "+ name);
		System.out.println("나이는: "+ age);
		
	}
	
	
	
	
	public static void main(String[] args) {
		profile("유형주",20); //매개값을 넣어줘야 작동
		
		System.out.println();
		
		String name = "성춘향";
		int age = 22;
		
		profile(name, age);
		
		System.out.println();
		profile("이" + "순신",20 + 12);
	}

}
