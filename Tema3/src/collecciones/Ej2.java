package collecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive.
		 */
		
		// contador para los numeros introducidos en la lista
		int cont;
		
		// variable para hacer la suma de los valores
		int suma = 0;
		
		/*
		 * variable para saber el numero maximo y minimo de la lista
		 * 
		 * inicializamos la variable max al valor minimo posible para que cualquier valor introducido sea mayor
		 * inicializamos la variable min al valor maximo posible para que cualquier valor introducido sea menor
		 */
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// lista para almacenar los numeros aleatorios
		ArrayList <Integer> numAleatorios = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		// variable para almacenar el numero aleatorio generado
		int aleatorio = rand.nextInt(5, 11); // la inicializamos con estos limites para saber cuantos numeros hay que introducir
		
		// veces que se introducen numeros
		System.out.println("Su lista contendra " + aleatorio + " numeros");
		
		// espacio para separar
		System.out.println();
		
		// asignamos el numero de numeros aleatorios que hay que introducir al contador
		cont = aleatorio;
		
		// bucle para controlar el numero de numeros aleatorios quese introducen
		while (cont > 0) {
			
			// generamos los numeros aleatorios para introducir en la lista
			aleatorio = rand.nextInt(0, 101);
			
			// anadimos el numero generado a la lista
			numAleatorios.add(aleatorio);
			
			// restamos 1 a la variable contador para indicar que se ha introducido un numero
			cont--;
		}
		
		// recorremos la lista
		for (int valor : numAleatorios) {
			
			// sumamos los valores de la lista a la suma
			suma += valor;
			
			// comprobamos el valor maximo y minimo de la lista
			if (valor > max) {
				max = valor;
			}
			
			if (valor < min) {
				min = valor;
			}
		}
		
		// mostramos la lista
		System.out.println("Su lista es:");
		System.out.println(numAleatorios);
		
		// espacio para separar
		System.out.println();
		
		// mostramos la suma, la media, el maximo y el minimo
		System.out.println("La suma de los valores de la lista es: " + suma);
		
		// mostramos la media usando un cast para mostrar los decimales
		System.out.println("La media de los valores de la lista es: " + (double) (suma / numAleatorios.size()));
		
		System.out.println("El numero maximo de la lista es: " + max);
		System.out.println("El numero minimo de la lista es: " + min);

	}

}
