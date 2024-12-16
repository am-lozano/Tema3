package english2;

import java.util.Scanner;

public class encode {

	public static void main(String[] args) {
		
		String phrase;
		
		char character = ' ';
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce the phrase");
		phrase = reader.nextLine().toUpperCase();
		
		for (int i = 0 ; i < phrase.length() ; i++) {
			character = phrase.charAt(i);
			if (character >= 65 && character <= 90 || character >= 48 && character <= 57) {
				if (character =='Z') {
					character = 'A';
				} else if (character == '9'){
					character = '0';
				} else {
					character = (char)(phrase.charAt(i) + 1);
				}
			}
			System.out.print((char)character);
		}
		
		reader.close();
		
		
		
		
	}

}
