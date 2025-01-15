package Day06Abstract;

public class Triangle extends Shape{

	double width, height;
	
	//생성자
	public Triangle() {
		this(0.0,0.0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	@Override
	double area() {
		// TODO Auto-generated method stub
		
		return width * height / 2;
	}


	@Override
	double round() {
		// TODO Auto-generated method stub
		return 3 * width;
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
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	
	
}
