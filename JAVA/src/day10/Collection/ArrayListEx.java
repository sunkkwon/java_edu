package day10.Collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// arraylist
		ArrayList<String> shoppingCart = new ArrayList<String>();
		
		// 추가
		shoppingCart.add("우유");
		shoppingCart.add("치킨");
		shoppingCart.add("기름");
		
		// 출력
		System.out.println("==== List ====");
		for (String item : shoppingCart) {
			System.out.println(item);
		}
		
		// 위치에 추가
		shoppingCart.add(1, "식빵");

		System.out.println("==== List ====");
		System.out.println(shoppingCart);
		
		// 제거
		shoppingCart.remove(1);

		System.out.println("==== List ====");
		System.out.println(shoppingCart);
		
		//  확인
		boolean hasList = shoppingCart.contains("식빵");
		if(hasList) 
			System.out.println("삭빵이 있음");
		else
			System.out.println("식빵 없음");
		
	}
}
