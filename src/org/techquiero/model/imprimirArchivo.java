package org.techquiero.model;

import java.io.*;
import javax.swing.JOptionPane;

public class imprimirArchivo {
	
// Metodo para escribir a un archivo
	
	public void Escribir (String fileName){
		
		File file;
		FileWriter fw;
		BufferedWriter br;
		PrintWriter pr;
		
		try {
			file = new File(fileName);
			fw = new FileWriter(file);
			br = new BufferedWriter(fw);
			pr = new PrintWriter(br);
			
			fw.write(Biblio.carritoDeCompras.ImprimePedido());
			System.out.println(Biblio.carritoDeCompras.ImprimePedido());
			fw.close();					
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error!" + e);
		}
		

	}

}
