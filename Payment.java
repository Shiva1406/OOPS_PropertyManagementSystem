package propert_sales;

public class Payment {
	static int paymentcount;
	int inv_no;
	String inv_date;
	long Gst_no;
	String payer;
	String buyer;
	double amount;
	public Payment(int inv_no, String inv_date, long gst_no, String buyer, String payer, double amount) {
		super();
		this.inv_no = inv_no;
		this.inv_date = inv_date;
		Gst_no = gst_no;
		this.payer = payer;
		this.buyer = buyer;
		this.amount = amount;
		paymentcount++;
	}
	public Payment(Payment pa) {
		this.inv_no = pa.inv_no;
		this.inv_date = pa.inv_date;
		Gst_no = pa.Gst_no;
		this.payer = pa.payer;
		this.buyer = pa.buyer;
		this.amount = pa.amount;
		paymentcount++;
	}
	@Override
	public String toString() {
		return "Payment [inv_no=" + inv_no + ", inv_date=" + inv_date + ", Gst_no=" + Gst_no + ", seller=" + payer
				+ ", buyer=" + buyer + ", amount=" + amount + "]";
	}
	public int getInv_no() {
		return inv_no;
	}
	public void setInv_no(int inv_no) {
		this.inv_no = inv_no;
	}
	public String getInv_date() {
		return inv_date;
	}
	public void setInv_date(String inv_date) {
		this.inv_date = inv_date;
	}
	public long getGst_no() {
		return Gst_no;
	}
	public void setGst_no(long gst_no) {
		Gst_no = gst_no;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setnull() {
		this.inv_no = 0;
		this.inv_date = null;
		this.amount = 0.0;
		this.Gst_no = 0;
		this.buyer = null;
		this.payer = null;
	}
}
