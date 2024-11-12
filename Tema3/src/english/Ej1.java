package english;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates an array to store 10 integer numbers. Then, it
		 * must show de next menu:
		 * 
		 * a. Show values. b. Introduce a value. c. Exit.
		 * 
		 * Option ‘a’ will show all the values on the screen. Option ‘b’ will ask for a
		 * value V and a position P and then it will write that value V on the position
		 * P of the array. The menu will be shown indefinitely until the user chooses
		 * the option ‘c’.
		 */
		
		// variable to create array
		int[] numbers = new int[10];

		// variable to store the option
		char option;

		// variable to store the values in menu's b option
		int value;
		int position;

		// i create the scanner
		Scanner sc = new Scanner(System.in);

		do {

			// show the menu
			System.out.println(" a. Show values.\n b. Introduce a value.\n c. Exit.");

			System.out.println("Select an option:");
			option = sc.next().charAt(0);

			switch (option) { // switch to see the option selected

			case 'a', 'A' -> {
				System.out.println(Arrays.toString(numbers));

			}
			case 'b', 'B' -> {
				System.out.println("Introduce a value:");
				value = sc.nextInt();

				System.out.println("Introduce a position:");
				position = sc.nextInt();

				numbers[position] = value;

			}
			default -> {
				System.err.println("Error, introduce a valid option:");
			}

			}

		} while (option != 'c');

		// i close the scanner
		sc.close();

	}

}
