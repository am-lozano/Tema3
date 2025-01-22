package collecciones;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla.
		 */

		// lista para almacenar los numeros, usamos treeset para ordenar por unicode
		TreeSet<Integer> numAleatorios = new TreeSet<Integer>();

		// clase random para generar numeros aleatorios
		Random rand = new Random();

		// variable para almacenar el numero aleatorio generado
		int aleatorio;

		// contain para saber si el numero aleatorio es repetido

		// bucle para generar los numeros aleatorios y almacenarlos en la lista
		while (numAleatorios.size() < 20) {

			// generamos un numero aleatorio
			aleatorio = rand.nextInt(0, 101);

			// anadimos el numero a la lista
			numAleatorios.add(aleatorio);

		}

		// mostramos la lista
		System.out.println();

	}

}
