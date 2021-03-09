/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eliminar;

import Inicio.ConexionSQL;
import Inicio.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class Eliminar_Solicitud_Produccion extends javax.swing.JInternalFrame {

    ResultSet rs;
 
    int seleccionar;
    public Eliminar_Solicitud_Produccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEliminarSolicitudProducto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButtonRegresar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ELIMINAR PRODUCTO");

        tablaEliminarSolicitudProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DESCRIPCION", "PRECIO P", "CANTIDAD", "FECHA V"
            }
        ));
        tablaEliminarSolicitudProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEliminarSolicitudProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEliminarSolicitudProducto);

        jButton2.setText("MOSTRAR TODO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonRegresar2.setText("REGRESAR");
        jButtonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar2ActionPerformed(evt);
            }
        });

        jButton1.setText("ELIMINAR");

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonRegresar2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(29, 29, 29)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonRegresar2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEliminarSolicitudProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEliminarSolicitudProductoMouseClicked

        seleccionar=tablaEliminarSolicitudProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tablaEliminarSolicitudProductoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tablaEliminarSolicitudProducto.getModel();
        String consulta="SELECT NOMBREPRODUCTO,DESCRIPCIONPRODUCTO,PRECIOUPRODUCTO,CANTIDADPRODUCTO,FECHAVPRODUCTO FROM PRODUCTO;";
        rs=ConexionSQL.Consulta(consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("NOMBREPRODUCTO"));
                System.out.println(rs.getString("DESCRIPCIONPRODUCTO"));
                System.out.println(rs.getString("PRECIOUPRODUCTO"));
                System.out.println(rs.getString("CANTIDADPRODUCTO"));
                System.out.println(rs.getString("FECHAVPRODUCTO"));
                modelo.addRow(new Object[] {rs.getString("NOMBREPRODUCTO"),rs.getString("DESCRIPCIONPRODUCTO"),
                    rs.getString("PRECIOUPRODUCTO"),rs.getString("CANTIDADPRODUCTO"),rs.getString("FECHAVPRODUCTO")});

        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar2ActionPerformed
        limpiar();
        dispose();
    }//GEN-LAST:event_jButtonRegresar2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel modelo=(DefaultTableModel) tablaEliminarSolicitudProducto.getModel();
        String consulta="select u.LOGINUSUARIO,p.NOMBREPRODUCTO,s.CANTIDADPRODUCCION,s.FECHAPRODUCCION "
                    +"from SOLICITUDPRODUCCION as s join USUARIO as u on s.IDUSUARIO=u.IDUSUARIO "
                    +"join PRODUCTO as p on s.IDPRODUCTO=p.IDPRODUCTO where s.FECHAPRODUCCION="
                    +Buscar.getText()+";";
        rs=ConexionSQL.Consulta(consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("LOGINUSUARIO"));
                System.out.println(rs.getString("NOMBREPRODUCTO"));
                System.out.println(rs.getString("CANTIDADPRODUCCION"));
                System.out.println(rs.getString("FECHAPRODUCCION"));
                modelo.addRow(new Object[] {rs.getString("LOGINUSUARIO"),rs.getString("NOMBREPRODUCTO"),
                    rs.getString("CANTIDADPRODUCCION"),rs.getString("FECHAPRODUCCION")});

        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void limpiar(){
 DefaultTableModel modelo=(DefaultTableModel) tablaEliminarSolicitudProducto.getModel();
        modelo.getDataVector().removeAllElements();
        
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEliminarSolicitudProducto;
    // End of variables declaration//GEN-END:variables
}
