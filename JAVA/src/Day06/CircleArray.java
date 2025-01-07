package Day06;

class Circle {

		// 반지름
	int radius;

	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	//메소드
	public double area() {
		
//		return PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}
	
}


public class CircleArray {

	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
		}
		
		for (Circle circle : c) {
			System.out.println("넓이: " + circle.area());
		}
	}
}
