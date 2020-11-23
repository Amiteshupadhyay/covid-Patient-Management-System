package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operation {
	static Map<String, PatientDetails> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1.Add");
		System.out.println("2.update");
		System.out.println("3.delete");

		int choice = sc.nextInt();

		do {
			switch (choice) {
			case 1:
				add();
				choice = sc.nextInt();
				break;
			case 2:
				update();
				choice = sc.nextInt();
				break;
			case 3:
				delete();
				choice = sc.nextInt();
				break;
			default:
				System.out.println("Enter valid choice");
			}

		} while (choice != 0);

	}

	private static void delete() {
		System.out.println("Enter AdharNumber");
		String adhar = sc.next();

		if (map.containsKey(adhar)) {
			map.remove(adhar);
		} else {
			System.out.println("Sorry, we could not find this patient");
		}

	}

	private static void update() {
		System.out.println("Enter adharId");
		String adhar = sc.next();

		if (!map.isEmpty()) {
			PatientDetails p = map.get(adhar);
			System.out.println("Enter the status");
			char status = sc.next().charAt(0);
			p.setStatus(status);
			System.out.println(p);
		}
	}

	private static void add() {
		System.out.println("**********Enter Patient Details**********");

		System.out.println("Enter Patient AdharNumber");
		String adhar = sc.next();

		System.out.println("Enter Patient Name");
		String Name = sc.next();

		System.out.println("Enter State");
		String state = sc.next();

		System.out.println("Enter City");
		String city = sc.next();

		System.out.println("Enter Pin");
		int pin = 0;
		try {
			pin = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Wrong Pin");
		}

		System.out.println("Enter Status 'P' for Positive, 'R' for Recoverd, 'D' for Deceived");
		char status = sc.next().charAt(0);
		status = Character.toUpperCase(status);
		if (!(status == 'P' || status == 'C' || status == 'D')) {
			while (!(status == 'P' || status == 'C' || status == 'D')) {
				System.out.println("Invalid status, please try again");
				status = sc.next().charAt(0);
				status = Character.toUpperCase(status);
			}

		}

		PatientDetails p = new PatientDetails(adhar, Name, state, city, pin, status);

		map.put(adhar, p);
	}

}
