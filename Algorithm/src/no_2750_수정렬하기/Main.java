package no_2750_수정렬하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> sort1 = new ArrayList<Integer>();
		int []sort2 = new int[N];
		
		for (int i = 0; i < N; i++) {
			int one = Integer.parseInt(br.readLine());
			sort1.add(one);
			sort2[i] = one;
		}
		
		System.out.println(sort1);
		Collections.sort(sort1);
		System.out.println(sort2[0]);
		// [1, 5, 3, 4, 2] N = 5
		for (int  i=0; i<N-1; i++) { // i = 4
			for (int j = i+1; j < N; j++) { // i = 3, j = 5
				if (sort2[i] > sort2[j]) {
					int temp = sort2[i];
					sort2[i] = sort2[j];
					sort2[j] = temp;
				}
			}
		}
		

		/*[1, 5, 3, 4, 2]
		// 첫번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]   -> 39줄로 점프 - 34번째
		// 				                 0    1			1                     5
		// 두번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 39줄로 점프 - 34번째
		//                              0    2           1                     3
		// 세번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 39줄로 점프 - 34번째
		//								0		3			1						4
		// 네번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 39줄로 점프 - 41번째 - 33번째
										0		4         1                       2
		// 5번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 36~38  [1, 3, 5, 4, 2]
										1		2			5                      3	
		35번 = if (sort2[i] > sort2[j])
		// 6번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 36~38  [1, 3, 5, 4, 2]
										1     3				3	                 4     	
										
		// 7번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 36~38 [1, 2, 5, 4, 3]
										1		4         3                       2			
		// 8번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 36~38 [1, 2, 4, 5, 3]
										2     3			5						4
		// 9번째 35번째 줄   i		j     sort2[i]    >?  sort2[j]    -> 36~38 [1, 2, 3, 5, 4]
										2     4			4						3
		// 10번째 35번째 줄  i		j     sort2[i]    >?  sort2[j]    -> 36~38 [1, 2, 3, 4, 5]
										3     4			5						4
		[1, 2, 3, 4, 5]*/
		for (int i : sort2) {
			bw.write(i + "\n");
		}
/*
		첫번째 밖 루프, 안 루프 완료
		i = 0, j = 1[ ]
		i = 0, j = 2[ ]
		i = 0, j = 3[ ]
		i = 0, j = 4[ ]
		
		
			
		두번째 밖 루프, 안 루프 완료
		i = 1, j = 2;[ ]
		i = 1, j = 3;[ ]
		i = 1, j = 4;[ ]
		
		[1, 2, 3, 5, 4]
				
		세번째 밖 루프, 안 루프 완료
		i = 2, j = 3;[ ]
		i = 2, j = 4;[ ]
		
		[1, 2, 3, 4, 5]
	
		네번째 밖 루프, 안 루프 완료
		i = 3, j = 4;
		[1, 2, 3, 4, 5]							
*/		
		for (int i : sort2) {
			bw.write(i + "\n");
		}
		bw.flush();
		
	}
}

