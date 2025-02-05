package es.educastur.jantoniora16.tiendainformatica;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Joseiro
 */

public class TiendaInformatica
{
    private static HashMap<String, Cliente> clientes = new HashMap<>();
    private static HashMap<String, Articulo> articulos = new HashMap<>();
    private static HashMap<String, Pedido> pedidos = new HashMap<>();
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int opcion;
        do
        {
            System.out.println("\n===== TIENDA INFORMATICA =====");
            System.out.println("1 - GESTIONAR CLIENTES");
            System.out.println("2 - GESTIONAR ARTICULOS");
            System.out.println("3 - GESTIONAR PEDIDOS");
            System.out.println("9 - SALIR");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion)
            {
                case 1:
                    menuClientes();
                    break;
                    
                case 2:
                    menuArticulos();
                    break;
                
                case 3:
                    menuPedidos();
                    break;
                    
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
        while (opcion != 9);
    }
    
    //<editor-fold defaultstate="collapsed" desc="Menú para clientes">
    private static void menuClientes()
    {
        int opcion;
        do
        {
            System.out.println("\n=== GESTION DE CLIENTES ===");
            System.out.println("1 - ALTA CLIENTES");
            System.out.println("2 - MOSTRAR CLIENTES");
            System.out.println("3 - MODIFICAR CLIENTES");
            System.out.println("4 - ELIMINAR CLIENTES");
            System.out.println("9 - SALIR AL MENU PRINCIPAL");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion)
            {
                case 1:
                    altaClientes();
                    break;
                
                case 2:
                    mostrarClientes();
                    break;
                    
                case 3:
                    modificarClientes();
                    break;
                    
                case 4:
                    eliminarClientes();
                    break;
                    
                case 9:
                    System.out.println("Volviendo al menu principal...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
            }
        }
        while (opcion != 9);
    }
    
    //<editor-fold defaultstate="collapsed" desc="Métodos para gestion de clientes">
    private static void altaCliente()
    {
        
    }
    //</editor-fold>
    //</editor-fold>
}
