package Logica;

import AccesoDatos.AccesoDatos;
import Entidades.Registro;
import java.util.List;
import javax.swing.JOptionPane;

public class Logica {

    public boolean Validar(Registro registro) {
        if (registro == null) {
            JOptionPane.showMessageDialog(null, "Se encontró un error en la lógica", "Error de lógica", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            AccesoDatos acceso = new AccesoDatos();
            return acceso.InsertarRegistro(registro);
        }
    }

    public boolean Numerico(String string) {// método para validar que el precio no sea un string, sino double
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public List<Registro> ListaVentas() {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ListaVentas();

    }

    public List<Registro> ExtraerArticuloMarca(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloMarca(especifico);
    }
    
    public List<Registro> ExtraerArticuloDescripcion(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloDescripcion(especifico);
    }
    
    public List<Registro> ExtraerArticuloPrecio(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloPrecio(especifico);
    }
    
    public List<Registro> ExtraerArticuloMarcaYDescripcion(String marca, String descripcion) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloMarcaYDescripcion(marca, descripcion);
    }
    
    public List<Registro> ExtraerArticuloMarcaYPrecio(String marca, Double precio) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloMarcaYPrecio(marca, precio);
    }
    
    public List<Registro> ExtraerArticuloDescripcionYPrecio(String especifico, Double precio) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloDescripcionYPrecio(especifico, precio);
    }
    
    public List<Registro> ExtraerArticuloMarcaYDescripcionYPrecio(String marca, String descripcion, Double precio) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerArticuloMarcaYDescripcionYPrecio(marca, descripcion, precio);
    }
    
    public List<Registro> ExtraerCedulaCliente(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCedula(especifico);
    }
    
    public List<Registro> ExtraerCodigoCliente(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCodigo(especifico);
    }
    
    public List<Registro> ExtraerNombreCliente(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteNombre(especifico);
    }
    
    public List<Registro> ExtraerCedulaYCodigoCliente(String cedula, String codigo) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCedulaYCodigo(cedula, codigo);
    }
    
    public List<Registro> ExtraerCedulaYNombreCliente(String cedula, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCedulaYNombre(cedula, nombre);
    }
    
    public List<Registro> ExtraerCodigoYNombreCliente(String codigo, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCodigoYNombre(codigo, nombre);
    }
    
    public List<Registro> ExtraerCedulaYCodigoYNombreCliente(String cedula, String codigo, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerClienteCedulaYCodigoYNombre(cedula, codigo, nombre);
    }
    
    public List<Registro> ExtraerCedulaVendedor(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCedula(especifico);
    }
    
    public List<Registro> ExtraerCodigoVendedor(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCodigo(especifico);
    }
    
    public List<Registro> ExtraerNombreVendedor(String especifico) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorNombre(especifico);
    }
    
    public List<Registro> ExtraerCedulaYCodigoVendedor(String cedula, String codigo) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCedulaYCodigo(cedula, codigo);
    }
    
    public List<Registro> ExtraerCedulaYNombreVendedor(String cedula, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCedulaYNombre(cedula, nombre);
    }
    
    public List<Registro> ExtraerCodigoYNombreVendedor(String codigo, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCodigoYNombre(codigo, nombre);
    }
    
    public List<Registro> ExtraerCedulaYCodigoYNombreVendedor(String cedula, String codigo, String nombre) {
        AccesoDatos acceso = new AccesoDatos();
        return acceso.ExtraerVendedorCedulaYCodigoYNombre(cedula, codigo, nombre);
    }

}
