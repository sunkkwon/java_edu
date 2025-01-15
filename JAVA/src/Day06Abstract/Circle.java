package Day06Abstract;

public class Circle extends Shape{
	double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}


	//getter/setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
	
}
