package main2;

import java.util.Date;

import cls.Book;

public class Main2 {

	public static void main(String[] args) {
		//클래스명 객체명 = new 생성자명(준비물); 
		Book book = new Book(1, "java");	// 괄호에 넣기 위해서 Book클래스에서 세팅해줘야함
		
		
//		book.setNo(1);
//		book.setTitle("JAVA");	//위 괄호에 넣음으로 써 충족된거임
		book.setAuthor("가나다");
		book.setPrice(12000L);
		book.setCate('B');
		book.setDate(new Date());
		
		System.out.println(book.toString());
		
	}

}
