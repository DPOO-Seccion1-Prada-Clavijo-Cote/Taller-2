package modificaciones;

import java.util.ArrayList;

public class ComboModificaciones implements ProductoModificaciones, Cloneable{
    //Atributos 

    private double descuento;
    private String nombreCombo;
    private ArrayList<ProductoMenuModificaciones> itemsCombo;
    
    //Metodos

    public void agregarItemACombo(ProductoMenuModificaciones itemCombo) {
    
        itemsCombo.add(itemCombo);

    }
    
    //Constructor
    
    public ComboModificaciones(String nombreCombo, double descuento) {
        this.descuento = descuento;
        this.nombreCombo = nombreCombo;
        this.itemsCombo = new ArrayList<>();
    }

    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }

    
    @Override
    public int getPrecio() {

        int precioSuma = 0;

        for (ProductoMenuModificaciones productoMenu : itemsCombo) {

            precioSuma += productoMenu.getPrecio();

        }

        int precioActual = (int) (precioSuma * (1 - descuento));

        return precioActual;
    }

    @Override
    public String getNombre() {
        return nombreCombo;
    }

    @Override
    public String generarTextoFactura() {
        
        String textoFactura = "";
        
        for (ProductoMenuModificaciones productoMenu : itemsCombo) {
            textoFactura += productoMenu.generarTextoFactura();
        }

        return textoFactura;
    }  

}