package es.educastur.jantoniora16.tiendainformatica;

/**
 * @author Joseiro
 */

public class Cliente implements Comparable<Cliente>
{
    //Atributos
    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    
    //Constructor
    public Cliente(String dni, String nombre, String telefono, String email)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    //Getters y Setters
    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    // Implementación de Comparable para ordenar por nombre (ignorando mayúsculas/minúsculas)
    @Override
    public int compareTo(Cliente o)
    {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

    //Método toString para mostrar la información del cliente
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
}