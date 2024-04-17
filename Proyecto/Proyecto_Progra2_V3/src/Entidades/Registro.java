package Entidades;

public class Registro {

    private Venta venta;

    public Registro() {
        this.venta = new Venta();
    }

    public Registro(Venta venta) {
        this.venta = venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
