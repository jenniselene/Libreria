package org.techquiero.model;

import org.techquiero.model.*;
import org.techquiero.model.Carrito.ItemCarrito;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Unidades {

	private JFrame frmLibreriaTechquiero;
	int idx = 0; // Indice elemento de la lista a cambiar cantidad
	public ItemCarrito itemAcambiar;
	int qt; // Cantidad seleccionada por el usuario

	public static String datosLibroSeleccionado = "";

	/**
	 * Launch the application.
	 */
	/*
	 * public static void MuestraCantidad(Libro libro) { datosLibroSeleccionado =
	 * libro.getTitulo() + ", " + libro.getAutor();
	 */
	
	public void MuestraCantidad(ItemCarrito item) {
		Libro libro = item.GetLibro();
		datosLibroSeleccionado = libro.getTitulo() + ", " + libro.getAutor();
	 
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					Unidades window = new Unidades(item);
					window.frmLibreriaTechquiero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public Unidades(ItemCarrito item) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmLibreriaTechquiero = new JFrame();
		frmLibreriaTechquiero.setTitle("Libreria TechQuiero");
		frmLibreriaTechquiero.setBounds(100, 100, 450, 300);
		frmLibreriaTechquiero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibreriaTechquiero.getContentPane().setLayout(null);

		JLabel lblLibroAgregadoA = new JLabel("Libro Agregado a Pedido.");
		lblLibroAgregadoA.setBounds(12, 13, 270, 16);
		frmLibreriaTechquiero.getContentPane().add(lblLibroAgregadoA);

		JLabel lblConfirmeLaCantidad = new JLabel("Confirme la cantidad:");
		lblConfirmeLaCantidad.setBounds(12, 49, 180, 16);
		frmLibreriaTechquiero.getContentPane().add(lblConfirmeLaCantidad);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(52, 195, 97, 25);
		frmLibreriaTechquiero.getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hasta Luego!");
				System.exit(0);
			}
		});

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner.setBounds(373, 101, 30, 22);
		frmLibreriaTechquiero.getContentPane().add(spinner);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(22, 82, 323, 53);
		frmLibreriaTechquiero.getContentPane().add(textPane);
		textPane.setText(datosLibroSeleccionado);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(231, 195, 97, 25);
		frmLibreriaTechquiero.getContentPane().add(btnAceptar);
		// JOptionPane.showMessageDialog(null, "item.cantidad antes: " +
		// this.itemAcambiar.GetCantidad()); // jennisem
		btnAceptar.addActionListener(new ActionListener() {

			private int cantidadSelecc = 0;

			private void setCantidadSelecc(int cant) {
				qt = cant;
				System.out.println("itemAcambiar.cantdidad: " + qt);
			}

			public void actionPerformed(ActionEvent e) {
				// Ponemos el valor de cantidad del spinner en la copia de itemAcambiar
				this.setCantidadSelecc((int) spinner.getValue());
				frmLibreriaTechquiero.setVisible(false);
				frmLibreriaTechquiero.dispose();
			}
		});

		// Modificamos itemAcambiar con el nuevo valor
		// this.itemAcambiar = item;
	}

}
