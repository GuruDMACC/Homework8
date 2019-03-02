package edu.dmacc.codedsm.hw8;

import java.util.ArrayList;

public class StringArrayHw {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>(5);

		String hold;
		boolean arrayisFull = false;
		boolean vowelCheck = false;
		boolean numberCheck = false;

		do {
			hold = Randomzier.createRandomAlphaNumericString(5);
			vowelCheck = validateInput1(hold);
			numberCheck = validateInput2(hold);
			if (vowelCheck == true && numberCheck == true) {
				if (arr1.size() == 5) {
					arrayisFull = true;

					break;
				}

				arr1.add(hold);

			}

		} while (!arrayisFull);

		printArray(arr1);

	}

	private static void printArray(ArrayList<String> arr1) {
		System.out.println("Displaying final Output String Arrays");

		for (int i = 0; i < arr1.size(); i++) {

			System.out.println("Element " + i + " " + arr1.get(i));
		}
	}

	private static boolean validateInput2(String hold) {

		boolean hasDigit;

		hasDigit = hold.matches(".*\\d+.*");

		if (hasDigit == true) {
			System.out.println("Reject : String has number " + hold);
			return false;
		} else {

			return true;
		}

	}

	private static boolean validateInput1(String hold) {
		if ((hold.charAt(0) == 'A') || (hold.charAt(0) == 'E')
				|| (hold.charAt(0) == 'I') || (hold.charAt(0) == 'O')
				|| (hold.charAt(0) == 'U')) {
			return true;
		} else
			return false;
	}

}
