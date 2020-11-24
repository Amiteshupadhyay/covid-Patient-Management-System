package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Operation {
	static Map<String, PatientDetails> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String newline = System.lineSeparator();
		String mainMenu = "1.Add" + newline + "2.Update" + newline + "3.Search";
		System.out.println(mainMenu);
		int choice = sc.nextInt();

		do {
			switch (choice) {
			case 1:
				add();
				System.out.println(newline+"Main Menu");
				System.out.println(mainMenu);
				choice = sc.nextInt();
				break;
			case 2:
				update();
				System.out.println(newline+"Main Menu");
				System.out.println(mainMenu);

				choice = sc.nextInt();
				break;
			case 3:
				search();
				System.out.println(newline+"Main Menu");
				System.out.println(mainMenu);
				choice = sc.nextInt();
				break;
			default:
				System.out.println(mainMenu);

				choice = sc.nextInt();
				break;
			}

		} while (choice != 0);
		sc.close();
	}

	private static void search() {
		System.out.println("Enter AdharNumber");
		String adhar = sc.next();
		
		if(map != null && !map.isEmpty()) {
			if (map.containsKey(adhar)) {
				PatientDetails p = map.get(adhar);
				System.out.println("Patient Details");
				System.out.println(p);

			} else {
				System.out.println("Sorry, we could not find this patient");
			}
		}	

	}

	private static void update() {
		System.out.println("Enter adharId");
		String adhar = sc.next();
		if (map != null && !map.isEmpty()) {
			PatientDetails p = map.get(adhar);
			System.out.println("Enter the status");
			char status = sc.next().charAt(0);
			p.setStatus(status);
			System.out.println(p);
		} else {
			System.out.println("Sorry, we could not find this patient");
		}
	}

	private static void add() {
		System.out.println("*************************************Enter Patient Details*************************************");

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
		if (!(status == 'P' || status == 'R' || status == 'D')) {
			while (!(status == 'P' || status == 'R' || status == 'D')) {
				System.out.println("Invalid status, please try again");
				status = sc.next().charAt(0);
				status = Character.toUpperCase(status);
			}

		}

		PatientDetails p = new PatientDetails(adhar, Name, state, city, pin, status);
		System.out.println("Patient added succesfully");
		// System.out.println();

		map.put(adhar, p);
	}

}
