package actors;

public class Seller extends Person {
	static int sellercount;
	int Seller_id;

	public Seller(String name, String phonenum, String address, String email, int Seller_id) {
		super(name, phonenum, address, email);
		this.Seller_id = Seller_id;
		sellercount++;
	}

	@Override
	public String toString() {
		return "Seller [Seller_id=" + Seller_id + ", name=" + name + ", phonenum=" + phonenum + ", address=" + address
				+ ", email=" + email + "]";
	}

	public static int getSellercount() {
		return sellercount;
	}

	public static void setSellercount(int sellercount) {
		Seller.sellercount = sellercount;
	}

	public int getSeller_id() {
		return Seller_id;
	}

	public void setSeller_id(int seller_id) {
		Seller_id = seller_id;
	}

	@Override
	public String GetRole() {
		return "Seller";
	}

	public Seller() {

	}
}
