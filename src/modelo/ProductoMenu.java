package modelo;

public class ProductoMenu {
    //Atributos

    private String nombre;
    private int precioBase;
    
    //Getters & Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    } 

    //Metodos

    public String generarTextoFactura() {
        String textoFactura = "";

        return textoFactura;
    }

    //Generator

    public ProductoMenu(String nombre, int precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

}
