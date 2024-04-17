package Presentacion;

import Entidades.Registro;
import Logica.Estadistica;
import Logica.Logica;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ArticuloFrame extends javax.swing.JPanel {

    public ArticuloFrame() {
        initComponents();
        RefrescarTabla();

    }

    class JPanelGray extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(255, 255, 255);
            Color color2 = new Color(236, 233, 230);

            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    private TableModel CompletarTableModel() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ListaVentas();
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }

    private TableModel MostrarListaMarca() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloMarca(txtMarca.getText());
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }

    private TableModel MostrarListaDescripcion() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloDescripcion(txtDescripcion.getText());
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }

    private TableModel MostrarListaPrecio() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloPrecio(txtDescripcion.getText());
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }
    
    private TableModel MostrarListaMarcaYDescripcion() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloMarcaYDescripcion(txtMarca.getText(),txtDescripcion.getText());
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }
    
    private TableModel MostrarListaMarcaYPrecio() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloMarcaYPrecio(txtMarca.getText(),Double.parseDouble(txtPrecio.getText()));
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }
    
    private TableModel MostrarListaDescripcionYPrecio() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloDescripcionYPrecio(txtDescripcion.getText(), Double.parseDouble(txtPrecio.getText()));
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }
    
    private TableModel MostrarListaMarcaYDescripcionYPrecio() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerArticuloMarcaYDescripcionYPrecio(txtMarca.getText(),txtDescripcion.getText(), Double.parseDouble(txtPrecio.getText()));
            Object[] columnas = new Object[]{"CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"};
            Object[][] datos = new Object[lista.size()][columnas.length];

            for (int i = 0; i < lista.size(); i++) {
                datos[i][0] = lista.get(i).getVenta().getCliente().getCedula();
                datos[i][1] = lista.get(i).getVenta().getCliente().getCodigoCliente();
                datos[i][2] = lista.get(i).getVenta().getCliente().getNombre();
                datos[i][3] = lista.get(i).getVenta().getVendedor().getCedula();
                datos[i][4] = lista.get(i).getVenta().getVendedor().getCodigoVendedor();
                datos[i][5] = lista.get(i).getVenta().getVendedor().getNombre();
                datos[i][6] = lista.get(i).getVenta().getArticulo().getMarca();
                datos[i][7] = lista.get(i).getVenta().getArticulo().getDescripcion();
                datos[i][8] = lista.get(i).getVenta().getArticulo().getPrecio();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;
    }

    private void RefrescarTabla() {
        TableModel tabla = this.CompletarTableModel();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaMarca() {
        TableModel tabla = this.MostrarListaMarca();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaDescripcion() {
        TableModel tabla = this.MostrarListaDescripcion();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaPrecio() {
        TableModel tabla = this.MostrarListaPrecio();
        tblListaArticulos.setModel(tabla);
    }
    
    private void ListaMarcaYDescripcion() {
        TableModel tabla = this.MostrarListaMarcaYDescripcion();
        tblListaArticulos.setModel(tabla);
    }
    
    private void ListaMarcaYPrecio() {
        TableModel tabla = this.MostrarListaMarcaYPrecio();
        tblListaArticulos.setModel(tabla);
    }
    
    private void ListaDescripcionYPrecio() {
        TableModel tabla = this.MostrarListaDescripcionYPrecio();
        tblListaArticulos.setModel(tabla);
    }
    
    private void ListaMarcaYDescripcionYPrecio() {
        TableModel tabla = this.MostrarListaMarcaYDescripcionYPrecio();
        tblListaArticulos.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanelGray();
        jPanel4 = new JPanelGray();
        jLabel12 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListaArticulos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtSumaTotal = new javax.swing.JTextField();
        btnSumaTotal = new javax.swing.JButton();
        txtPromedio = new javax.swing.JTextField();
        btnPromedioVentas = new javax.swing.JButton();
        btnVistaCompleta = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel12.setText("Marca");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel13.setText("Descripción");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel14.setText("Precio");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel33.setText("Consultar Artículos");

        tblListaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CedulaCliente", "CodigoCliente", "NombreCliente", "CedulaVendedor", "CodigoVendedor", "NombreVendedor", "Marca", "Descripcion", "Precio"
            }
        ));
        jScrollPane3.setViewportView(tblListaArticulos);

        txtSumaTotal.setEditable(false);

        btnSumaTotal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnSumaTotal.setText("Suma Total");
        btnSumaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaTotalActionPerformed(evt);
            }
        });

        txtPromedio.setEditable(false);

        btnPromedioVentas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnPromedioVentas.setText("Promedio Ventas");
        btnPromedioVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioVentasActionPerformed(evt);
            }
        });

        btnVistaCompleta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnVistaCompleta.setText("Vista Completa");
        btnVistaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaCompletaActionPerformed(evt);
            }
        });

        btnFiltrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSumaTotal)
                .addGap(96, 96, 96)
                .addComponent(txtSumaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnVistaCompleta))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel33))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(btnFiltrar)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(381, Short.MAX_VALUE)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(357, 357, 357)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(btnPromedioVentas)
                    .addContainerGap(673, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel33)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnFiltrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVistaCompleta)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSumaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumaTotal))
                .addGap(106, 106, 106))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(552, Short.MAX_VALUE)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(156, 156, 156)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(551, Short.MAX_VALUE)
                    .addComponent(btnPromedioVentas)
                    .addGap(156, 156, 156)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromedioVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioVentasActionPerformed
        Estadistica estadistica = new Estadistica();
        Logica logica = new Logica();
        txtPromedio.setText(estadistica.PromedioVentas(logica.ListaVentas()).toString());
    }//GEN-LAST:event_btnPromedioVentasActionPerformed

    private void btnSumaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaTotalActionPerformed
        Estadistica estadistica = new Estadistica();
        Logica logica = new Logica();
        txtSumaTotal.setText(estadistica.SumaTotal(logica.ListaVentas()).toString());
    }//GEN-LAST:event_btnSumaTotalActionPerformed

    private void btnVistaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaCompletaActionPerformed
        this.RefrescarTabla();
    }//GEN-LAST:event_btnVistaCompletaActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (txtMarca.getText().isEmpty() == false && txtDescripcion.getText().isEmpty() && txtPrecio.getText().isEmpty()) {
            this.ListaMarca();
        } else if (txtDescripcion.getText().isEmpty() == false && txtMarca.getText().isEmpty() && txtPrecio.getText().isEmpty()) {
            this.ListaDescripcion();
        } else if (txtPrecio.getText().isEmpty() == false && txtMarca.getText().isEmpty() && txtDescripcion.getText().isEmpty()) {
            this.ListaPrecio();
        } else if (txtMarca.getText().isEmpty() == false && txtDescripcion.getText().isEmpty() == false && txtPrecio.getText().isEmpty()) {
            this.ListaMarcaYDescripcion();
        } else if (txtMarca.getText().isEmpty() == false && txtPrecio.getText().isEmpty() == false && txtDescripcion.getText().isEmpty()) {
            this.ListaMarcaYPrecio();
        } else if (txtDescripcion.getText().isEmpty() == false && txtPrecio.getText().isEmpty() == false && txtMarca.getText().isEmpty()) {
            this.ListaDescripcionYPrecio();
        }else if (txtMarca.getText().isEmpty() == false && txtDescripcion.getText().isEmpty() == false && txtPrecio.getText().isEmpty() == false){
            this.ListaMarcaYDescripcionYPrecio();
        }else if (txtMarca.getText().isEmpty() && txtDescripcion.getText().isEmpty() && txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar mínimo un campo para filtrar búsqueda", "Datos faltantes", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnPromedioVentas;
    private javax.swing.JButton btnSumaTotal;
    private javax.swing.JButton btnVistaCompleta;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblListaArticulos;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtSumaTotal;
    // End of variables declaration//GEN-END:variables
}
