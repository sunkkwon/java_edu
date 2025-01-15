package Day06Abstract;

public class Point {

	// 멤버변수
	int x, y;

	//기본생성자
	public Point() {
	}

	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
