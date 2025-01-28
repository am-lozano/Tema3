package englishCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej1 {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		TreeMap<String, String> lista2 = new TreeMap<>();
		
		String cad;
		
		String[] palabras;
		
		int pos;
		
		int cont = 1;
		
		String a = "";
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce a phrase:");
		cad = sc.nextLine();
		
		while (!cad.equalsIgnoreCase("end")) {
			
			lista1.add(cad);
			
			palabras = cad.split(" ");
			
			for (int i = 0; i < palabras.length; i++) {
								
				
				
				if (palabras[i].length() > 1) {
					
					
					a += cont + " ";
				}
				
				lista2.put(palabras[i], a);				
			}
			
			
			
			cont++;
			
			System.out.println("Introduce a phrase:");
			cad = sc.nextLine();
			
		
		}
		
		System.out.println(lista1);
		System.out.println(lista2);
		
		lista2.entrySet();
		
		System.out.println(lista2);
		
		sc.close();
	}

}
