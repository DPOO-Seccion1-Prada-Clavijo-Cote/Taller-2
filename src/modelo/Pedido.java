package modelo;

import modelo.Producto;

import java.io.File;
import java.util.ArrayList;

public class Pedido {
    //Atributos

    private int numeroPedidos;
    private int idPedido;
    private String nombreCliente;
    private String direccionCliente;
    private ArrayList<Producto> itemsPedido;
    
    //Getters Setters

    public int getIdPedido() {
        return idPedido;
    }

    //Metodos

    public void agregarProducto(Producto nuvoItem) {
        
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

    //Constructor
    
    public Pedido(String nombreCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }

}
