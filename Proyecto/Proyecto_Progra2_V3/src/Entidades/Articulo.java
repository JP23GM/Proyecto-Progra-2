package Entidades;

public class Articulo {

    private String marca;
    private String descripcion;
    private Double precio;

    public Articulo() {
        this.marca = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    public Articulo(String marca, String descripcion, Double precio) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
