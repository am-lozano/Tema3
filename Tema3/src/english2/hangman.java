package english2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hangman {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] words = { "python", "java", "html", "css", "javaScript", "php", "json" };

		int attempts = 10;

		Random rand = new Random();

		int random;

		String randomWord;

		String wordToGuess = "";

		char letter;

		int pos;

		random = rand.nextInt(0, words.length);

		randomWord = words[random];

		for (int i = 0; i < randomWord.length(); i++) {
			wordToGuess+= "-";
		}

		System.out.println(wordToGuess);
		
		char[] guess = wordToGuess.toCharArray();

		System.out.println("Introduce a letter");
		letter = sc.next().charAt(0);

		pos = randomWord.indexOf(letter);

		while (attempts > 0 ) {
			while (pos > 0) {
				guess[pos] = letter;
				pos = randomWord.indexOf(letter, pos);
			if (pos ) {
				attempts--;

			}
			
			
			System.out.println(Arrays.toString(guess));

			
			System.out.println("Introduce a letter");
			letter = sc.next().charAt(0);


		}

		sc.close();

	}

}
