package question1;

public class ClassTest_2 extends ClassTest_1 { // 부모클래스 ClassTest_1 을 상속받은 자식클래스 ClassTest_2
	private String department; // 자식클래스 소유의 변수 department -> 부모클래스에서 바로 접근할 수는 없다.
	
	public ClassTest_2(String name, int salary, String department) { 
		// 자식 클래스의 생성자 부모클래스와 동일한 부분 (name, salary)는 부모클래스의 (오버로드 된)생성자(super(name, saraly))를 이용하여 생성하고
		// 나머지 남은 변수 department는 setDepartment() 멤버 함수를 이용하여 값을 할당한다. 
		// 부모생성자 부모 생성자를 호출.
		//super != super()  //super:주소 super() :생성자
		super(name, salary);
		this.department = department;
		//this.setDepartment(department); // 직접 접근 불가능하므로 setter 함수 이용
	}
	
	public String getDepartment() { 
		// 직접 접근 불가능한 멤버 변수 department를  getter 함수를 이용해서 값을 얻는다.
		return department;
	}
	public void setDepartment(String department) {
		// 직접 접근 불가능한 멤버 변수 department를  setter 함수를 이용해서 값을 설정한다.
		this.department = department;
	}
	
	@Override
	public void getInformation() { 
		// 직접 접근이 불가능한 멤버 변수들 중 상속받은 name,  salary 그리고 자식 클래스의 멤버 변수 department를
		// getter 함수를 이용해서 콘솔로 정해진 포맷에 맞게 출력한다.
		// 물론 같은 클래스의 멤버 함수에서 멤버 변수를 바로 접근 할 수 있으므로  department 도 가능하다
		// 하지만 name과 salary는 같은 클래스의 멤버 변수가 아니기 때문에 (아무리 부모에게서 물려받은 것이라도)
		// getter/setter 함수를 이용해야 한다.
		// 단!!!! 부모 클래스의 멤버 변수가 protected나 public이면 바로 접근 가능하다.
		
		super.getInformation();
		System.out.println("부서:" + this.getDepartment());
//		System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + "부서:" + this.getDepartment()); 
	} 
	
	@Override
	public void prn() { 
		// 부모에게 물려받은(상속받은) prn() 멤버 함수를 자식에게 맞게 override 한다.
		System.out.println("서브클래스"); 
	}

	public void callSuperThis() {
		// 부모 클래스에 접근하기 위해 super 키워드를 이용해서 부모의 prn() 멤버 함수를 호출하고 이후 자신(this)의 멤버함수를 호출한다.
		super.prn(); // 부모 클래스의 멤버 함수 prn() 호출
		this.prn(); // 자식 클래스(현재 적힌 이 클래스)의 멤버 함수 prn() 호출
	}
}
