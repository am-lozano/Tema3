package boletin4bi;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una
		 * matriz de NxN (mismo número de filas y columnas), devuelve la tablaInicio
		 * girada 90º:
		 */
		
		// variable para almacenar la tabla orignal
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// variable para almacenar el valor de slaida del metodo giro90
		int[][] girada = giro90(matriz);
		
		// mostramos la tabla original
		System.out.println("Su matriz es:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// mostramos la matriz girada
		System.out.println("La matriz girada queda:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(girada[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// metodo para girar la matriz 90º
	static int[][] giro90 (int t[][]){
		
		int[][] girada = new int[t.length][t[0].length];
		
		// leemos la tabla por filas pero al reves, es decir, desde la ultima fila hasta la primera, en orden ascendente
		for (int i = t.length -1; i >= 0; i--) {
			for (int j = 0; j < t[i].length - 1; j++) {
				
				// asignamos los valores de la matriz original a la matriz girada
				girada[i][j] = t[i][j];
			}
		}
		
		return girada;
	}

}