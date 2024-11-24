package boletin4bi;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
		 * una tabla bidimensional. 
		 * La función devolverá true si la matriz introducida
		 * corresponde a una matriz mágica, que es aquella donde la suma de los
		 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
		 * contrario devolverá false.
		 * 
		 */
		
		// variable para almacenar la matriz a comprobar
//		int[][] tabla = {{4,9,2}, {3,5,7}, {8,1,6}};
//		int[][] tabla = {{5,10,3}, {4,6,8}, {9,2,7}};
		int[][] tabla = {{4,8,2}, {6,5,7}, {8,4,6}};
		
		System.out.println("Su matriz es: ");
		
		// bucle para mostrar la matriz
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print(tabla[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(esMagica(tabla) ? "La matriz es magica" : "La matriz no es magica");
		
	}
	
	static boolean esMagica (int tabla[][]) {
		
		// variable boolean para saber si la matriz es magica
		boolean magica = true;
		
		// variable para la suma de los valores de las columnas o filas de la matriz
		int suma = 0;
		
		// variable para saber la suma de las filas o columnas
		int sumaFilaCol = 0;
		
		// recorremos la matriz y comprobamos que la suma de la fila o columna es igual a la suma anterior
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				
				suma += tabla[i][j];
			}
			
			if (i == 0)
				sumaFilaCol = suma;
			
			// comprobamos la suma de las filas de la matriz
			if (suma != sumaFilaCol)
				magica = false;
			
			suma = 0;
		}
		
		for (int j = 0; j < tabla[0].length; j++) {
			for (int i = 0; i < tabla[j].length; i++) {
				
				suma += tabla[j][i];
			}
			
			if (j == 0)
				sumaFilaCol = suma;
			
			// comprobamos la suma de las filas de la matriz
			if (suma != sumaFilaCol)
				magica = false;
			
			suma = 0;
		}
		
		
		
		return magica;
		
	}

}
