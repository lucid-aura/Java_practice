package main;

import cls.Dropship;
import cls.Marine;
import cls.Tank;
import cls.Unit;

public class MainClass {

	public static void main(String[] args) {
		Unit unitArr[] = new Unit[3];
		unitArr[0] = new Marine();
		unitArr[1] = new Tank();
		unitArr[2] = new Dropship();

	}
}
