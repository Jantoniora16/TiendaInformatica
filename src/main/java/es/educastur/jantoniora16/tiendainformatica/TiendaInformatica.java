package es.educastur.jantoniora16.tiendainformatica;

import java.util.ArrayList;
import java.util.Collections;
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
    private static void altaClientes()
    {
        String continuar;
        
        do
        {
            System.out.println("= CREAR CLIENTES =");
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = sc.nextLine();
            
            if (clientes.containsKey(dni))
            {
                System.out.println("El cliente con DNI " + dni + " ya esta resgistrado.");
            }
            else
            {
                System.out.print("Ingrese el nombre del cliente: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el telefono del cliente: ");
                String telefono = sc.nextLine();
                System.out.print("Ingrese el email del cliente: ");
                String email = sc.nextLine();
                
                //Crear nuevo cliente y almacenarlo en Clientes
                clientes.put(dni, new Cliente(dni, nombre, telefono, email));
                System.out.println("¡Cliente registrado con exito!");
            }
            
            //Pregunta si desea dar de alta a otro cliente
            System.out.print("¿Desea registrar otro cliente? (s/n): ");
            continuar = sc.nextLine();
        }
        while (continuar.equalsIgnoreCase("s"));
    }
    
    private static void mostrarClientes()
    {
        if (clientes.isEmpty())
        {
            System.out.println("No hay clientes registrados.");
        }
        else
        {
            //Convertir los valores del HashMap a una lista
            ArrayList<Cliente> clientesOrdenados = new ArrayList<>(clientes.values());
            //Ordenar la lista usando la implementación de Comparable en Cliente
            Collections.sort(clientesOrdenados);
            
            System.out.println("= LISTA DE CLIENTES ORDENADOS POR NOMBRE =");
            for (Cliente cliente : clientesOrdenados)
            {
                System.out.println(cliente);
            }
        }
    }
    
    private static void modificarClientes()
    {
        String continuar;
        
        do
        {
            System.out.println("= MODIFICAR CLIENTES =");
            System.out.print("Ingrese el DNI del cliente a modificar: ");
            String dni = sc.nextLine();
            
            if (!clientes.containsKey(dni))
            {
                System.out.println("El cliente con DNI " + dni + " no esta resgistrado.");
            }
            else
            {
                Cliente cliente = clientes.get(dni);
                
                System.out.println("Datos actuales del cliente:");
                System.out.println(cliente);
                
                System.out.print("Ingrese el nuevo telefono del cliente (actual: " + cliente.getTelefono() + "): ");
                String nuevoTelefono = sc.nextLine();
                System.out.print("Ingrese el nuevo email del cliente (actual: " + cliente.getEmail() + "): ");
                String nuevoEmail = sc.nextLine();
                
                //Actualizar datos del cliente
                cliente.setTelefono(nuevoTelefono);
                cliente.setEmail(nuevoEmail);
                
                System.out.println("¡Cliente actualizado correctamente!");
            }
            
            //Pregunta si desea modificar a otro cliente
            System.out.print("¿Desea modificar otro cliente? (s/n): ");
            continuar = sc.nextLine();
        }
        while (continuar.equalsIgnoreCase("s"));
    }
    
    private static void eliminarClientes()
    {
        String continuar;
        
        do
        {
            System.out.println("= ELIMINAR CLIENTES =");
            System.out.print("Ingrese el DNI del cliente a eliminar: ");
            String dni = sc.nextLine();
            
            if (!clientes.containsKey(dni))
            {
                System.out.println("El cliente con DNI " + dni + " no esta resgistrado.");
            }
            else
            {
                clientes.remove(dni);
                System.out.println("¡Cliente eliminado correctamente!");
            }
            
            //Pregunta si desea eliminar a otro cliente
            System.out.print("¿Desea eliminar otro cliente? (s/n): ");
            continuar = sc.nextLine();
        }
        while (continuar.equalsIgnoreCase("s"));
    }
    //</editor-fold>
    //</editor-fold>
}
