/*
 * Done by: Talib Bacchus
 * To be used in conjunction with Economy.java and firstClass.java
 * The program simulates a airline seat reservation system
 * An airplane has two sections: first class and economy
 * first class has 20 seats, consisting five rows and four columns with a walkway
 * splitting the second and third columns
 * economy class has 180 seats consisting of 30 rows and 6 columns
 * with a walkway splitting the columns in half
 * the user can reserve seats by choosing the class they want to fly on, their seating
 * preference, and how many seats they want to buy.
 */
import java.util.Scanner;

public class Passenger {
	
	public static void main(String[] args) {
		int start = 1;
		firstClass seats = new firstClass();
		Economy pos = new Economy();
		Scanner kb = new Scanner(System.in);
		while (start == 1) {

			System.out.println("Welcome to MTB Airlines!");
			System.out.println("Press 1 for First Class seating");
			System.out.println("Press 2 for Economy seating");
			System.out.println("Press 3 to display seating");
			int input = kb.nextInt();

			if (input == 3) {
				System.out.println("First class:");
				seats.printSeats();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Economy class:");
				pos.printSeats();
			}

			if (input == 1) {

				System.out
						.println("Thank you for choosing First class seating!");
				System.out.println("Press 1 for window seat preference");
				System.out.println("Press 2 for aisle seat preference");
				int pref = kb.nextInt(); // selects seating prefrence

				if (pref == 1) {

					System.out
							.println("You selected window seat preference in First class");
					System.out.println("Press 1 for one passenger");
					System.out.println("Press 2 for two passengers");
					int choice = kb.nextInt(); // selects how many flying

					if (choice == 1) {
						seats.singleSearch(0);

						seats.printSeats();
					} else if (choice == 2) {
						seats.doubleSearch();
						seats.printSeats();
					}

				}
				if (pref == 2) {
					System.out
							.println("You selected aisle seat preference in First class");
					System.out.println("Press 1 for one passenger");
					System.out.println("Press 2 for two passengers");
					int choice = kb.nextInt(); // selects how many flying
					if (choice == 1) {
						seats.singleSearch(1);
						seats.printSeats();
					} else if (choice == 2) {
						seats.doubleSearch();
						seats.printSeats();
					}
				}
			}
			if (input == 2) {
				System.out
						.println("Thank you for choosing economy class seating!");
				System.out.println("Press 1 for window seat preference");
				System.out.println("Press 2 for aisle seat preference");
				System.out.println("Press 3 for middle seat preference");
				int pref = kb.nextInt(); // selects seating prefrence
				if (pref == 1) {
					System.out
							.println("You selected window seat preference in Economy class");
					System.out.println("Press 1 for one passenger seating");
					System.out.println("Press 2 for two passenger seating");
					System.out.println("Press 3 for three passenger seating");
					int choice = kb.nextInt(); // selects how many flying

					if (choice == 1) {
						pos.singleSearch(0);
						pos.printSeats();
					} else if (choice == 2) {
						pos.doubleSearch(3);
						pos.printSeats();
					} else if (choice == 3) {
						pos.tripleSearch();
						pos.printSeats();
					}

				} else if (pref == 2) {
					System.out
							.println("You selected aisle seat preference in Economy class");
					System.out.println("Press 1 for one passenger seating");
					System.out.println("Press 2 for two passenger seating");
					System.out.println("Press 3 for three passenger seating");
					int choice1 = kb.nextInt(); // selects how many flying
					if (choice1 == 1) {
						pos.singleSearch(2);
						pos.printSeats();
					} else if (choice1 == 2) {
						pos.doubleSearch(4);
						pos.printSeats();
					} else if (choice1 == 3) {
						pos.tripleSearch();
						pos.printSeats();
					}
				}
				if (pref == 3) {
					System.out
							.println("You selected middle seat preference in Economy class");
					System.out.println("Press 1 for one passenger seating");
					System.out.println("Press 2 for two passenger seating");
					System.out.println("Press 3 for three passenger seating");
					int choice1 = kb.nextInt(); // selects how many flying
					if (choice1 == 1) {
						pos.singleSearch(1);
						pos.printSeats();
					} else if (choice1 == 2) {
						pos.doubleSearch(5);
						pos.printSeats();
					} else if (choice1 == 3) {
						pos.tripleSearch();
						pos.printSeats();
					}
				}
			}
		}
	}   
}
