package Entidades;

public class Vendedor extends Persona {

    private String codigoVendedor;

    public Vendedor() {
        this.codigoVendedor = "";
    }

    public Vendedor(String cedula, String nombre, String codigoVendedor) {
        super(cedula, nombre);
        this.codigoVendedor = codigoVendedor;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

}
