package actors;

public class Broker extends Person {
	static int brokercount = 0;
	int Broker_id;

	public Broker(String name, String phonenum, String address, String email, int Broker_id) {
		super(name, phonenum, address, email);
		this.Broker_id = Broker_id;
		brokercount++;
	}



	@Override
	public String toString() {
		return "Broker [Broker_id=" + Broker_id + ", name=" + name + ", phonenum=" + phonenum + ", address=" + address
				+ ", email=" + email + "]";
	}



	public static int getBrokercount() {
		return brokercount;
	}

	public static void setBrokercount(int brokercount) {
		Broker.brokercount = brokercount;
	}

	public int getBroker_id() {
		return Broker_id;
	}

	public void setBroker_id(int broker_id) {
		Broker_id = broker_id;
	}

	@Override
	public String GetRole() {
		return "Broker";
	}

	public Broker() {

	}
}
