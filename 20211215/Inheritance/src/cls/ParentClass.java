package cls;

public class ParentClass {
	private int number;
	protected String name;
	
	public void parentMethod() {
		System.out.println("ParentClass parentMethod()");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
