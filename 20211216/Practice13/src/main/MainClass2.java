package main;

import inter.Dropship;
import inter.Marine;
import inter.Tank;
import inter.Unit;

public class MainClass2 {

	public static void main(String[] args) {
		Unit unitArr[] = new Unit[3];
		unitArr[0] = new Marine();
		unitArr[1] = new Tank();
		unitArr[2] = new Dropship();

	}
}
