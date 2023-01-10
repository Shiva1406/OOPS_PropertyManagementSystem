package driver;

import java.util.Scanner;
import actors.*;
import propert_sales.*;

public class Main {
	int authpayp = 2;
	int unauthpayp = 3;
	Broker[] brokerlst = new Broker[100];
	Buyer[] buyerlst = new Buyer[100];
	Seller[] sellerlst = new Seller[100];
	Admin[] adminlst = new Admin[10];
	Property[] propertylst = new Property[500];
	Payment[] authpaymentlst = new Payment[100];
	Payment[] unauthpaymentlst = new Payment[100];

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		Main m = new Main();

		m.brokerlst[0] = new Broker("Rahul", "9998887775", "01 Sathya Apartments, Chennai", "Rahul@gmail.com", 1);
		m.brokerlst[1] = new Broker("Modi", "9568745236", "32 Aquamarine Apartments, Kerala", "modi@hotmail.com", 2);
		m.brokerlst[2] = new Broker("Sunny", "8596231474", "16 Asset Homes,Bangalore", "Sunny@yahoo.com", 3);
		m.brokerlst[3] = new Broker("Johny", "6852147963", "62 Snow Homes,Sahara", "jnyo@gmail.com", 4);
		m.brokerlst[4] = new Broker("Anu", "9852356647", "69 outlook houses", "AnuRaga@outlook.com", 5);

		m.buyerlst[0] = new Buyer("Ramya", "9784596210", "01 Sathya Apartments, Chennai", "ramyatadepalli@gmail.com",
				1);
		m.buyerlst[1] = new Buyer("Subbalakshmi Trisha", "9764318520", "32 Aquamarine Apartments, Kerala",
				"subbutrisha@hotmail.com", 2);
		m.buyerlst[2] = new Buyer("Kalva Reddy Nithya", "9430167852", "16 Asset Homes,Bangalore",
				"nithyareddykalva@yahoo.com", 3);
		m.buyerlst[3] = new Buyer("Anurag Nagilla", "9786543210", "62 Snow Homes,Sahara", "anuraganagilla@gmail.com",
				4);
		m.buyerlst[4] = new Buyer("Ananya", "9786541542", "69 outlook houses", "ananyaramamurthy@outlook.com", 5);

		m.sellerlst[0] = new Seller("Rahul", "9998887775", "05 Indira Nagar, Bangalore", "rahul@gmail.com", 1);
		m.sellerlst[1] = new Seller("Srivatsan", "9568745236", "76 Marine Drive, Mumbai", "srivatsan@hotmail.com", 2);
		m.sellerlst[2] = new Seller("Abhinaya", "8596231474", "82 Howrah Bridge, Kolkata", "abhinayasb@yahoo.com", 3);
		m.sellerlst[3] = new Seller("Pooja", "6852147963", "37 LCS Himadri, Chennai", "pooja@gmail.com", 4);
		m.sellerlst[4] = new Seller("Prithvi", "9852356647", "26 Gulmohar Apartments, Outer Ring ROad, Bangalore",
				"prithviramesh@outlook.com", 5);

		m.adminlst[0] = new Admin("Shiva", "6969696969", "704 Rushin Tower, Jodhpur Village, Ahmedabad",
				"shivam@gmail.com", 1);
		m.adminlst[1] = new Admin("Apoorva", "9841789436", "167/73 Ramaniyam Sampoorna Apartments, Chennai",
				"apoorvasb@gmail.com", 2);
		m.adminlst[2] = new Admin("Jaswanth", "6857421930", "16 Gandhi Road, Coimbatore", "jaswanthreddy@yahoo.com", 3);
		m.adminlst[3] = new Admin("Yash", "9275846310", "6 Vivekanandar Street, Dubai", "yashputhalath@gmail.com", 4);

		m.propertylst[0] = new Property("Residential", "Shiva", "05 Primarc Galactica, Hooghly", "41780000", 1);
		m.propertylst[1] = new Property("Commercial", "Ramya Tadepalli", "64 Best Oriana, Malsi, Dehradun", "6800000",
				2);
		m.propertylst[2] = new Property("Industrial", "Mukesh Ambani",
				"31 Reliance Industrial Plots, Gurgaon Jhajjar Road, Gurgaon", "99000000", 3);
		m.propertylst[3] = new Property("Residential", "Apoorva", "27 Amantran, Thakurpukur,Kolkata", "12000000", 4);
		m.propertylst[4] = new Property("Agricultural", "Subbulakshmi", "08 Karjat, Thane", "7500000", 5);

		m.unauthpaymentlst[0] = new Payment(101, "05/01/2022", 2456318, "Navaneeth", "Aman Subhash", 2500000);
		m.unauthpaymentlst[1] = new Payment(102, "27/12/2005", 5786492, "Ananya", "Sahil", 76000000);
		m.unauthpaymentlst[2] = new Payment(103, "16/11/2013", 8765943, "Yash", "Shreenithi", 3500000);

		m.authpaymentlst[0] = new Payment(104, "18/09/2003", 3784652, "Anurag", "Likhitha", 7800000);
		m.authpaymentlst[1] = new Payment(105, "05/08/2022", 1683495, "Charvi", "Aishwarya", 4200000);

		do {
			System.out.println("---------------------------------------------");
			System.out.println("Welcome to our Property Management System - ");
			System.out.println("---------------------------------------------");
			System.out.println("What would you like to login as:");
			System.out.println("0 - Admin, 1 - Broker, 2 - Buyer, 3 - Seller");
			int chc = m.s.nextInt();
			switch (chc) {
			case 0:
				m.drive_admin();
				break;
			case 1:
				m.drive_broker();
				break;
			case 2:
				m.drive_buyer();
				break;
			case 3:
				m.drive_seller();
				break;
			default:
				System.out.println("Invalid input! Try again!");
				break;
			}
			System.out.println("Press 0 to exit the application:");
			int chc1 = m.s.nextInt();
			if (chc1 == 0) {
				System.out.println("Thanks for using our application!");
				break;
			}

		} while (true);
	}

	private void drive_seller() {
		System.out.println("Welcome Seller!");
		System.out.println("Enter your id to proceed");
		int id = s.nextInt();
		System.out.println("Welcome! " + sellerlst[id - 1].getName());
		System.out.println("What do you wish today?");
		System.out.println("Press 1 to view all listed properties, press 2 to list a new property");
		int chc = s.nextInt();
		if (chc == 1) {

			if (Property.getPropertycount() > 0) {
				System.out.println("List of available properties:");
				for (int i = 0; i <= Property.getPropertycount() - 1; i++) {
					System.out.println(propertylst[i].toString());
				}
			} else {
				System.out.println("No available properties! Try later!");
			}

		} else if (chc == 2) {
			String t, o, a, p;
			int sid;
			System.out.println("Enter the type:");
			t = s.next();
			o = sellerlst[id - 1].getName();
			System.out.println("Enter the address:");
			a = s.next();
			System.out.println("Enter the price:");
			p = s.next();
			System.out.println("Enter the property id:");
			sid = s.nextInt();
			propertylst[Property.getPropertycount()] = new Property(t, o, a, p, sid);
		} else {
			System.out.println("INVALID CHOICE!");
		}

	}

	private void drive_buyer() {
		System.out.println("Welcome Buyer!");
		System.out.println("Enter your id to proceed");
		int id = s.nextInt();
		System.out.println("Welcome! " + buyerlst[id - 1].getName());
		System.out.println("What do you wish today?");
		System.out.println("Press 1 to view all listed properties, press 2 to view list of brokers");
		int chc = s.nextInt();
		if (chc == 1) {

			if (Property.getPropertycount() > 0) {
				System.out.println("List of available properties:");
				for (int i = 0; i <= Property.getPropertycount() - 1; i++) {
					System.out.println(propertylst[i].toString());
				}

			} else {
				System.out.println("No available properties! try later!");
			}

		} else if (chc == 2) {
			if (Broker.getBrokercount() > 0) {
				System.out.println("List of available Brokers:");
				for (int i = 0; i < Broker.getBrokercount(); i++) {
					System.out.println(brokerlst[i].toString());
				}
			} else {
				System.out.println("No available Brokers! Try later!");
			}
		} else {
			System.out.println("INVALID CHOICE!");
		}

	}

	private void drive_broker() {
		System.out.println("Welcome Broker!");
		System.out.println("Enter your id to proceed");
		int id = s.nextInt();
		System.out.println("Welcome! " + brokerlst[id - 1].getName());
		System.out.println("What do you wish today?");
		System.out.println("Press 1 to view all listed properties, press 2 to view list of Buyers");
		System.out.println("Press 3 to view all sellers, press 4 to record a payment");
		int chc = s.nextInt();
		if (chc == 1) {

			if (Property.getPropertycount() > 0) {
				System.out.println("List of available properties:");
				for (int i = 0; i <= Property.getPropertycount() - 1; i++) {
					System.out.println(propertylst[i].toString());
				}

			} else {
				System.out.println("No available properties! try later!");
			}

		} else if (chc == 2) {
			if (Buyer.getBuyercount() > 0) {
				System.out.println("List of available Buyers:");
				for (int i = 0; i < Buyer.getBuyercount(); i++) {
					System.out.println(buyerlst[i].toString());
				}
			} else {
				System.out.println("No available Buyers! Try later!");
			}
		} else if (chc == 3) {
			if (Seller.getSellercount() > 0) {
				System.out.println("List of available Sellers:");
				for (int i = 0; i < Seller.getSellercount(); i++) {
					System.out.println(brokerlst[i].toString());
				}
			} else {
				System.out.println("No available Sellers! Try later!");
			}
		} else if (chc == 4) {
			Scanner sc = new Scanner(System.in);
			int i;
			String d, b, s;
			long gst;
			double amt;
			System.out.println("Enter invoice no.");
			i = sc.nextInt();
			System.out.println("Enter date:");
			d = sc.next();
			System.out.println("Enter gst no:");
			gst = sc.nextLong();
			System.out.println("Enter Buyer:");
			b = sc.next();
			System.out.println("Enter Seller:");
			s = sc.next();
			System.out.println("Enter Amount:");
			amt = sc.nextDouble();
			unauthpaymentlst[unauthpayp] = new Payment(i, d, gst, b, s, amt);
			unauthpayp++;
		} else {
			System.out.println("INVALID CHOICE!");
		}

	}

	@SuppressWarnings("unused")
	private void drive_admin() {
		System.out.println("Welcome Admin!");
		System.out.println("Enter your id to proceed");
		int id = s.nextInt();
		System.out.println("Welcome! " + adminlst[id - 1].getName());
		System.out.println("What do you wish today?");
		System.out.println("Press 1 to view all listed properties, press 2 to view list of Buyers");
		System.out.println("Press 3 to view all sellers, press 4 to view list of brokers");
		System.out.println("Press 5 to view all unauthorised transactions, press 6 to authorise transactions");
		System.out.println("Press 7 to view authorised transactions, press 8 to add brokers");
		int chc = s.nextInt();
		if (chc == 1) {

			if (Property.getPropertycount() > 0) {
				System.out.println("List of available properties:");
				for (int i = 0; i <= Property.getPropertycount() - 1; i++) {
					System.out.println(propertylst[i].toString());
				}

			} else {
				System.out.println("No available properties! try later!");
			}

		} else if (chc == 2) {
			if (Buyer.getBuyercount() > 0) {
				System.out.println("List of available Buyers:");
				for (int i = 0; i < Buyer.getBuyercount(); i++) {
					System.out.println(buyerlst[i].toString());
				}
			} else {
				System.out.println("No available Buyers! Try later!");
			}
		} else if (chc == 3) {
			if (Seller.getSellercount() > 0) {
				System.out.println("List of available Sellers:");
				for (int i = 0; i < Seller.getSellercount(); i++) {
					System.out.println(brokerlst[i].toString());
				}
			} else {
				System.out.println("No available Sellers! Try later!");
			}
		} else if (chc == 4) {
			if (Broker.getBrokercount() > 0) {
				System.out.println("List of available Brokers:");
				for (int i = 0; i < Broker.getBrokercount(); i++) {
					System.out.println(brokerlst[i].toString());
				}
			} else {
				System.out.println("No available Brokers! Try later!");

			}
		} else if (chc == 5) {
			if (unauthpayp > 0) {
				System.out.println("List of unauthorised transactions:");
				for (int i = 0; i < unauthpayp; i++) {
					System.out.println(unauthpaymentlst[i].toString());
				}
			} else {
				System.out.println("No available unauthorised transactions! Try later!");

			}
		} else if (chc == 6) {
			System.out.println("Enter the inv_no of transaction you want to authorise:");
			int invn = s.nextInt();
			boolean flag = true;
			for (int i = 0; i < unauthpayp; i++) {
				if (invn == unauthpaymentlst[i].getInv_no()) {
					authpaymentlst[authpayp] = new Payment(unauthpaymentlst[i]);
					authpayp++;
					unauthpaymentlst[i].setnull();
					System.out.println("Authorisation done! Payment completed!");
					break;
				} else {
					flag = false;
				}
			}
			if (!flag) {
				System.out.println("Requested transactions is not found!");
			}
		} else if (chc == 7) {
			if (authpayp > 0) {
				System.out.println("List of authorised transactions:");
				for (int i = 0; i < authpayp; i++) {
					System.out.println(authpaymentlst[i].toString());
				}
			} else {
				System.out.println("No available authorised transactions! Try later!");

			}
		}
		else if(chc==8) {
			String n,p,a,e;
			int bid;
			System.out.println("Enter name of broker:");
			n = s.next();
			System.out.println("Enter phone number:");
			p = s.next();
			System.out.println("Enter address:");
			a = s.next();
			System.out.println("Enter email:");
			e = s.next();
			System.out.println("Enter broker ID:");
			bid = s.nextInt();
			brokerlst[Broker.getBrokercount()] = new Broker(n,p,a,e,bid);
		}
		else {
			System.out.println("INVALID CHOICE!");
		}

	}
}
