package org.techquiero.model;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.techquiero.model.*;
import org.techquiero.model.Carrito.ItemCarrito;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JInternalFrame;

public class Seleccion {
	
	//Carrito myCarrito = new Carrito();

	private JFrame frmBienvenidosALibreria;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seleccion window = new Seleccion();
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
	ArrayList<Libro> list = new ArrayList<Libro>();
	
	public Seleccion() {
		
		Biblio.agregaLibro(list,"Microservicios","Christian Posta",45.98);
		Biblio.agregaLibro(list,"Patrones de diseño","Markus Eisele",72.80);
		Biblio.agregaLibro(list,"Programación Orientada a Objetos","Richard Warbuton",36.72);
		Biblio.agregaLibro(list,"Aprendiendo Java","Ben Evans",66.81);
		Biblio.agregaLibro(list,"Aprendiendo Python","David Mertz",43.27);
		Biblio.agregaLibro(list,"Big Data con Hadoop","Donald Miner",39.60);
		Biblio.agregaLibro(list,"IOS con Swift","Tim Nugent",24.18);
		Biblio.agregaLibro(list,"Programación reactiva","Konrad Malawski",58.70);
		Biblio.agregaLibro(list,"Programación con C","Joel Falcou",67.93);
		Biblio.agregaLibro(list,"Diseño de sistemas","Doug Davis",55.67);
		
		initialize();
		
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBienvenidosALibreria = new JFrame();
		frmBienvenidosALibreria.setTitle("Bienvenidos a Libreria TechQuiero");
		frmBienvenidosALibreria.setBounds(100, 100, 754, 332);
		frmBienvenidosALibreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBienvenidosALibreria.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Courier New", Font.PLAIN, 15));
		comboBox.setBounds(32, 101, 679, 40);
		frmBienvenidosALibreria.getContentPane().add(comboBox);

		for(Libro libro : this.list) {
		    comboBox.addItem(libro);
		}
		
		JButton btnAgregar = new JButton("Agregar a carrito");
		btnAgregar.setBounds(294, 223, 159, 25);
		frmBienvenidosALibreria.getContentPane().add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener(){
			 
	        public void actionPerformed(ActionEvent e) {
	        	ItemCarrito myItem;

	        	// Agrega items al carrito
	        	Libro libroSeleccionado = (Libro) comboBox.getSelectedItem();
	        	int index = Biblio.carritoDeCompras.AgregaUno(libroSeleccionado);
	        	System.out.println("En Carrito: \n" + Biblio.carritoDeCompras.toString()); 
	        	//JOptionPane.showMessageDialog(null, "Agregado a carrito");
	        	myItem = Biblio.carritoDeCompras.items.get(index);
	        	
	        	// Construimos la clase Unidades pasando el ultimo elemento ItemCarrito de la lista
	        	Unidades cnt = new Unidades(myItem);
	        	cnt.MuestraCantidad(myItem);
	        	
	        	// Una vez que cnt.itemAcambiar tiene la cantidad de libros deseados, 
	        	//lo copiampos a la lista en la posicion idx
	        	Biblio.carritoDeCompras.items.set(index, myItem);
	    		

	        }
		});
		
		JButton btnContinuar = new JButton("Revisar Pedido");
		btnContinuar.setBounds(549, 223, 140, 25);
		frmBienvenidosALibreria.getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				//System.out.println(Biblio.carritoDeCompras.ImprimePedido());
				frmBienvenidosALibreria.setVisible(false);
				frmBienvenidosALibreria.dispose();
				JOptionPane.showMessageDialog(null, "Total del Pedido: $"+Biblio.carritoDeCompras.TotalPedido()
				+"\n\nGracias por su preferencia!");
				
				imprimirArchivo imp = new imprimirArchivo();
				imp.Escribir("NuevoPedido.txt");
				System.out.println("Archivo NuevoPedido.txt creado");
			}			

		});
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(73, 223, 115, 25);
		frmBienvenidosALibreria.getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener(){
				 
	        public void actionPerformed(ActionEvent e) {
	        	JOptionPane.showMessageDialog(null, "Hasta Luego!");
	            System.exit(0);
	        }
		});
				
		JLabel lblTitulo = new JLabel("Titulo   |   Autor   |   Precio  ");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitulo.setBounds(28, 57, 236, 16);
		frmBienvenidosALibreria.getContentPane().add(lblTitulo);
		
		
		JLabel lblSeleccioneLosLibros = new JLabel("Seleccione los libros deseados: ");
		lblSeleccioneLosLibros.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSeleccioneLosLibros.setBounds(28, 13, 341, 16);
		frmBienvenidosALibreria.getContentPane().add(lblSeleccioneLosLibros);
		
		
	}
}
