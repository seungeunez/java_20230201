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

//get은 값을 가져오는 것
//set은 값을 지정하는 것
//사용이유? 외부로부터 변수값에 직접적으로 접근하는것을 막기 위해서

public class BookStore {

	private String phone = " "; // 메소드를 통해 기능을 바꾸는것 public 여기서
	private String address = " ";
	private Book[] books = null; // 내가 만들어 놓은 Book 클래스를 이렇게도 사용 가능

	public int idx = 0; // 현재 배열에 추가되어 있는 책의 위치를 변수로 생성
						// 외부에서 필요로한 정보가 아니니깐 constructor 생성하면 안된다.
						// 내가 필요해서 만든거니깐

	// 생성자는 최초 한 번만 사용 가능하다, 반환값(void)이 없다, 클래스명과 정확하게 일치해야 한다.
	// 준비물이 없는 빈 생성자
	public BookStore() {
		// super(); //지워도되는거임

		this.books = new Book[100]; // 100개까지 넣을 수 있다는 뜻, 값은 지정 안했음 내가 해야하는거
									// this 붙이자 연습해
	}

	// 책 등록하는 메소드(함수) 기능 필요
	public void insertBook(Book book) { // Book 클래스에 book 정보들이 있으니깐 들고오는거임
		if (idx >= 100) { // 책을 100개 등록 초과하면 추가 불가라고 뜸
			System.out.println("책 추가 불가");
		} else {
			this.books[idx] = book; // books[0]을 book에 집어 넣는 거임
			idx++;
		}
	}

	// 현재까지 등록된 책 목록을 출력
	public void selectBook() { // 올게 없기에 ()는 비어있는게 맞음 올게 있으면 ()채워넣어야함
		int i = 0;
		for (i = 0; i < idx; i++) {
			System.out.println(this.books[i].toString());
		}
	}

	// 마지막 등록한 책을 삭제하는 기능
	public void deleteBook() {
		if (idx > 0) { // 지금 index 값이 2니깐 idx>0에 충족해서 -1하면 마지막에 등록된 책이 삭제되는것임
						// 최종 index 값을 -1해서 마지막에 등록된 책이 삭제되는 이유
			idx--;
		}

	}

	
	// 등록한 책의 가격을 전달받은 할인율 변경 메소드
	public int discountPrice(float per) {// int는 성공과 실패한것도 main2(갑)에 알려주겠다는 뜻임 void는 안알려줌 지들끼리하고 입싹닫음

		int i = 0;
		for (i = 0; i < idx; i++) {

			// 현재 가격임 Book 클래스에서 price 값을 가져온것 그래서 getPrice
			long price = books[i].getPrice();

			// 실수형 => 정수 => 결과 값에 손실이 일어남
			// long => int => 좋은 방법 아님
			// int = > long => 괜찮음 작 => 큰 되는데 큰=>작 안됨
			long result = (long) (price - (price * per));
			this.books[i].setPrice(result); // Book클래스에 있는 Price 값에 저장한다는 의미로 setPrice 사용

		}
		return 1;

	}
	 //public int는 int형의 return값이 있어야함 double은 double형의 return값이 있어야하고
	 //public void는 아무것도 반환하지 않음
	
	

	// 가격이 1000원 이상인 책 수량을 반환하는 메소드
	public int priceQuery(int pr) {
		int cnt = 0;
		for (int i = 0; i < idx; i++) {
			if (this.books[i].getPrice() >= pr) { // Book 클래스에서 값 가져오는것
				cnt++;
			}
		}
		System.out.println(cnt); // 없으면 출력이 안돼
		return cnt;
	}

	// 분류 코드가 전달받은 값이 항목만 출력하는 메소드
	public void printCate(char cate) {
		for (int i = 0; i < idx; i++) {
			if (this.books[i].getCate() == cate) {
				System.out.println(this.books[i].toString());
			}

		}
	}

}
