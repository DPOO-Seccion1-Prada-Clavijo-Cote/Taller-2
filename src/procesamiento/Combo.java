package procesamiento;

import java.util.ArrayList;

import modelo.Producto;
import modelo.ProductoMenu;

public class Combo implements Producto, Cloneable{
    //Atributos 

    private double descuento;
    private String nombreCombo;
    private ArrayList<ProductoMenu> itemsCombo;
    
    //Metodos

    public void agregarItemACombo(Producto itemCombo) {
        
    }
    
    //Constructor
    
    public Combo(String nombreCombo, double descuento) {
        this.descuento = descuento;
        this.nombreCombo = nombreCombo;
    }

    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }

    
    @Override
    public int getPrecio() {
        
        int precioSuma = 0;

        for (ProductoMenu productoMenu : itemsCombo) {
            
            precioSuma += productoMenu.getPrecio();


        }

        int precioActual = (int) (precioSuma * (1-descuento));

        return precioActual;
    }

    @Override
    public String getNombre() {
        return nombreCombo;
    }

    @Override
    public String generarTextoFactura() {
        // TODO Auto-generated method stub
        return null;
    }  

}