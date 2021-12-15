package question1;

public class ClassTest_1 {
	//멤버 변수 name과 salary는 private이기 때문에 다른 클래스에서 직접 접근이 불가능하다. -> getter/setter 이용
	private String name; 
	private int salary; 
	
	// public ClassTest_1() { } // 기본생성자 (현재 과제에서는 사용하지 않음)
	
	public ClassTest_1(String name, int salary) { 
		// 우리가 사용할 생성자(오버로드) n과 s를 매개변수로 입력받아 name과 salary 멤버변수에 할당한다. 
		this.name = name; this.salary = salary;
	} 
	
	public ClassTest_1(String name) {
		this.name = name;
		this.salary = 0;
		// TODO Auto-generated constructor stub
	}

//	public ClassTest_1(String name) {
//		this.name = name;
//	}
	
	public String getName() { 
		// 멤버변수 name 을 받기위한 getter 함수
		return name; 
	} 
	public int getSalary() { 
		// 멤버변수 saraly 을 받기하기 위한 getter 함수
		return salary; 
	} 
	public void getInformation() {
		// name과 salary를 출력한다. 멤버함수를 이용 안하더라도 내부의 정의된 같은 클래스의 변수에 바로 접근이 가능하다.
		System.out.print("이름:" + name + " 연봉:" + salary); 
	} 
	public void prn() { 
		// 부모의 prn() 멤버 함수 자식에게 상속이 되면 자식이 직접 override(덮어쓰기) 할 수 있다.
		System.out.println("수퍼클래스"); 
	}	
}
