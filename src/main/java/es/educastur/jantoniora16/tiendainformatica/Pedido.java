package es.educastur.jantoniora16.tiendainformatica;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author alu25d
 */

public class Pedido
{
    //Atributos
    private String idPedido;
    private Cliente clientePedido;
    private LocalDate fechaPedido;
    private ArrayList<LineaPedido> cestaCompra;
    
    //Constructor
    public Pedido(String idPedido, Cliente clientePedido, LocalDate fechaPedido, ArrayList<LineaPedido> cestaCompra)
    {
        this.idPedido = idPedido;
        this.clientePedido = clientePedido;
        this.fechaPedido = fechaPedido;
        this.cestaCompra = cestaCompra;
    }
    
    //Getters y Setters
    public String getIdPedido()
    {
        return idPedido;
    }

    public void setIdPedido(String idPedido)
    {
        this.idPedido = idPedido;
    }

    public Cliente getClientePedido()
    {
        return clientePedido;
    }

    public void setClientePedido(Cliente clientePedido)
    {
        this.clientePedido = clientePedido;
    }

    public LocalDate getFechaPedido()
    {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido)
    {
        this.fechaPedido = fechaPedido;
    }

    public ArrayList<LineaPedido> getCestaCompra()
    {
        return cestaCompra;
    }

    public void setCestaCompra(ArrayList<LineaPedido> cestaCompra)
    {
        this.cestaCompra = cestaCompra;
    }
    
    //Método toString para mostrar la información del pedido
    @Override
    public String toString()
    {
        return "Pedido{" + "idPedido=" + idPedido + ", clientePedido=" + clientePedido + ", fechaPedido=" + fechaPedido + ", cestaCompra=" + cestaCompra + '}';
    }
}