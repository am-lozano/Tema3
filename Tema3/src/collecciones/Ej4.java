package collecciones;

import java.util.LinkedList;
import java.util.Random;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 10, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla.
		 */
		
		// se supone que es treeset
		
		// lista para almacenar los numeros
		LinkedList<Integer> numAleatorios = new LinkedList<Integer>();

		Random rand = new Random();

		// variable para almacenar el numero minimo posible para generar
		int min = Integer.MIN_VALUE;
		
		// variable para almacenar el numero aleatorio generado
		int aleatorio = rand.nextInt(min, 11);
		
		
	}

}
