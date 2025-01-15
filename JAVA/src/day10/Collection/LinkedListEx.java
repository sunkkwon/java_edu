package day10.Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> invList = new LinkedList<String>();
		
		invList.add("모자 - 10개");
		invList.add("바지 - 20개");
		invList.add("셔츠- 30개");
		
		System.out.println("==== 재고 목록 ====");
		System.out.println(invList);
		
		// 첫번째, 마지막 item 가져오기
		String firstItem = invList.getFirst();
		String lastItem = invList.getLast();
		
		System.out.println("첫번째 아이템 " + firstItem);
		System.out.println("마지막 아이템 " + lastItem);
		
		// 첫번째, 마지막 item 추가
		invList.addFirst("신상 - 100개");
		invList.addLast("이월상품 - 200개");
		System.out.println("==== 재고목록 ====");
		System.out.println(invList);
		
	}
}
