package org.techquiero.libreria;

import org.techquiero.model.Biblio;
import org.techquiero.model.imprimirArchivo;

public class App {

	public static void main(String[] args) {
		
		Biblio pedido = new Biblio();
		imprimirArchivo imp = new imprimirArchivo();
		
		pedido.main(args);
		imp.Escribir("NuevoPedido.txt");
		System.out.println("Archivo NuevoPedido.txt creado");

	}

}
