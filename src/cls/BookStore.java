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
	
	
	public int idx = 0; //현재 배열에 추가되어 있는 책의 위치를 변수로 생성
	
	//생성자는 최초 한 번만 사용 가능하다, 반환값(void)이 없다, 클래스명과 정확하게 일치해야 한다.
	//준비물이 없는 빈 생성자
	public BookStore() {
		//super();	//지워도되는거임
		
		this.books = new Book[100];
	}
	
	
	//책 등록하는 메소드(함수) 기능 필요
	public void insertBook(Book book) {
		if(idx >= 100) {
			System.out.println("책 추가 불가");
		}else {
			this.books[idx] = book;
			idx++;
		}
		
	}
	
	//현재까지 등록된 책 목록을 출력
	public void selectBook() {	//올게 없기에 ()는 비어있는게 맞음 올게 있으면 ()채워넣어야함
		int i = 0;
		for(i=0;i<idx;i++) {
			System.out.println(this.books[i].toString());
		}
	}
	
	

}
