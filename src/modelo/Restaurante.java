package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;

import procesamiento.Combo;

public class Restaurante {
    //Atributos

    private HashMap<Integer, Pedido> pedidos; 
    private Pedido pedidoEnCurso;
    
    private HashMap<String, Ingrediente> ingredientes;
    private HashMap<String, ProductoMenu> menuBase;
    private HashMap<String, Combo> combos;

    private String menuTexto;
    private HashMap<Integer, String> mapaOpcionesMenu;
    

    //Metodos

    public void iniciarPedido(String nombreCliente, String direccionCliente) {
      
        pedidoEnCurso = new Pedido(nombreCliente, direccionCliente);

    }

    public void cerrarYGuardarPedidoEnCurso() {
        



    }

    public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) throws FileNotFoundException, IOException, NumberFormatException {
        int numeroMenu = 0;

        BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
		String linea = br.readLine();
		linea = br.readLine();

        //crear menú base
        menuTexto = menuTexto + "***Productos***\n";

        while (linea != null) {
            String[] partes = linea.split(";");
            String nombreProducto = partes[0];
            int precio = Integer.parseInt(partes[1]);
            
            ProductoMenu nuevoProducto = new ProductoMenu(nombreProducto, precio);

            menuBase.put(nombreProducto, nuevoProducto);

            menuTexto = menuTexto + numeroMenu +") " + nombreProducto + ": " + precio + "\n";
            mapaOpcionesMenu.put(numeroMenu, nombreProducto);

            numeroMenu++;
        }
        
        br.close();

        br = new BufferedReader(new FileReader(archivoIngredientes));
        linea = br.readLine();

        //Crear combos
        menuTexto = menuTexto + "\n***Combos***\n";

        while(linea != null) {
            String[] partes = linea.split(";");
            String nombreCombo = partes[0];
            double descuento = Double.parseDouble(partes[1].replace("%","")) / 100;

            Combo nuevoCombo = new Combo(nombreCombo, descuento);

            String contenidos = "";

            for (int i = 2; i < partes.length; i++) {
                String nombreProducto = partes[i];
                Producto productoAgregar = menuBase.get(nombreProducto);

                nuevoCombo.agregarItemACombo(productoAgregar);

                contenidos = contenidos + nombreProducto + "\n";
            }

            int precioCombo = nuevoCombo.getPrecio();

            menuTexto = menuTexto + numeroMenu +") " + nombreCombo + ": " + precioCombo + "\n" + contenidos + "\n";
            mapaOpcionesMenu.put(numeroMenu, nombreCombo);

            numeroMenu++;

        }

        br.close();

        br = new BufferedReader(new FileReader(archivoIngredientes));
        linea = br.readLine();

        //crear lista ingredientes
        menuTexto = menuTexto + "\n***Ingredientes Extra***\n";

        while (linea != null) {
            String[] partes = linea.split(";");
            String nombreIngrediente = partes[0];
            int precio = Integer.parseInt(partes[1]);
            
            Ingrediente nuevoIngrediente = new Ingrediente(nombreIngrediente, precio);

            ingredientes.put(nombreIngrediente, nuevoIngrediente);

            menuTexto = menuTexto + numeroMenu +") " + nombreIngrediente + ": " + precio + "\n";
            mapaOpcionesMenu.put(numeroMenu, nombreIngrediente);

        }

        br.close();
        

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