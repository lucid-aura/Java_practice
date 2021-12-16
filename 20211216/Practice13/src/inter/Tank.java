package inter;

public class Tank implements Unit{
	int x;
	int y;
	@Override
	public void move(int x, int y) { /* 지정된 위치로 이동 */ }
	
	@Override
	public void stop() { /* 현재 위치에 정지 */ }

	void changeMode() { /* 공격모드를 변환한다. */ }
}
