package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Generic == template(형태) : 자료형 변수
		 * 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우, 설정하는 요소
		 * 일반 자료형은 사용 못함 -> Object 자료형만 가능
		 */
		
		Box<Integer> box = new Box<>(123); // 
		box.setTemp(234);
		System.out.println(box.getTemp());
		
		Box<String> sbox = new Box<>("hello");
		sbox.setTemp("world");
		System.out.println(sbox.getTemp());
		
		/*살릴 부분
		Box<Integer> box = new Box<>(123); // 자바 10부터는 <>안에 안넣어두면 자료형 추론 가능(var 형 - 지역변수 자료형 추론)
		box.setTemp(234);
		System.out.println(box.getTemp());
		
		Box<String> sbox = new Box<>("hello");
		sbox.setTemp("world");
		System.out.println(sbox.getTemp());
		
		// 제네릭이 나온지 오래되서(5, 2004년) 하위 버전과의 호환성을 고려 안하면
		Box dbox = new Box<>(3.14); // 자료형을 Object라고 생각을 함
		dbox.setTemp(0.1); // 그래도 경고(에러 x)는 뜬다.
		System.out.println((Double)dbox.getTemp()); // 형변환을 해주는 것이 좋음
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "홍길동");
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		
		BoxMap<String, String> smap = new BoxMap<String, String>("apple", "사과");
		*/
		
		
		/*
		BoxMap<Double, Integer> _smap;
		BoxMap<Double, Double> __smap;
		BoxMap<Integer, Double> ___smap;
		*/
		
		// 제너릭은 메서드에도 적용할 수 있습니다!!
		// 제너릭도 상속이 됩니다!! - 제한을 거는 것
	}

}

class Box <T>{
	T temp;

	public Box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap<KEY, VALUE>{
	KEY key;
	VALUE value;
	
	public KEY getKey() {
		return key;
	}

	public void setKey(KEY key) {
		this.key = key;
	}

	public VALUE getValue() {
		return value;
	}

	public void setValue(VALUE value) {
		this.value = value;
	}

	public BoxMap(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}
	
}
