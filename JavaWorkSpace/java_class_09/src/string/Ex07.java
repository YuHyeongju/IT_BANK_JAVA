package string;

public class Ex07 {

	public static void main(String[] args) {
		
		//toLowerCase: 문자열에 대문자를 소문자로 변환
		
		String str = "abcDEF";
		
		String lowerCase = str.toLowerCase();
		
		System.out.println("toLowerCase" + lowerCase);
		
		//toUpperCase : 문자열에 소문자를 대문자로 변환
		
		String upperCase = str.toUpperCase();
		
		System.err.println("toUpperCase : " + upperCase);
		
		
		//toString: 문자열을 그대로 반환
		
		
		System.out.println("toString: " + str.toString());
		
		//trim: 문자열에 앞 뒤 공백을 없애준다.
		String str2 = "      java java ja va       ";
		
		System.out.println("trim: " +str2.trim());
		
	}

}
