package org.techquiero.model;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Window.Type;

public class testgui {

	private JFrame frmLibreria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testgui window = new testgui();
					window.frmLibreria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibreria = new JFrame();
		frmLibreria.setTitle("Libreria TechQuiero");
		frmLibreria.setBounds(100, 100, 450, 300);
		frmLibreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibreria.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(12, 123, 324, 32);
		frmLibreria.getContentPane().add(comboBox);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la Libreria TechQuiero");
		lblBienvenidoALa.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoALa.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBienvenidoALa.setBounds(12, 13, 420, 24);
		frmLibreria.getContentPane().add(lblBienvenidoALa);
		
		JLabel lblSeleccionaTusLibros = new JLabel("Selecciona tus libros: ");
		lblSeleccionaTusLibros.setBounds(12, 50, 393, 21);
		frmLibreria.getContentPane().add(lblSeleccionaTusLibros);
		
		JLabel lblTituloAutor = new JLabel("Titulo, Autor");
		lblTituloAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTituloAutor.setBounds(12, 94, 126, 16);
		frmLibreria.getContentPane().add(lblTituloAutor);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCantidad.setBounds(350, 89, 66, 21);
		frmLibreria.getContentPane().add(lblCantidad);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(360, 123, 45, 32);
		frmLibreria.getContentPane().add(formattedTextField);
	}
}
