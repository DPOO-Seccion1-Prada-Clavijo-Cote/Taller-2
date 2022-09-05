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

}
