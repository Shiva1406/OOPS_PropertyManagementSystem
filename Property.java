package propert_sales;

import actors.*;

public class Property {
	static int propertycount=0;
	int property_id;
	String type;
	String owner;
	String address;
	String price;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Property(String type, String owner, String address, String price, int property_id) {
		super();
		this.type = type;
		this.owner = owner;
		this.address = address;
		this.price = price;
		this.property_id = property_id;
		propertycount++;
	}

	@Override
	public String toString() {
		return "Property [property_id=" + property_id + ", type=" + type + ", owner=" + owner + ", address=" + address
				+ ", price=" + price + "]";
	}

	public static int getPropertycount() {
		return propertycount;
	}

	public static void setPropertycount(int propertycount) {
		Property.propertycount = propertycount;
	}

	public int getProperty_id() {
		return property_id;
	}

	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}

	public Property() {

	}
}
