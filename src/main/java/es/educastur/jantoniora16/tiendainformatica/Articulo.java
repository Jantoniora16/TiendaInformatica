package es.educastur.jantoniora16.tiendainformatica;

/**
 * @author Joseiro
 */

public class Articulo
{
    //Atributos
    private String idArticulo;
    private String descripcion;
    private int existencias;
    private double pvp;
    
    //Constructor
    public Articulo(String idArticulo, String descripcion, int existencias, double pvp)
    {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.pvp = pvp;
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

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getExistencias()
    {
        return existencias;
    }

    public void setExistencias(int existencias)
    {
        this.existencias = existencias;
    }

    public double getPvp()
    {
        return pvp;
    }

    public void setPvp(double pvp)
    {
        this.pvp = pvp;
    }
    
    //Método toString para mostrar la información del artículo
    @Override
    public String toString()
    {
        return "Articulo{" + "idArticulo=" + idArticulo + ", descripcion=" + descripcion + ", existencias=" + existencias + ", pvp=" + pvp + '}';
    }
}