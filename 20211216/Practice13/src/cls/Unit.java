package cls;

public abstract class Unit {
	int x, y; // 현재 위치
	abstract void move(int x, int y);
	abstract void stop();
}
