package org.techquiero.model;
import java.util.ArrayList;
public class Carrito {
    public class ItemCarrito {
        private int cantidad;
        private Libro libro;
        
        public ItemCarrito(int cantidad, Libro libro) {
            this.cantidad = cantidad;
            this.libro    = libro;
        }
    }
    
    ArrayList<ItemCarrito> items = new ArrayList<ItemCarrito>();
//  public Carrito() {
//      
//  }
    
    public void Agrega(ItemCarrito item) {
        this.items.add(item);
    }
}