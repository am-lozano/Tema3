package collecciones2;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
		 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
		 * muestre el conteo por pantalla. Usa la implementación más apropiada:
		 * 
		 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango,
		 * ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad".
		 * 
		 * Pista: se puede utilizar el método estático isLetter de la clase Character.
		 * 
		 */
		
		// lista para guardar las las palabras de la oracion
		ArrayList<String> cad = new ArrayList<>();
		
		// conjunto para saber la frecuencia de cada letra
		LinkedHashMap<Character, Integer> cantidad = new LinkedHashMap<>();
		
		// variable para anadir las claves en el mapa, estas seran las letras del abecedario
		char letras = 'a';
		
		// variable para almacenar la oracion
		String oracion = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		// mostramos la oracion
		System.out.println(oracion);
		
		// pasamos el texto a letras minusculas
		oracion = oracion.toLowerCase();
		
		// anadimos la oracion a la lista cad
		cad.add(oracion);
		
		
//		// bucle for-each para anadir las los caracteres de la oracion
//		for (char letra : oracion.toCharArray()) {
//			
//			// si el caracter de la oracion es una letra lo anadimos en la lista
//			if (Character.isLetter(letra)) {
////				cad.add(letra);
//			}
//			
//		}
		
		
	}

}
