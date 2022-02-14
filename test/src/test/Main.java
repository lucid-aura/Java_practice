package test;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int ab[] = {3, 5};
		int cd[] = {4, 6};
		System.out.println(ab[0] + " " + ab[1] + " " + cd[0] + " " + cd[1]);
		change(ab, cd);
		System.out.println(ab[0] + " " + ab[1] + " " + cd[0] + " " + cd[1]);
		
		
		int result = add(a, b);
		int result2 = add_remake(ab);
//		System.out.println(result + " " + a + " " + b + " ");
//		System.out.println(result2 + " " + ab[0] + " " + ab[1] + " ");
	}

	private static void change(int[] ab, int[] cd) {
		int[] temp = null;
		temp = ab; // temp <- ab
		ab = cd; // ab <- cd
		cd = temp; // cd = temp(ab)
		System.out.println(ab[0] + " " + ab[1] + " " + cd[0] + " " + cd[1]);
	}

	public static int add(int i, int j) {
		int c = i + j;
		i = i+10;
		j = j+10;
		return c;
	}
	
	public static int add_remake(int[] ij) {
		int c = ij[0] + ij[1];
		ij[0] = ij[0]+10;
		ij[1] = ij[1]+10;
		return c;
	}
	
}
