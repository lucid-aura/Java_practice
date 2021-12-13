package day6;

public class Exceptions {

	public static void main(String[] args) {
		/*
		 * 형식:
		 * 	try{
		 * 		예외가 발생될 가능성이 있는 코드
		 * 	}catch(예외클래스1 e)
		 * 		예외 클래스 메시지 출력
		 * 	}
		 * 		:
		 * 	finally{
		 * 		무조건 실행
		 * 		뒤처리
		 * 	}
		 * 
		 * 	함수 안에서 발생할 경우
		 * 	static void method() throws 예외클래스 {
		 * 		함수 안에서 예외가 발생될 경우
		 * 	}
		 * 
		 */
		int array[] = { 1, 2, 3 }; // 크기 3개의 int 배열(이름 : array) 생성(선언 및 할당)
		System.out.println("start"); // "start" 문자열 출력
		try {
			for (int i = 0; i < 3; i++) { // i가 0부터 3까지 4번 수행
				System.out.println(array[i]); // 배열의 0번부터 3번까지 출력
			}
			
			System.out.println("Process"); // Process 문자열 출력
		}catch(ArrayIndexOutOfBoundsException e) { // 배열 범위초과 예외 발생 시
			System.out.println("배열의 범위 초과"); // 배열의 범위 초과 문자열 출력
			return; // 현재 함수(main) 종료 및 반환(반환 값 없음)
		}catch (Exception e) { // 예외(종류 무관) 발생 시
			e.printStackTrace(); // 해당 에러를 출력한다.
		}finally { // try catch문 공동으로 해줄 부분
			System.out.println("finally 부분"); // finally 부분 문자열을 출력한다.
		}
		
		System.out.println("end");
		
		method(); // method() 함수 호출
		
		try { // 예외 처리 시도
			objectCall(); // objectCall 함수 호출
		}catch (ClassNotFoundException e ) { // 해당 클래스가 존재하지 않는 예외 발생
			e.printStackTrace(); // 해당 에러를 출력한다.
		}catch (IndexOutOfBoundsException e) { // 범위 초과 예외 발생
			e.printStackTrace(); // 해당 에러를 출력한다.
		}
	}
	
	static void method() throws IndexOutOfBoundsException { // 범위 초과 예외 발생을 잡아줄 함수를 선언
		int num[] = {1, 2, 3}; // 길이 3 정수 배열 선언
		for (int i=0; i<4 ; i++) { // i가 0부터 3까지 4번 반복
			System.out.println(num[i]); // num 정수 배열 변수의 0번째부터 3번째까지 출력
		}
	}
	
	static void objectCall()throws ClassNotFoundException { // 클래스가 존재하지 않는 예외를 확인하는 함수
		Class.forName("MyClass"); // MyClass라는 class를 찾는다.
	}
}
