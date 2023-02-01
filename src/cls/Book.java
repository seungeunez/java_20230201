package cls;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor	//빈생성자를 의미함
@AllArgsConstructor	//파라미터 뭐더라 

//책번호 no 책제목 title 저자 author 가격 price 12000 분류 cate 'A','B','C','D', 등록일자 Date
public class Book {
	
	private int no = 0;
	//private Interger no1 = null or 0;	이렇게도 사용 가능 근데 굳이..?
	private String title = "";	// null과 ""는 다르다 null은 아예 없는거고 ""는 뭐라도 있는 거
	private String author = "";
	private long price = 0L;
	private char cate = 'A';	// char은 뭐라도 넣어야함 빈칸이라도.. '' 붙여쓰는거 안됨
	private Date date = null;
	
	
	// 메소드(함수)
//	public void print() {
//	
//	}
	
	//생성자 Constructor 함수명이 클래스명과 같아야함. 반환타입이 없음 -> (void 말하는거)
	
	
	//우클릭 - Source - Generate Constructors Super Class.. 빈거
	//얘는 꼭 만들어 주자 세팅할 때 얘 존재가 사라짐 세팅안해주면 다 안만들어도 되는데 만들면 사라짐  만들어주자
	//안만들면 있는데 만들면 밑의 코드 존재가 사라지니깐 
	//기본 생성자의 생성
	// 이것 넣는거 조차 귀찮아서 @NoArgsConstructor를 넣어주면 밑에 코드가 있다고 생각하는것
//	public Book() {	
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	
	
	
//	// 미리 세팅해주는 것 
//	// 인수있는 생성자의 생성 
//	// 우클릭 - Source - Generate Constructor using Fields.. 넣을거 선택 가능
//	// 이코드를 @AllArgsConstructor 이렇게 줄일 수 있다.
//	public Book(int no, String title, String author, long price, char cate, Date date) {
//		super();
//		this.no = no;
//		this.title = title;
//		this.author = author;
//		this.price = price;
//		this.cate = cate;
//		this.date = date;
//	}
//	
	
}
