package procesamiento;

import modelo.Producto;
import modelo.ProductoMenu;

public class PoductoAjustado implements Producto{
    //Atributos 

    private ProductoMenu base;


    //Constructor

    public PoductoAjustado(ProductoMenu base) {
        this.base = base;
    }


    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String generarTextoFactura() {
        // TODO Auto-generated method stub
        return null;
    }

}
