package question2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student se[] = new Student[3]; // Student 클래스를 저장할 Student 배열 se 선언
		
		// 각각 index(0~2)에 맞춰서 Student 클래스 객체 생성(인스턴스화) 및 배열에 할당  
		se[0] = new Student("홍길동", 15, 171, 81, "201101"); 
		se[1] = new Student("정길동", 13, 183, 72, "201102");
		se[2] = new Student("박길동", 16, 175, 65, "201103");
		
		// 포멧에 맞게 콘솔에 출력(단순한 문자열)
		System.out.printf("%4s %5s %8s %8s %8s\n", "name", "나이", "신장", "몸무게", "학번");
		
		// for 반복문을 이용해서 Student배열 se에 들어있는 Student 클래스 객체를 하나식 접근
		for (Student sm : se)
			// 배열에 들어있는 Student 클래스 객체 각각의 멤버 함수 toString 호출 
			System.out.println(sm.toString());

	}

}
