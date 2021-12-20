package cls;

import main.Singleton;

public class YouClass {

	private int total;
	private String name;
	private int tag;
	
	public YouClass() {
		
	}

	public void func() {
		Singleton s = Singleton.getInstance();
		this.total = s.number;
		this.name = s.name;
		this.tag = s.tag;
	}
	/*
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setName(String name) {
		this.name = name;
	}
*/

	@Override
	public String toString() {
		return "YouClass [total=" + total + ", name=" + name + ", tag=" + tag + "]";
	}

}
