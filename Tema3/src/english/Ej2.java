package english;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Write a program that allows the user to store an arithmetic sequence at an
		 * array and then the program will show it on the screen. An arithmetic sequence
		 * is a series of numbers that starts by an initial value V, and then it
		 * continues with increases of a value I. For example, with V=1 and I=2 the
		 * sequence would be: 
		 * 
		 * 1, 3, 5, 7, 9… 
		 * 
		 * With V=7 and I=10, the sequence would be:
		 * 
		 * 7, 17, 27, 37
		 * 
		 *  The program will ask the user the values V and I, furthermore
		 * the number of values to create (the length of the array).
		 */
		
		// variable to array
		int[] array;
		
		// variable to store the size
		int size;
		
		// variable to store the initial value
		int v;
		
		// variable to store the increases of the value
		int i;
		
		// i create the scanner
		Scanner sc = new Scanner (System.in);
		
		// ask to the array's size
		System.out.println("Introduce the size of the table:");
		size = sc.nextInt();
		
		// assign the size to the table
		array = new int[size];
		
		// ask to the initial value
		System.out.println("Introduce the initial value:");
		v = sc.nextInt();
		
		// ask to the increases of the value
		System.out.println("Introduce the increases of the value");
		i = sc.nextInt();
		
		for (int j = 0; j < array.length; j++)
			array[j] += i;
		
		// i close the scanner
		sc.close();

	}

}
