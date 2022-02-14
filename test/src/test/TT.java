package test;

public class TT {
	public static void main(String[] args) {
		int A[] = {10, 20, 30};
		// Func(A, A[0]);
		
		
		int  i = 0;
		int result = 0;
		result = recursion(i);
		System.out.println(result);
		// Func(100, 10);
		

		/*
				for (int i = 0 ; i< 10; i++) {
					i++;
				}
				i++;*/
	}
	private static int recursion(int i) {
		System.out.println("in recursion!");
		if (i > 10) {
			return i;
		}
		else {
			return recursion(i+1);
		}
	}
	
	/* 12번의 출력      i    i+1
	in recursion!     0     1
	in recursion!     1     2
	in recursion!     2     3
	in recursion!     3     4 
	in recursion!	  4	 	5
	in recursion!	  5		6
	in recursion!	  6		7
	in recursion!	  7		8
	in recursion!	  8		9
	in recursion!	  9		10
	in recursion!	  10	11
	in recursion!	  11	12
	 */
	
	
	
	
	// 주소 값만 일치하면
	public static void Func(int[] para, int a0) {
		para[0] += a0;
		a0 = 100;
		System.out.println(para[0] + " "+ para[1] + " " + para[2]);
							//20    +    20    -   30
	}
}

// 참조형 변수와 일반 변수의 가장 큰 차이.
