package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import dto.MyClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Collention : 수집
		 * 
		 * List : 목록
		 * 	ArrayList
		 * 		배열처럼 사용할 수 있는 목록
		 * 		선형구조(앞뒤 관계가 1:1)
		 * 		검색 속도가 우수하다.
		 * 		index로 접근한다.
		 * 
		 * 	LinkedList
		 * 		추가/삭제의 속도가 우수하다. - 게임
		 */
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
//		List<Integer> arrList = new ArrayList<Integer>();
		
		// 추가
		arrList.add(111);
		
		Integer in = new Integer(222);
		arrList.add(in);
		
		arrList.add(new Integer(333));
		
		int len = arrList.size();
		System.out.println("list의 크기:" + len);
		
		System.out.println( arrList.get(0) );
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println( arrList.get(i) );
		}
		
		for (Integer integer : arrList) {
			System.out.println( integer );
		}
		
		// 원하는 위치에 추가
		arrList.add(1, 200);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println( arrList.get(i) );
		}
		
		// 삭제
		Integer num = arrList.remove(2);
		System.out.println("삭제된 데이터:" + num);
		for (Integer integer : arrList) {
			System.out.println( integer );
		}
		System.out.println("list의 크기:" + arrList.size());
		
		// 검색
		int index = arrList.indexOf(  333 );
		System.out.println(index);
				
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if (val == 200) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		// 수정
		Integer newVal = new Integer(100);
		arrList.set(0, newVal);
		
		for (Integer integer : arrList) {
			System.out.println( integer );
		}
		
		ArrayList<String> slist = new ArrayList<String>();
		// 추가
		slist.add("hello");
		slist.add("java");
		slist.add("world");
		
		// 삭제
		System.out.println("삭제된 문자열 : " + slist.remove(1));
		
		// 검색
		System.out.println("검색한 문자열 world 위치: " + slist.indexOf("world"));
		
		// 수정
		System.out.println("인덱스 0번의 수정된 문자열 : " + slist.set(0, "halo") + " -> " +  slist.get(0) );
		
		// 나열
		for (String str : slist) {
			System.out.println( str );
		}
		
		List<MyClass> list = new ArrayList<MyClass>();
		// 추가
		MyClass my1 = new MyClass(1, "홍길동", 175);
		list.add(my1);
		MyClass my2 = new MyClass(2, "일지매", 180);
		list.add(my2);
		MyClass my3 = new MyClass(3, "성춘향", 170);
		list.add(my3);
		MyClass my4 = new MyClass(4, "홍두깨", 185);
		list.add(2, my4);
		
		// 삭제
		MyClass del1 = list.remove(1);
		System.out.println("삭제된 객체 : " + del1.getNumber() + ", " + del1.getName() + ", " + del1.getHeight());
		
		// 검색
		String name = "성춘향";
		
		int findIndex = -1;
		for (int i = 0; i < list.size();	 i++) {
			MyClass my = list.get(i);
			if (name.equals(my.getName())) {
				findIndex = i;
				break;
			}
		}
		System.out.println(list.get(findIndex).toString());
		
		// 수정
		MyClass after = new MyClass(0, "고길동", 165);
		MyClass set1 = list.set(0, after);
		System.out.println("인덱스 0번의 수정된 값들 : " + set1.getNumber() + " -> " +  list.get(0).getNumber() + ", " +  set1.getName() + " -> " +  list.get(0).getName() + ", " +  set1.getHeight() + " -> " +  list.get(0).getHeight() );

		// 나열
		for (MyClass mycls : list) {
			System.out.println( mycls.toString() );
		}
		
	}

}
