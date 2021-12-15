package question1;

public class MainClass {

	public static void main(String[] args) {		
		ClassTest_2 ct = new ClassTest_2("이지나", 3000, "교육부"); // ClassTest_2 라는 이름을 가진 클래스 객체 생성(인스턴스화)
		ct.callSuperThis(); // 생성된 객체(인스턴스) ClassTest_2(이름 : ct)의 멤버 함수 callSuperThis() 호출
		ct.getInformation(); // 생성된 객체(인스턴스) ClassTest_2(이름 : ct)의 멤버 함수 getInformation() 호출

	}
}
