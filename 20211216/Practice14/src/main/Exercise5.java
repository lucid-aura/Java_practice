package main;

public class Exercise5 {
	public static void action(/*Object*/Robot robot) {
		if (robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
		}
		else if (robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		}
		else if (robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}

	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}
