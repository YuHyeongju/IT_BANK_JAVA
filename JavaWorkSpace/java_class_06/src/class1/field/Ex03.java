package class1.field;

class Book{
	
	public String title;
	public String author;
	public int totalPage;
	
}

public class Ex03 {

	public static void main(String[] args) {
		//Book 클래스에서 Book객체를 생성하고
		//필드값을 초기화한 후 필드 출력
		
		
		Book book = new Book();
		
		book.title = "자바";
		book.author = "홍길동";
		book.totalPage = 385;
		
		
		
		System.out.println("제목: " + book.title);
		System.out.println("저자" + book.author);
		System.out.println("총 페이지 수" + book.totalPage);
		
	}

}
