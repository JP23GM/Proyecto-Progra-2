package Presentacion;

import Entidades.Registro;
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

public class VendedorFrame extends javax.swing.JPanel {

    public VendedorFrame() {
        initComponents();
        this.RefrescarTabla();
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

    private TableModel MostrarListaCedula() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCedulaVendedor(txtCedulaVendedor.getText());
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

    private TableModel MostrarListaCodigo() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCodigoVendedor(txtCodigoVendedor.getText());
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

    private TableModel MostrarListaNombre() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerNombreVendedor(txtNombreVendedor.getText());
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

    private TableModel MostrarListaCedulaYCodigo() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCedulaYCodigoVendedor(txtCedulaVendedor.getText(), txtCodigoVendedor.getText());
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

    private TableModel MostrarListaCedulaYNombre() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCedulaYNombreVendedor(txtCedulaVendedor.getText(), txtNombreVendedor.getText());
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

    private TableModel MostrarListaCodigoYNombre() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCodigoYNombreVendedor(txtCodigoVendedor.getText(), txtNombreVendedor.getText());
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
    
    private TableModel MostrarListaCedulaYCodigoYNombre() {
        try {

            Logica logica = new Logica();
            List<Registro> lista = logica.ExtraerCedulaYCodigoYNombreVendedor(txtCedulaVendedor.getText(), txtCodigoVendedor.getText(), txtNombreVendedor.getText());
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

    private void ListaCedula() {
        TableModel tabla = this.MostrarListaCedula();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaCodigo() {
        TableModel tabla = this.MostrarListaCodigo();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaNombre() {
        TableModel tabla = this.MostrarListaNombre();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaCedulaYCodigo() {
        TableModel tabla = this.MostrarListaCedulaYCodigo();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaCedulaYNombre() {
        TableModel tabla = this.MostrarListaCedulaYNombre();
        tblListaArticulos.setModel(tabla);
    }

    private void ListaCodigoYNombre() {
        TableModel tabla = this.MostrarListaCodigoYNombre();
        tblListaArticulos.setModel(tabla);
    }
    
    private void ListaCedulaYCodigoYNombre() {
        TableModel tabla = this.MostrarListaCedulaYCodigoYNombre();
        tblListaArticulos.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new JPanelGray();
        jLabel12 = new javax.swing.JLabel();
        txtCedulaVendedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoVendedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombreVendedor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListaArticulos = new javax.swing.JTable();
        btnVistaCompleta = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel12.setText("Cédula");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel13.setText("Código");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel14.setText("Nombre");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel33.setText("Consultar Vendedores");

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel33)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnFiltrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVistaCompleta)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVistaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaCompletaActionPerformed
        this.RefrescarTabla();
    }//GEN-LAST:event_btnVistaCompletaActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (txtCedulaVendedor.getText().isEmpty() == false && txtCodigoVendedor.getText().isEmpty() && txtNombreVendedor.getText().isEmpty()) {
            this.ListaCedula();
        } else if (txtCodigoVendedor.getText().isEmpty() == false && txtCedulaVendedor.getText().isEmpty() && txtNombreVendedor.getText().isEmpty()) {
            this.ListaCodigo();
        } else if (txtNombreVendedor.getText().isEmpty() == false && txtCedulaVendedor.getText().isEmpty() && txtCodigoVendedor.getText().isEmpty()) {
            this.ListaNombre();
        } else if (txtCedulaVendedor.getText().isEmpty() == false && txtCodigoVendedor.getText().isEmpty() == false && txtNombreVendedor.getText().isEmpty()) {
            this.ListaCedulaYCodigo();
        } else if (txtCedulaVendedor.getText().isEmpty() == false && txtNombreVendedor.getText().isEmpty() == false && txtCodigoVendedor.getText().isEmpty()) {
            this.ListaCedulaYNombre();
        } else if (txtCodigoVendedor.getText().isEmpty() == false && txtNombreVendedor.getText().isEmpty() == false && txtCedulaVendedor.getText().isEmpty()) {
            this.ListaCodigoYNombre();
        } else if (txtCedulaVendedor.getText().isEmpty() == false && txtCodigoVendedor.getText().isEmpty() == false &&txtNombreVendedor.getText().isEmpty() == false){
            this.ListaCedulaYCodigoYNombre();
        }else if (txtCedulaVendedor.getText().isEmpty() && txtCodigoVendedor.getText().isEmpty() && txtNombreVendedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar mínimo un campo para filtrar búsqueda", "Datos faltantes", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnVistaCompleta;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblListaArticulos;
    private javax.swing.JTextField txtCedulaVendedor;
    private javax.swing.JTextField txtCodigoVendedor;
    private javax.swing.JTextField txtNombreVendedor;
    // End of variables declaration//GEN-END:variables
}
