package class1.array;


class Book{
	String  title;
	String  author;
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " : " + author);
	}
	
}




public class Ex01 {

	public static void main(String[] args) {
		
		
		Book[] book = new Book[5];
		//길이가 5인 Book 타입의 배열생성
		
		book[0] = new Book("자바","홍길동");
		//Book 객체를 생성해서 배열의 각 요소에 주소값을 저장
		book[1] = new Book("jsp","성춘향");
		book[2] = new Book("spring","이순신");
		book[3] = new Book("db","이몽룡");
		book[4] = new Book("python","장보고");
		
		System.out.println(book[0].title); //객체배열 사용
		System.out.println(book[0].author);
		
		System.out.println();
		
		for(int i = 0; i <book.length; i++) {
			book[i].showInfo();
		}
		
	}

}
