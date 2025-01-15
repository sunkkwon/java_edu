package day10.Collection;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector<String> studentList = new Vector<String>();
		
		// 추가
		studentList.add("권순길");
		studentList.add("나덕순");
		studentList.add("권재현");
		studentList.add("권나현");
		
		System.out.println("==== 가족 명단 ====");
		System.out.println(studentList);
		System.out.println("==== 끝 ====");
		
		// 제거
//		studentList.remove("권순길");

		// 접근
		String getStudent1 = studentList.get(0);
		System.out.println("첫째 명단: " + getStudent1);
		
		// 갯수
		int size = studentList.size();
		System.out.println("전체 명단: " + size);
		
		// 전체 추가
		Vector<String> ngt = new Vector<String>();
		ngt.add("김가족");
		ngt.add("권가족");
		ngt.add("나가족");
		studentList.addAll(ngt);
		
		//		System.out.println("==== 가족 명단 ====");
		System.out.println(studentList);
		// 갯수
		size = studentList.size();
		System.out.println("전체 명단: " + size);

		System.out.println("==== 끝 ====");

	}
}
