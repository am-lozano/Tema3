package english2;

import java.util.Scanner;

public class cesarCipher {

	public static void main(String[] args) {

		String phrase;

		char character = ' ';

		int shift;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce the phrase");
		phrase = reader.nextLine().toUpperCase();

		System.out.println("Introduce the shift");
		shift = reader.nextInt();

		for (int i = 0; i < phrase.length(); i++) {
			character = phrase.charAt(i);
			if (character >= && character <= 90 || character >= 48 && character <= 57) {
				if (shift > 0) {
					if (character == 'Z') {
						character = 'A';
					} else if (character == '9') {
						character = '0';
					} else {
						character = (char) (phrase.charAt(i) + shift);
						System.out.print(character);
					}
				} else {
					if (character == 'A') {
						character = 'Z';
					} else if (character == '0') {
						character = '9';
					} else {
						character = (char) (phrase.charAt(i) + shift);
						System.out.print(character);
					}
				}
			} else {
				System.out.print((char) character);
			}
		}

		reader.close();

	}

}
