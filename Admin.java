package actors;

public class Admin extends Person {
	static int admincount = 0;
	int admin_id;

	public Admin() {
		super();
	}

	public Admin(String name, String phonenum, String address, String email, int admin_id) {
		super(name, phonenum, address, email);
		this.admin_id = admin_id;
		admincount++;
	}

	public static int getAdmincount() {
		return admincount;
	}

	public static void setAdmincount(int admincount) {
		Admin.admincount = admincount;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	@Override
	public String GetRole() {
		return "Admin";
	}

}
