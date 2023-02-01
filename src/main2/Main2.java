package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

public class Main2 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in); //장치로부터 데이터를 받는것이기 때문에 ()안에 뭔갈 채워 넣었음

		// 클래스명 객체명 = new 생성자명(준비물);
//		Book book = new Book(1, "java","가나다",12000L,'B',new Date());	// 괄호에 넣기 위해서 Book클래스에서 세팅해줘야함

		// 위 괄호에 넣음으로 써 충족된거임
//		book.setNo(1);
//		book.setTitle("JAVA");	
//		book.setAuthor("가나다");
//		book.setPrice(12000L);
//		book.setCate('B');
//		book.setDate(new Date());

		// 서점이 생성됨 책을 100권 보관할 수 있는 배열생성
		BookStore bookStore = new BookStore();

		bookStore.setPhone("051-7070-7070");
		bookStore.setAddress("부산 남구");

		// 추가하고자 하는 책을 생성
		Book book = new Book(100, "java", "저자", 1230, 'B', new Date());

		// 서점에 1권의 책 등록
		bookStore.insertBook(book);
		
		
		// 문제1 임의의 책을 2권 생성한후 서점에 등록하기
		Book book1 = new Book(101, "Python", "가나", 10000, 'A', new Date());
		Book book2 = new Book(150, "Spring", "다라", 12300, 'C', new Date());
		
		bookStore.insertBook(book1);
		bookStore.insertBook(book2);
		
		
		//책 삭제
		bookStore.deleteBook();

		// 현재까지 등록된 책 조회
		bookStore.selectBook();
		
		
	}

}
