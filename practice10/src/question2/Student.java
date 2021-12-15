package question2;

public class Student extends Human { // 부모 클래스(Human)으로부터 물려받은 Student 클래스(자식 클래스)

	private String number; // 자식 클래스의 멤버 변수
	
	// 기본생성자는 사용하지 않으므로 생략되었다.
	
	public Student(String name, int age, int height, int weight, String number) {
		// Student 클래스의 (오버로드 된)생성자 
		
		super(name, age, height, weight);
		// super() 함수를 이용해서 부모 생성자를 호출하여 name, age, height, weight를 매개변수로 객체 생성(인스턴스화)
		this.number = number; 
		// Student 멤버 변수인 number도 초기화하여 Student 클래스 객체 생성(인스턴스화)을 마무리
	}
	
	public String getNumber() {
		// 멤버 변수인 number의 값을 받아오기 위한 getter 함수
		return number;
	}
	
	public void setNumber(String number) {
		// 멤버 변수인 number의 값을 설정하기 위한 setter 함수
		this.number = number;
	}
	
}
