package main2;

import java.util.Date;

import cls.Item;

//복습
/*
-원시타입
정수 타입	byte, short, int, long
문자 타입   char
실수 타입	float, double
논리 타입	boolean

-클래스
정수 타입 Byte, Short, Integer, Long
문자 타입 Character
실수 타입 Float, Double,
논리 타입 Boolean
문자열 타입 : String
날짜 타입 : Date

위에 없는 것들은 내가 직접 클래스를 만들어야 함
ex) Member, Board, Item

여기 있는것들은 전부 배열을 만들 수 있음
 */

public class Main1 {

	public static void main(String[] args) {

		// 배열 위치번호 0부터 시작함 마지막은 (전체 개수-1)개 이다.
		int[] a = new int[5]; // 배열이 5개 생성됨. 초기화 0으로 설정된다
		int[] b = { 1, 4, 5, 2, 7 }; // 배열이 5개 생성됨. 내가 직접 설정한 값으로 1,4,5,2,7로 초기화 된다

		String str[] = new String[5]; // 문자열 배열 5개 생성. 초기값은 null로 설정된다

		int i = 0;
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println();

		// 반대로 출력
		for (i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}

		System.out.println();

//////////////////////////////////////////////////////////////////////////////////

		Item[] items = new Item[5]; // Item 배열이 5개 생성, 초기값은 null로 설정됨
		for (i = 0; i < items.length; i++) {
			// 클래스명 객체명 = new 생성자명==클래스명();

			/* System.out.println(items[i].toString());    바로 출력하려고 하면 
														내용이 없어서 출력이 안됨 에러남 */

			Item obj = new Item();				
			
			// 반복문을 돌려서 값을 생성시켜줌	
			obj.setNo(i);
			obj.setName("물품명" + i);
			obj.setContent("물품내용" + i);
			obj.setPrice(1000 + i);
			obj.setQuantity(100L + i);
			obj.setDate(new Date());

			items[i] = obj;
		}
		for (i = 0; i < items.length; i++) {
			System.out.println(items[i].toString());
		}

	}

}
