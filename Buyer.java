package actors;

public class Buyer extends Person {
	static int buyercount = 0;
	int Buyer_id;

	public static int getBuyercount() {
		return buyercount;
	}

	public static void setBuyercount(int buyercount) {
		Buyer.buyercount = buyercount;
	}

	public int getBuyer_id() {
		return Buyer_id;
	}

	public void setBuyer_id(int buyer_id) {
		Buyer_id = buyer_id;
	}

	public Buyer(String name, String phonenum, String address, String email, int Buyer_id) {
		super(name, phonenum, address, email);
		this.Buyer_id = Buyer_id;
		buyercount++;
	}

	@Override
	public String toString() {
		return "Buyer [Buyer_id=" + Buyer_id + ", name=" + name + ", phonenum=" + phonenum + ", address=" + address
				+ ", email=" + email + "]";
	}

	@Override
	public String GetRole() {
		return "Buyer";
	}

	public Buyer() {

	}
}
