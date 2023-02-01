package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/* 전화번호 
 * 위치
 * 보유책(100)
 */

@Getter
@Setter
@ToString

public class BookStore {

	private String phone = " ";
	private String address = " ";
	private Book[] books = null; // 내가 만들어 놓은 클래스를 이렇게도 사용 가능
	
	//준비물이 없는 빈 생성자
	public BookStore() {
		//super();	//지워도되는거임
		
		books = new Book[100];
	}
	
	

}
