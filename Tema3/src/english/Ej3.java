package english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Random rand = new Random();

		Scanner reader = new Scanner(System.in);

		int array[] = new int[10];

		int positionUser;

		int positionFly = rand.nextInt(0, 10);

		array[positionFly] = 1;

		do {
			System.out.println("Introduce a position of the fly");
			positionUser = reader.nextInt();

			if (positionUser == 0) {
				if (array[positionUser + 1] == 1) {
					System.out.println("You have been close, but the fly has changed the position");
					System.out.println();
					Arrays.fill(array, 0);
					positionFly = rand.nextInt(0, 10);
				} else {
					System.out.println("The fly is far of this position. The fly is in the same position");
					System.out.println();
				}
			} else if (positionUser == 9) {
				if (array[positionUser - 1] == 1) {
					System.out.println("You have been close, but the fly has changed the position");
					System.out.println();
					Arrays.fill(array, 0);
					positionFly = rand.nextInt(0, 10);

				} else {
					System.out.println("The fly is far of this position. The fly is in the same position");
					System.out.println();
				}

			} else {

				if (array[positionUser - 1] == 1 || array[positionUser + 1] == 1) {
					System.out.println("You have been close, but the fly has changed the position");
					System.out.println();
					Arrays.fill(array, 0);
					positionFly = rand.nextInt(0, 10);
				} else {
					System.out.println("The fly is far of this position. The fly is in the same position");
					System.out.println();
				}
			}

		} while (array[positionUser] != 1);

		System.out.println("You have found the fly");

		reader.close();

	}

}
