package boletin2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[10];
		int[] array2 = new int[10];

		System.out.println("Introduce 20 valores enteros:");

		// Llenar el primer array
		System.out.println("Introduce los primeros 10 valores:");
		for (int i = 0; i < 10; i++) {
			array1[i] = sc.nextInt();
		}

		// Llenar el segundo array
		System.out.println("Introduce los siguientes 10 valores:");
		for (int i = 0; i < 10; i++) {
			array2[i] = sc.nextInt();
		}

		// Comparar ambos arrays
		boolean sonIguales = true;
		for (int i = 0; i < 10; i++) {
			if (array1[i] != array2[i]) {
				sonIguales = false;
				break;
			}
		}

		// Mostrar resultado
		if (sonIguales) {
			System.out.println("Los arrays son iguales.");
		} else {
			System.out.println("Los arrays NO son iguales.");
		}
		
		// cerramos el escaner
		sc.close();
	}
}
