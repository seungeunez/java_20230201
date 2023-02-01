package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// @ctrl+space 누르면 나옴

// public static void main(String[] args)가 없으면 실행이 안된다
//그래서 위의 코드가 있는 클래스에서 호출해서 써야함

//클래스
public class Item {	//Item이라는 타입

	private long no = 0L; // 물품번호
	private String name = null; // 물품명 문자열은 null로 초기화를 많이 함
	private String content = null; // 물품내용
	private int price = 0; // 가격
	private long quantity = 0L; // 수량
	private Date date = null;

	// 메소드 == 함수 (특정한 기능 구현) main에서 호출할거임
	public void discountPrice(float per) {
		// 현재가격에서 per만큼 빼야함
		// 변수, 조건문, 반복문, 배열을 써서 만들어 내야함
		// 기초 문법은 이런 곳에 들어가는 거였음
		this.price = (int) (this.price - (this.price * per));

	}

	public void checkQuantity(int num) {
		if (this.quantity < num) {
			//this.quantity = this.quantity + num;
			this.quantity = 1000;
		}
	}

}
