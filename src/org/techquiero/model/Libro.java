package org.techquiero.model;

public class Libro {
	
	private String titulo;
	private String autor;
	private double precio;
	
	public Libro(String titulo, String autor, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "\n" + titulo + ", autor: " + autor + ", precio $" + precio + " ";
	}
	
	
	

}
