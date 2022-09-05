package procesamiento;

import java.util.ArrayList;

import modelo.Producto;
import modelo.ProductoMenu;

public class Combo implements Producto{
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

    
}