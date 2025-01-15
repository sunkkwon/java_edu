package Day06Abstract;

import java.util.Scanner;

import Day06.CircleArray;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력변수
		double width  = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		//입력받은 도형 배열
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while(true) {
			if(index == 3) break;
			
			System.out.println("1. 삼각형, 2.사각형, 3.원형");
			System.out.print(">>");
			String input = sc.next();
			
			if(input.equals("종료")) break;
			if(input.equals("quit")) break;
			
			
			switch(input) {
				
				// 삼각형
				case "1":
					System.out.print("가로: ");
					width = sc.nextDouble();
					System.out.print("세로: ");
					height = sc.nextDouble();
					
					shapeList[index++] = new Triangle(width, height);
					break;
				
				//사각형
				case "2":
					System.out.print("가로: ");
					width = sc.nextDouble();
					System.out.print("세로: ");
					height = sc.nextDouble();
					
					shapeList[index++] = new Rectangle(width, height);
					break;
			
				//원형
				case "3":
					System.out.print("반지름: ");
					radius = sc.nextDouble();
					
					shapeList[index++] = new Circle(radius);
					break;

				default:
					break;
			}	// switch
		}	//while
		
		//넓이 둘레 구하기
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			//넓이와둘레
			double area = shape.area();
			double round = shape.round();
			
			//합계
			areaSum  += area;
			roundSum += round;
			
			// 인스턴스비교
			if( shape instanceof Triangle) System.out.println("삼각형");
			if(shape instanceof Rectangle) System.out.println("사각형");
			if(shape instanceof Circle) System.out.println("원형");
			
			System.out.println("넓이: " + area + "\t");
			System.out.println("둘레: " + round + "\t");
			System.out.println();
		}	//foreach
		
		System.out.println("넓이총합: " + areaSum);
		System.out.println("둘레총합: " + roundSum);
		System.out.println();
		
		sc.close();
	}
}
