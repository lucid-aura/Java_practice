package dto;

public class StudentDto3 {

	// 데이터의 접근, 관리
	// CRUD
	
	private int number;
	private String name;
	private double height;
	private int eng;
	private int math;
	
	public StudentDto3() {
		// TODO Auto-generated constructor stub
	}

	public StudentDto3(int number, String name, double height, int eng, int math) {
		super();
		this.number = number;
		this.name = name;
		this.height = height;
		this.eng = eng;
		this.math = math;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "StudentDto [number=" + number + ", name=" + name + ", height=" + height + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	public void remove() {
		number = 0;
		name = "";
		height = 0.0;
		math = 0;
		eng = 0;
	}
}
