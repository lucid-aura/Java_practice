package dto;

// DTO Data Transfer Object 한 사람의 대한 객체를 정의해 놓은 것
// VO Value Object
public class MemberDto {

	private String name;
	private int age;
	private String address;
	private String phone;
	private String content;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String name, int age, String address, String phone, String content) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
