package day2;

public class ArrayTwo {

	public static void main(String[] args) {
		/*
		 *	Array : 같은 자료형의 묶음 변수들. 접근 및 관리는 index로 된다. 0 ~ Array.length-1
		 *	int Arr[] = new int[5]; // 0~4
		 *	1차원	0-0-0-0-0 행(row)
		 *
		 *	2차원	0-0-0-0-0 행(row)
		 *				0-0-0-0-0
		 *				0-0-0-0-0
		 *
		 *	int array2[][] = new int[3][5];
		 */
		
//		int array2[][][][] = new int[1][2][3][4];
//		array2[0][0][0][0] = 1;
//		System.out.println(array2[0][0][0][0]);
		
		
		// Array[ 큰묶음 ] [ 각각의 요소 ]
		int Array23[][] = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
		};
		
		System.out.println(Array23[1][1]);
		System.out.println(Array23.length);
		System.out.println(Array23[0].length);
		
		int ArrCopy[][] = Array23;
	}

}
