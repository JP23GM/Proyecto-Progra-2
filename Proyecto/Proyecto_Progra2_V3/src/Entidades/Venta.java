package Entidades;

public class Venta {

    private Cliente cliente;
    private Vendedor vendedor;
    private Articulo articulo;

    public Venta() {
        this.cliente = new Cliente();
        this.vendedor = new Vendedor();
        this.articulo = new Articulo();
    }

    public Venta(Cliente cliente, Vendedor vendedor, Articulo articulo) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.articulo = articulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

}
