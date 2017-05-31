 /* 
  * Done By: Talib Bacchus
  * To be used in conjunction with Passenger.java and Economy.java
  * See Passenger.java for program specifications
  */
import java.util.Arrays;

public class firstClass {


	private int[][] size = new int[5][4];

	public boolean doubleSearch() {
		// if(pref == 0)
		{
			for (int i = 0; i < size.length - 1; i += 2) {
				for (int j = 0; j <= size[0].length; j++) {
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
		System.out.println("Seats not found");
		return false;
	}

	// Window preference
	public boolean singleSearch(int pref) {
		if (pref == 0) {
			for (int i = 0; i < size.length; i += 3) {
				for (int j = 0; j <= size[0].length; j++) {
					if (size[j][i] == 0) {
						size[j][i] = 1;
						System.out.println("Seat registered at Row " + (j + 1)
								+ ", Column " + (i + 1) + ".");
						return true;
					}
				}

			}
		}
		// Aisle preference
		else if (pref == 1) {
			for (int i = 1; i < size.length - 2; i++) {
				for (int j = 0; j <= size[0].length; j++) {
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
		for (int i = 0; i <= size[0].length; i++)
			System.out.println(Arrays.toString(size[i]));
	}
}