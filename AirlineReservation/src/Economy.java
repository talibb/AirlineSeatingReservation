 /* 
  * Done By: Talib Bacchus
  * To be used in conjunction with Passenger.java and firstClass.java
  * See Passenger.java for program specifications
  */
import java.util.Arrays;

public class Economy {

	private int[][] size = new int[30][6];
   
	public boolean doubleSearch(int pref) {
		// Window preference but traveling with two
		if (pref == 3) {
			for (int i = 0; i <= size[0].length; i += 4) {
				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0 && size[j][i + 1] == 0) {
						size[j][i] = 1;
						size[j][i + 1] = 1;
						System.out.println("Seats registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + " and at Row "
								+ (j + 1) + ", Column " + (i + 2) + ".");
						return true;
					}
				}
			}
		}

		// Aisle preference but traveling with two
		if (pref == 4) {
			for (int i = 2; i <= size[0].length - 2; i++) {
				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0 && size[j][i - 1] == 0) {
						size[j][i] = 1;
						size[j][i - 1] = 1;
						System.out.println("Seats registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + " and at Row "
								+ (j + 1) + ", Column " + (i) + ".");
						return true;
					}

				}

			}

		}

		else if (pref == 5) {
			// middle seat preference but traveling with two
			for (int i = 1; i <= size[0].length - 2; i += 3) {
				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0 && size[j][i + 1] == 0) {
						size[j][i] = 1;
						size[j][i + 1] = 1;
						System.out.println("Seats registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + " and at Row "
								+ (j + 1) + ", Column " + (i + 2) + ".");
						return true;
					} else if (size[j][i] == 0 && size[j][i - 1] == 0) {
						size[j][i] = 1;
						size[j][i - 1] = 1;
						System.out.println("Seats registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + " and at Row "
								+ (j + 1) + ", Column " + (i) + ".");
						return true;
					}
				}
			}
		}
		System.out.println("Seats not found");
		return false;
	}

	public boolean tripleSearch() {

		for (int i = 0; i <= size[0].length; i += 3) {
			for (int j = 0; j < size.length; j++) {
				if (size[j][i] == 0 && size[j][i + 1] == 0) {
					if (size[j][i + 2] == 0) {
						size[j][i] = 1;
						size[j][i + 1] = 1;
						size[j][i + 2] = 1;
						System.out.println("Seats registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + " and at Row "
								+ (j + 1) + ", Column " + (i + 2)
								+ " and at Row " + (j + 1) + " , Column "
								+ (i + 3) + ".");
						return true;
					}
				}
			}
		}
		System.out.println("Seats not found");
		return false;
	}

	public boolean singleSearch(int pref) {
		// Window seat preference
		if (pref == 0) {
			for (int i = 0; i <= size[0].length; i += 5) {

				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0) {
						size[j][i] = 1;
						System.out.println("Seat registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + ".");
						return true;
					}

				}

			}
		} else if (pref == 1) {
			// middle seat preference
			for (int i = 1; i <= size[0].length - 2; i += 3) {
				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0) {
						size[j][i] = 1;
						System.out.println("Seat registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + ".");
						return true;
					}
				}
			}
		} else if (pref == 2) {// aisle seat preference
			for (int i = 2; i <= size[0].length - 3; i++) {
				for (int j = 0; j < size.length; j++) {
					if (size[j][i] == 0) {
						size[j][i] = 1;
						return true;
					}
				}
			}
		}
		System.out
				.println("Seat could not be found; please choose another option.");
		return false;
	}

	public void printSeats() {
		for (int i = 0; i < size.length; i++) {
			System.out.println(Arrays.toString(size[i]));
		}

	}
}
