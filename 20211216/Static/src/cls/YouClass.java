package cls;

public class YouClass {

	int number;
	public void memberMethod() {
		System.out.println("YouClass memberMethod()");
	}
	
	public static void staticMethod() {
		System.out.println("YouClass staticMethod()");
		
// 		멤버변수 접근 불가
//		number = 1;
//		memberMethod()
//		this
//		super
//		객체를 생성해주지 않아도 되는 간단한 함수들에 사용
//		다른 클래스의 변수들을 객체 생성하지 않고 가져올 수 있음
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
