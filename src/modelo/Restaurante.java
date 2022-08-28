package modelo;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

import procesamiento.Combo;
import modelo.Pedido;
import modelo.ProductoMenu;
import modelo.Ingrediente;

public class Restaurante {
    //Atributos

    private  ArrayList<Combo> combos;
    private HashMap<Integer, Pedido> pedidos; 
    private Pedido pedidoEnCurso;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<ProductoMenu> menuBase;
    

    //Metodos

    public void iniciarPedido(String nombreCliente, String direccionCliente) {
      
        pedidoEnCurso = new Pedido(nombreCliente, direccionCliente);

    }

    public void cerrarYGuardarPedidoEnCurso() {
        



    }

    public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) {
        
    }

    private void CargarIngredientes(File archivoIngredientes) {
        
    }

    private void cargarMenu(File archivoMenu) {
        
    }
    
    private void cargarCombos(File archivoCombos) {
        
    }

    //Getters

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<ProductoMenu> getMenuBase() {
        return menuBase;
    }

    //Constructor

    public Restaurante() {
        this.combos = ;
        this.pedidos = ;
        this.pedidoEnCurso = ;
        this.ingredientes = ;
        this.menuBase = ;
    }

}