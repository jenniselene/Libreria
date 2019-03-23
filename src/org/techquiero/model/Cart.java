package org.techquiero.model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Cart {

	private JFrame frmConfirmarPedido;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void CartScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
					window.frmConfirmarPedido.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfirmarPedido = new JFrame();
		frmConfirmarPedido.setTitle("Confirmar Pedido | TechQuiero");
		frmConfirmarPedido.setBounds(100, 100, 595, 472);
		frmConfirmarPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConfirmarPedido.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Micro", "Autor", 45, 2},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Titulo", "Autor", "Precio", "Cantidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setMinWidth(20);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.setBounds(12, 59, 553, 171);
		frmConfirmarPedido.getContentPane().add(table);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(36, 30, 56, 16);
		frmConfirmarPedido.getContentPane().add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAutor.setBounds(177, 30, 56, 16);
		frmConfirmarPedido.getContentPane().add(lblAutor);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrecio.setBounds(318, 30, 56, 16);
		frmConfirmarPedido.getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidad.setBounds(455, 30, 86, 16);
		frmConfirmarPedido.getContentPane().add(lblCantidad);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(110, 357, 97, 25);
		frmConfirmarPedido.getContentPane().add(btnCancelar);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setBounds(358, 357, 134, 25);
		frmConfirmarPedido.getContentPane().add(btnFinalizarCompra);
	}

}
