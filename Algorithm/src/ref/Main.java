package ref;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;

		System.out.println(a);
		mulA(a);
		System.out.println(a);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		System.out.println(b.get(0));
		mulB(b);
		System.out.println(b.get(0));
	}

	public static void mulA(int a) {
		a = a*3;
	}
	
	public static void mulB(ArrayList<Integer> array_b) {
		int b = array_b.get(0);
		array_b.set(0, b*3);
	}
}
