package day15;

// 람디식 사용하기
// 1. 함수형 인터페이스 정의
// 2. 람다식 익명함수를 정의하여 인터페이스에 선언
// 3. 람디식 호출

@FunctionalInterface
interface FuncInterface1{
	void method();
}

@FunctionalInterface
interface FuncInterface2 { void method(String a, String b); }

@FunctionalInterface
interface FuncInterface3 { String method(); }

@FunctionalInterface
interface FuncInterface4 { String method (String a, String b); }

public class LamdaFormat {
	public static void main(String[] args) {
		// 매개변수 X, 반환타입 X 람다식
		// () -> { System.out.println("람다식"); }
		// () ->   System.out.println("람다식"); 
		FuncInterface1 fi1 = () -> System.out.println("자바 람다식1");
		fi1.method();
		
		// 매개변수 O, 반환타입 X 람다식
		// (a,b) -> {System.out.println(a + b); }
		FuncInterface2 fi2 = (a,b) -> {
			String result = a + b;
			System.out.println(result);
		};
		fi2.method("자바", "람다식2");
		
		// 매개변수 X, 반환타입 O 람다식
		// () -> { return 1 + 2; }
		FuncInterface3 fi3 = () -> {
			String a = "자바";
			String b = "람다식3";
			return a + b;
		};
		
		// 매개변수 O 반환타입 O 람다식
		// (a,b) -> { return a + b; }
		// (a,b) ->  return a + b; 
		// (a,b) ->  a + b; 
		FuncInterface4 fi4 = (a,b) -> { return a + b; };
		FuncInterface4 fi6  = (a,b) -> a + b;
		
		String result4 = fi4.method("자바", "람다식4");
		String result6 = fi6.method("자바", "람다식6");
		System.out.println(result4);
		System.out.println(result6);
		
		
	}

}
