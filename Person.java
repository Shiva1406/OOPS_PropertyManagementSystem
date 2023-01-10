package actors;

public abstract class Person {
	String name;
	String phonenum;
	String address;
	String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person() {

	}

	public Person(String name, String phonenum, String address, String email) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.address = address;
		this.email = email;
	}

	public abstract String GetRole();
}
