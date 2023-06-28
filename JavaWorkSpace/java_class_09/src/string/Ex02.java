package string;

public class Ex02 {

	public static void main(String[] args) {
		
		String str = "10";
		
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		
		System.out.println();
		
		str = "3.14";
		
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		
		System.out.println();
		
		str = "True";
		System.out.println(Boolean.parseBoolean(str));
		
	}

}
