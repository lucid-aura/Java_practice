package question3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mv = new Movie("스파이더맨", 7, 5); // Movie 클래스를 오버로드된 생성자를 이용해 생성
		mv.display(); // Movie 클래스의 멤버 함수인 display() 호출
		
		System.out.println("***********************************"); // 매개변수 4개인 생성자로 객체 생성
		
		//MovieWork는 Movie 클래스를 상속받은 자식 클래스 (부모 클래스의 접근가능한(public, protected)함수나 변수를 가져다 쓸 수 있고
		// 필요하다면 Override를 해서 부모의 함수를 입맛에 맞게 고쳐 쓸 수 있다.
		MovieWork mk = new MovieWork("매트릭스", 9, 10, 10, 8, 9); // MovieWork클래스를 오버로드된 생성자를 이용해 생성
		mk.display(); // MovieWork 클래스의 멤버 함수인 display() 호출(부모의 메서드가 override 된 메서드)
	}

}
