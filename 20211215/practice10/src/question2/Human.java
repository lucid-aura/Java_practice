package question2;

public class Human { 
	// 부모클래스 이름, 나이, 키, 무게 를 멤버 변수로 가지고 있다.
	String name;
	int age;
	int height;
	int weight;

	public Human() { 
		// 기본 생성자, 현재 과제에서는 사용하지 않지만 선언을 해놓음 이후 사용할 경우 없을 시 에러
	}

	public Human(String name, int age, int height, int weight) { 
		// 매개변수가 4개 필요한(오버로드 된) 생성자
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String toString() { 
		// 일정한 포멧으로 문자열을 만들고 그 문자열을 반환(return)하는 멤버 함수
		String data = name + "\t" + age + "\t" + height + "\t" + weight;
		return data;
	}

}
