package cls;

import main.Singleton;

public class HeClass {

	private int tag;
	
	public HeClass() {
		this.tag = 1000;
	}
	
	public void function() {
		Singleton s = Singleton.getInstance();
		s.tag = tag;
	}
}