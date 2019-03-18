/*Crear una aplicación en Java que simule el comportamiento de una tienda de libros.

* Mostrar al usuario en consola todos los libros disponibles
* Preguntar al usuario cuántos libros quiere
* Dar la forma al usuario de elegir qué libros quiere
* Guardar los libros elegidos en un carrito de compras (lista de libros)
* Imprimir el carritto de compras (lista de libros) en un archivo de texto
* Mostrar al usuario en consola, la ruta del archivo como “nota”
* Entregar el código mediante github

Al iniciar la aplicación crear los siguientes libros y guardarlos en la biblioteca (lista de libros):

* Microservicios : Christian Posta : $45.98
* Patrones de diseño: Markus Eisele: $72.80
* Programación Orientada a Objetos: Richard Warbuton: $36.72
* Aprendiendo Java: Ben Evans: $66.81
* Aprendiendo Python: David Mertz: $43.27
* Big Data con Hadoop: Donald Miner: $39.60
* IOS con Swift: Tim Nugent: $24.18
* Programación reactiva: Konrad Malawski: $58.70
* Programación con C: Joel Falcou: $67.93
* Diseño de sistemas: Doug Davis: $55.67

Si se desea que en vez de leer/imprimir datos en consola se haga a través de ventanas, sumará puntos al proyecto.
Se hará una mención de las mejores implementaciones en la graduación. (editado) */
package org.techquiero.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import org.techquiero.libreria.*;


public class Biblioteca {
	
	
	
	public static void agregaLibro(List<Libro> list,String titulo, String autor, double precio){
		
		Libro tmp = new Libro(titulo, autor, precio);
		list.add(tmp);
		
	}
		
	public static void main(String[] a) {
		ArrayList<Libro> list = new ArrayList<Libro>();
		agregaLibro(list,"Microservicios","Christian Posta",45.98);
		agregaLibro(list,"Patrones de diseño","Markus Eisele",72.80);
		agregaLibro(list,"Programación Orientada a Objetos","Richard Warbuton",36.72);
		agregaLibro(list,"Aprendiendo Java","Ben Evans",66.81);
		agregaLibro(list,"Aprendiendo Python","David Mertz",43.27);
		agregaLibro(list,"Big Data con Hadoop","Donald Miner",39.60);
		agregaLibro(list,"IOS con Swift","Tim Nugent",24.18);
		agregaLibro(list,"Programación reactiva","Konrad Malawski",58.70);
		agregaLibro(list,"Programación con C","Joel Falcou",67.93);
		agregaLibro(list,"Diseño de sistemas","Doug Davis",55.67);
		
		JOptionPane.showMessageDialog(null, list);
		//System.out.println(list);
	
	
	}
}
