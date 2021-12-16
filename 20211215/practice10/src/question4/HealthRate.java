package question4;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public double sw() {
		return (height - 100)*0.9;
	}
	
	public double b() {
		double sw = this.sw();
		return (weight - sw) / sw*100; 
	}
	
	@Override
	public void prn() {
		double result = b();
		String text = "비만";
		if (result <= 10) {
			text = "정상";
		}
		else if (result <= 20) {
			text = "과체중";
		}
		// super.prn(); prn overiding 하고 뒤에 추가될 내용만 추가로 출력해줄 수도 있음
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f %s 입니다.\n", name, height, weight, text);
	}
	
}
