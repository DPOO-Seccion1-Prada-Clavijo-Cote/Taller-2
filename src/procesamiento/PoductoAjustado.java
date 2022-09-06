package procesamiento;

import java.util.ArrayList;

import modelo.Ingrediente;
import modelo.Producto;
import modelo.ProductoMenu;

public class PoductoAjustado implements Producto{
    //Atributos 

    private ProductoMenu base;
    private ArrayList<Ingrediente> agregarIngrediente;
    private ArrayList<Ingrediente> quitarIngrediente;


    //Constructor

    public PoductoAjustado(ProductoMenu base) {
        this.base = base;
    }
    
    //Métodos

    private void agregarIngredientes(Ingrediente Ingrediente) {
        agregarIngrediente.add(Ingrediente);
        
    }
    private void quitarIngredientes(Ingrediente Ingrediente) {
        quitarIngrediente.add(Ingrediente);
        
    }

    
}
