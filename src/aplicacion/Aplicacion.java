package aplicacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import modelo.Restaurante;


public class Aplicacion {
    
    //Atributos

    private Restaurante restaurante;

    //Métodos

    public void ejecutarAplicacion() {
        
        System.out.println("Restaurante de alta clase");

        boolean continuar = true;

        while(continuar){
            try {
                mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
                ejecutarOpcion(opcion_seleccionada);
            }

            catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
        }

    }

    public void mostrarMenu() {
        System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar información del restaurante");
		System.out.println("2. Iniciar un nuevo pedido");
        System.out.println("3. cerrar pedido actual");
		System.out.println("4. Consultar un pedido");
		System.out.println("5. Salir de la aplicación\n");
    }

    public void ejecutarOpcion(int opcionSeleccionada) {
        
    }

    public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

    public void cargarInformacion() {
        System.out.println("\n" + "Cargar un archivo de atletas" + "\n");

        File archivoIngredientes = new File("./data/ingredientes.txt");
        File archivoMenu = new File("./data/menu.txt");
        File archivoCombos = new File("./data/combos.txt");
        
        restaurante.cargarInformacionRestaurante(archivoIngredientes, archivoMenu, archivoCombos);
    }

    public void iniciarPedido() {
        System.out.println("\n" + "Iniciar Pedido" + "\n");

        String nombreCliente = input("Indique su nombre: ");
        String direccionCliente = input("Indique su dirección: ");

        restaurante.iniciarPedido(nombreCliente, direccionCliente);
    }

    public void cerrarPedido() {
        
        restaurante.cerrarYGuardarPedidoEnCurso();

    }

    public static void main(String[] args) {

        Aplicacion app = new Aplicacion();

        app.ejecutarAplicacion();
    
    }

}