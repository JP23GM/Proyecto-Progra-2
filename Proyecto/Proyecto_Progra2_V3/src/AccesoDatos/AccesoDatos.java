package AccesoDatos;

import Entidades.Articulo;
import Entidades.Cliente;
import Entidades.Registro;
import Entidades.Vendedor;
import Entidades.Venta;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class AccesoDatos {

    public boolean InsertarRegistro(Registro registro) {

        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into tbventas values(?,?,?,?,?,?,?,?,?,?)");

            sentencia.setString(1, "0");
            sentencia.setString(2, registro.getVenta().getCliente().getCedula());
            sentencia.setString(3, registro.getVenta().getCliente().getCodigoCliente());
            sentencia.setString(4, registro.getVenta().getCliente().getNombre());
            sentencia.setString(5, registro.getVenta().getVendedor().getCedula());
            sentencia.setString(6, registro.getVenta().getVendedor().getCodigoVendedor());
            sentencia.setString(7, registro.getVenta().getVendedor().getNombre());
            sentencia.setString(8, registro.getVenta().getArticulo().getMarca());
            sentencia.setString(9, registro.getVenta().getArticulo().getDescripcion());
            sentencia.setString(10, registro.getVenta().getArticulo().getPrecio().toString());

            sentencia.execute();
            cn.close();

            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public List<Registro> ListaVentas() {
        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas");
            ResultSet rs = sentencia.executeQuery();

            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;

            while (rs.next()) {
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
            }
            cn.close();
            return lista;

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloMarca(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Marca = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloDescripcion(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Descripcion = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloPrecio(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Precio <= ");
           sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloMarcaYDescripcion(String marca, String descripcion){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Marca = ? and Descripcion = ?");
            
            sentencia.setString(1,marca);
            sentencia.setString(2, descripcion);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloMarcaYPrecio(String marca, Double precio){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Marca = ? and Precio <= ?");
            sentencia.setString(1,marca);
            sentencia.setString(2, precio.toString());
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloDescripcionYPrecio(String descripcion, Double precio){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Descripcion = ? and Precio <= ?");
            sentencia.setString(1, descripcion);
            sentencia.setString(2, precio.toString());
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerArticuloMarcaYDescripcionYPrecio(String marca, String descripcion, Double precio){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where Marca = ? and Descripcion = ? and Precio <= ?");
            sentencia.setString(1,marca);
            sentencia.setString(2, descripcion);
            sentencia.setString(3, precio.toString());
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCedula(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaCliente = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCodigo(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CodigoCliente = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteNombre(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where NombreCliente = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCedulaYCodigo(String cedula, String codigo){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaCliente = ? and CodigoCliente = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, codigo);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCedulaYNombre(String cedula, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaCliente = ? and NombreCliente = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCodigoYNombre(String codigo, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CodigoCliente = ? and NombreCliente = ?");
            sentencia.setString(1, codigo);
            sentencia.setString(2, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerClienteCedulaYCodigoYNombre(String cedula, String codigo, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaCliente = ? and CodigoCliente = ? and NombreCliente = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, codigo);
            sentencia.setString(3, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCedula(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaVendedor = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCodigo(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CodigoVendedor = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorNombre(String especifico){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where NombreVendedor = ?");
            sentencia.setString(1, especifico);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCedulaYCodigo(String cedula, String codigo){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaVendedor = ? and CodigoVendedor = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, codigo);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCedulaYNombre(String cedula, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaVendedor = ? and NombreVendedor = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCodigoYNombre(String codigo, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CodigoVendedor = ? and NombreVendedor = ?");
            sentencia.setString(1, codigo);
            sentencia.setString(2, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Registro> ExtraerVendedorCedulaYCodigoYNombre(String cedula, String codigo, String nombre){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtienda", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbventas where CedulaVendedor = ? and CodigoVendedor = ? and NombreVendedor = ?");
            sentencia.setString(1, cedula);
            sentencia.setString(2, codigo);
            sentencia.setString(3, nombre);
            ResultSet rs = sentencia.executeQuery();
            
            List<Registro> lista = new ArrayList();
            Registro registro = new Registro();
            registro = null;
            
            while (rs.next()){
                
                Articulo articulo = new Articulo(rs.getString("Marca"),rs.getString("Descripcion"),Double.parseDouble(rs.getString("Precio")));
                Cliente cliente = new Cliente(rs.getString("CedulaCliente"),rs.getString("nombreCliente"),rs.getString("CodigoCliente"));
                Vendedor vendedor = new Vendedor(rs.getString("CedulaVendedor"),rs.getString("nombreVendedor"),rs.getString("CodigoVendedor"));
                Venta venta = new Venta(cliente,vendedor,articulo);
                registro = new Registro(venta);
                
                lista.add(registro);
          
            }
            cn.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
