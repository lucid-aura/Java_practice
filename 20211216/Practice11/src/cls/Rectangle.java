package cls;

public class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(int width, int height){
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {  // 도형의 면적을 계산해서 반환하는 메서드
		return width*height;
	}
	
	boolean isSquare() {
		return width == height ? true : false;
	}
}
