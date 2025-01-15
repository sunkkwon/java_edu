package day10.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		// map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 추가
		map.put("제이", 100);
		map.put("리사", 90);
		map.put("로제", 80);
		map.put("지수", 70);
		
		System.out.println(map);
		
		// 추가
		map.put("제이", 50);
		map.put("제이", 55);
		
		System.out.println(map);
		
		System.out.println("제이 점수: " + map.get("제이"));
		System.out.println("지수 점수: " + map.get("지수"));
		
		// map 반복
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// map 반복 2
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " " + val);
		}
		
		System.out.println();
	}
	
}
