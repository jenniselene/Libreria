package org.techquiero.model;
import java.util.ArrayList;

public class Carrito {
    public class ItemCarrito {
    	private int indice;
        private int cantidad;
        private Libro libro;
        
        public ItemCarrito(int cantidad, Libro libro) {
        	this.indice   = 0;
            this.cantidad = cantidad;
            this.libro    = libro;
        }
        
        public Libro GetLibro() {
        	return this.libro;
        }
        
        public void SetCantidad(int qt) {
        	this.cantidad = qt;
        }
        
        public int GetCantidad() {
        	return this.cantidad;
        }
        
        public void SetIndice(int i) {
        	this.indice = i;
        }
        
        public int GetIndice() {
        	return this.indice;
        }
        
        public String toString() {
        	String cadena = "";
        	Libro myLibro = GetLibro(); 
        	
        	cadena = cadena + "Idx: " + this.GetIndice() + " Qt: " + this.GetCantidad() + 
        			" Titulo: " + myLibro.getTitulo() + " Autor: " + myLibro.getAutor() +
        			" Precio: " + myLibro.getPrecio();
        	return cadena;
        }
    }
    
    ArrayList<ItemCarrito> items = new ArrayList<ItemCarrito>();
//  public Carrito() {
//      
//  }
    
    public int Agrega(ItemCarrito item) {
    	// Indice secuencial. El siguiente indice es el tamanio  de la lista + 1
    	item.indice = items.size();
        this.items.add(item);
        
        return item.indice;
    }
    
    public int AgregaUno(Libro libro) {
    	ItemCarrito item = new ItemCarrito(1, libro);
    	return this.Agrega(item);
  
    }
    
    //Metodo para cambiar cantidad de un elemento de la lista
    public void CambiaCantidad(int idx, int cantidad) {
    	ItemCarrito itemTmp = this.items.get(idx);
    	itemTmp.cantidad = cantidad;
    	this.items.set(idx, itemTmp);
    }
    
    //Metodo para calcular total de pedido
    public double TotalPedido() {
		double total = 0.0;
		for(ItemCarrito i: this.items) {
			total = total + i.GetCantidad()*i.GetLibro().getPrecio();
		}
		
		return total;
	}
    
    //Metodo para imprimir pedido
    public String ImprimePedido() {
    	String cadena="";
		cadena ="\n***************** Libreria TechQuiero ******************\n"+
				"===  PEDIDO  ===\n\n" +
				this.toString() +
				"\n\nTotal de Pedido: $ " + this.TotalPedido();
		
		return cadena;
    }
    
	@Override
	public String toString() {
		String cadena="";
		for(ItemCarrito i: items) {
			cadena = cadena + i.cantidad 
					+ " --> " + i.libro.getTitulo() +", de "+ i.libro.getAutor()
					+", $"+ i.libro.getPrecio()+" c/u, Total= $ " + i.cantidad*i.libro.getPrecio() +" \n";
		}
		
		return cadena;
	}
    
}