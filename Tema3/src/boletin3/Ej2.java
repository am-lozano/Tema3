package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
		 */

		// creamos la tabla con las notas los alumnos
		double tabla[][] = new double[4][5];

		// variable para almacenar las notas
		double nota;

		// variable para la nota maxima y minima
		double maxima = 0; // = 0, asignamos el valor mas pequeno para que cualquier nota sea mayor
		double minima = 10; // = 10, asignamos el valor mas grande para que cualquier nota sea menor

		// variable para la media
		double media = 0;

		double media1 = 0;
		double media2 = 0;
		double media3 = 0;
		double media4 = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// i = fila
		// j = columna

		// for para asignar los valores a la tabla
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				System.out.println("Introduzca su nota alumno " + (i + 1));
				nota = sc.nextDouble();

				// asignamos las notas a la tabla
				tabla[i][j] = nota;

			}
			System.out.println();

		}

		// mostramos la tabla con forma de matriz
		System.out.print("\t");

		for (int i = 1; i <= 5; i++)

			System.out.print("\tNota " + i);

		System.out.println();

		for (int i = 0; i < tabla.length; i++) {
			System.out.println();

			System.out.print("Alumno " + (i + 1) + "\t");

			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");

				media += tabla[i][j];

				// comprobamos si la nota introducida es mayor
				if (maxima <= tabla[i][j])
					maxima = tabla[i][j];

				// comprobamos si la nota introducida es menor
				if (minima >= tabla[i][j])
					minima = tabla[i][j];
			}

			System.out.println();

			System.out.println("La nota maxima del alumno " + (i + 1) + " es: " + maxima);
			System.out.println("La nota minima del alumno " + (i + 1) + " es: " + minima);

			System.out.println("La media del alumno " + (i + 1) + " es: " + media / 5);

			media = 0;

		}

		// cerramos el escaner
		sc.close();

	}

}
