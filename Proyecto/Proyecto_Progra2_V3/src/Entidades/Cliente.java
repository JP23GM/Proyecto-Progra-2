package Entidades;

public class Cliente extends Persona{
    
    private String codigoCliente;
    
    public Cliente (){
        this.codigoCliente = "";
    }

    public Cliente(String cedula, String nombre, String codigoCliente) {
        super(cedula, nombre);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    
    
}
