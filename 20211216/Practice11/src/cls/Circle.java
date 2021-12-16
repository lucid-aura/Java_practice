package cls;

public class Circle extends Shape{
	double r;
	static double PI = 3.14;
	
	public Circle(double r){
		super();
		this.r = r;
	}
	
	@Override
	public double calcArea() {
		return r*r*PI;
		
	}
	
	boolean isSquare() {
		return false;
	}
}
