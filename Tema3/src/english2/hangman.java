package english2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hangman {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] words = { "python", "java", "html", "css", "javascript", "php", "json" };

		int attempts = 10;

		Random rand = new Random();

		int random;

		String randomWord;

		String clueWord = "";

		char letter;

		int pos = 0;

		boolean found = false;

		random = rand.nextInt(0, words.length);

		randomWord = words[random];

		for (int i = 0; i < randomWord.length(); i++) {
			clueWord += "-";
		}


		do {
			

			System.out.println("Introduce a letter");
			letter = sc.nextLine().toLowerCase().charAt(0);
			
			while (pos < randomWord.length()) {

				if (letter == randomWord.charAt(pos)) {
					clueWord = clueWord.substring(0, pos) + letter + clueWord.substring(pos + 1);
					found = true;
				}

				pos++;
			}

			if (!found) {
				attempts--;
			}

			System.out.println(clueWord);

			System.out.println("Attempts -> " + attempts);

			pos = 0;
			found = false;

		} while (attempts > 0 && !clueWord.equalsIgnoreCase(randomWord));

		System.out.println();

		if (attempts > 0) {
			System.out.println("CONGRATULATIONS! YOU WON");
		} else {
			System.err.println("GAME OVER");
		}

		sc.close();

	}

}
