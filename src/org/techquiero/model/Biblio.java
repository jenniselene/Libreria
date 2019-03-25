/*Crear una aplicación en Java que simule el comportamiento de una tienda de libros.

* Mostrar al usuario en consola todos los libros disponibles
* Preguntar al usuario cuántos libros quiere
* Dar la forma al usuario de elegir qué libros quiere
* Guardar los libros elegidos en un carrito de compras (lista de libros)
* Imprimir el carrito de compras (lista de libros) en un archivo de texto
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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Biblio {
	
	public static Carrito carritoDeCompras = new Carrito(); // El carrito de compras
	public static String cadena = "";
	
	public static void agregaLibro(List<Libro> list,String titulo, String autor, double precio){
		
		Libro tmp = new Libro(titulo, autor, precio);
		list.add(tmp);
		
	}
	
	public static ArrayList<Libro> agregaTodosLibros(){
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
		
		return list;
	}

	private JFrame frmBienvenidosALibreria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ArrayList<Libro> list = agregaTodosLibros();
		
		for(Libro libro: list) {
			cadena = cadena  + libro.toString();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblio window = new Biblio();
					window.frmBienvenidosALibreria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Biblio() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBienvenidosALibreria = new JFrame();
		frmBienvenidosALibreria.setTitle("Bienvenidos a Libreria TechQuiero");
		frmBienvenidosALibreria.setBounds(100, 100, 716, 488);
		frmBienvenidosALibreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBienvenidosALibreria.getContentPane().setLayout(null);
		
		JLabel lblCatalogoDeLibros = new JLabel("Catalogo de libros en existencia");
		lblCatalogoDeLibros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatalogoDeLibros.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCatalogoDeLibros.setBounds(12, 13, 659, 25);
		frmBienvenidosALibreria.getContentPane().add(lblCatalogoDeLibros);
		
		JTextPane txtpnHola = new JTextPane();
		txtpnHola.setFont(new Font("Courier New", Font.PLAIN, 15));
		txtpnHola.setText(cadena);
		txtpnHola.setBounds(22, 99, 649, 249);
		frmBienvenidosALibreria.getContentPane().add(txtpnHola);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(268, 375, 155, 25);
		frmBienvenidosALibreria.getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				Seleccion sel = new Seleccion();
				sel.NewScreen();
				frmBienvenidosALibreria.setVisible(false);
				frmBienvenidosALibreria.dispose();
			}			

		});
		
		JLabel lblTituloAutor = new JLabel("Titulo  | Autor  |  Precio");
		lblTituloAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloAutor.setBounds(33, 61, 589, 25);
		frmBienvenidosALibreria.getContentPane().add(lblTituloAutor);
	}
}
