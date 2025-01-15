package Day06Abstract;

public abstract class Shape {

	Point point;
	
	//추상메소드 정의
	//추상메소드는 구현부가 없다
	abstract double area();		//넓이
	abstract double round();	//둘레
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
