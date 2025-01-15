package Day06Abstract;

public class Rectangle extends Shape{

	double width, height;
	
	//생성자
	public Rectangle() {
		this(0.0,0.0);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}


	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2 * (width+height);
	}

	// getter/setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


	
}
