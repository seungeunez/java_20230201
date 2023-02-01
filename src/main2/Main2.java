package main2;

import java.util.Date;


import cls.Book;

public class Main2 {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in); //장치로부터 데이터를 받는것이기 때문에 ()안에 뭔갈 채워 넣었음
		
		//클래스명 객체명 = new 생성자명(준비물); 
		Book book = new Book(1, "java","가나다",12000L,'B',new Date());	// 괄호에 넣기 위해서 Book클래스에서 세팅해줘야함
		
		
		
		//위 괄호에 넣음으로 써 충족된거임
//		book.setNo(1);
//		book.setTitle("JAVA");	
//		book.setAuthor("가나다");
//		book.setPrice(12000L);
//		book.setCate('B');
//		book.setDate(new Date());
		
		System.out.println(book.toString());
		
	}

}
