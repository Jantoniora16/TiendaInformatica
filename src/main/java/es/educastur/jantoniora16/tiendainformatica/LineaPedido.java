package es.educastur.jantoniora16.tiendainformatica;

/**
 * @author alu25d
 */

public class LineaPedido
{
    //Atributos
    private String idArticulo;
    private int Unidades;
    
    //Constructor
    public LineaPedido(String idArticulo, int Unidades)
    {
        this.idArticulo = idArticulo;
        this.Unidades = Unidades;
    }
    
    //Getters y Setters
    public String getIdArticulo()
    {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo)
    {
        this.idArticulo = idArticulo;
    }

    public int getUnidades()
    {
        return Unidades;
    }

    public void setUnidades(int Unidades)
    {
        this.Unidades = Unidades;
    }
    
    //Método toString para mostrar la información de la línea de pedido
    @Override
    public String toString()
    {
        return "LineaPedido{" + "idArticulo=" + idArticulo + ", Unidades=" + Unidades + '}';
    }
}