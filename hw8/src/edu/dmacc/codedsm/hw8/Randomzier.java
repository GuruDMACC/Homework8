package edu.dmacc.codedsm.hw8;
import java.util.Random;

public class Randomzier {
	public static void main(String[] args) {
		String generatedString = createRandomAlphaNumericString(5);

		System.out.println(generatedString);
	}

	/* copy and paste this entire method into your homework class */
	public static String createRandomAlphaNumericString(int randomStringLength) {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(randomStringLength);
		for (int i = 0; i < randomStringLength; i++) {
			if (random.nextInt(10) >= 9) {
				buffer.append(random.nextInt(9));
			} else {
				int randomLimitedInt = leftLimit
						+ (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
				char characterForString = (char) randomLimitedInt;
				if (random.nextBoolean()) {
					characterForString = Character
							.toUpperCase(characterForString);
				}
				buffer.append(characterForString);
			}
		}
		return buffer.toString();
	}
}
