package functiontest;

public class Main {

	public static void main(String[] args) {
//		String a = "3";
//		String b = "5";
//		Cclass c = new Cclass();
//		int result = c.add(a, b);
		int a = 3;
		int b = 5;
		int []num = {3, 5};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(add2(num));
		System.out.println(num[0]);
		System.out.println(num[1]);
	}
	private static int add1(int a, int b) {
		a = a+1;
		b = b+2;
		return a+b;
	}
	private static int add2(int[] num) {
		num[0] += 1;
		num[1] += 2;
		return num[0]+num[1];
	}
}
