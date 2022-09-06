package modelo;

import modelo.Producto;
import procesamiento.Combo;
import procesamiento.PoductoAjustado;

import java.io.File;
import java.util.ArrayList;

public class Pedido {
    //Atributos

    private static int numeroPedidos = 0;
    private int idPedido;
    private String nombreCliente;
    private String direccionCliente;
    private ArrayList<Producto> itemsPedido;
    
    //Getters Setters

    public int getIdPedido() {
        return idPedido;
    }

    public String getProductosEnPedido() {

        String productosString = "";

        for (int i = 0; i < itemsPedido.size(); i++) {
            
            Producto itemActual = itemsPedido.get(i);

            String nombreItem = itemActual.getNombre();

            productosString = productosString + i + ") " + nombreItem + "\n";
        }

        return productosString;


    }

    public int getNumeroDeProductosPedido() {
        return itemsPedido.size();
    }

    //Metodos

    public void agregarProducto(Producto nuevoItem) {
        
        itemsPedido.add(nuevoItem);

    }

    private int getPrecioNetoPedido() {
        
    }

    private int getPrecioTotalPedido() {
        
    }

    private int getPrecioIVAPedido() {
        
    }

    private String generarTextoFactura() {
        
    }

    public void guardarFactura(File archivo) {
        
    }

    public void consultarPedido(int idPedidoPorConsultar) {

    }

    private int generarId(){

        int id = 0;

        return id;

    }

    public void eliminarProducto(int indiceProducto) {  
        itemsPedido.remove(indiceProducto);
    }

    //Constructor
    
    public Pedido(String nombreCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.idPedido = generarId();

        Pedido.numeroPedidos += 1;


    }

}
