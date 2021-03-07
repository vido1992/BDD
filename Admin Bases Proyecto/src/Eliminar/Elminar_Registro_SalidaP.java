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
public class Elminar_Registro_SalidaP extends javax.swing.JInternalFrame {

   ResultSet rs;
 
    int seleccionar;
    public Elminar_Registro_SalidaP() {
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
        tablaEliminarRegiSalidaProd = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButtonRegresar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ELIMINAR REGISTRO SALIDA PRODUCTO");

        tablaEliminarRegiSalidaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DESCRIPCION", "PRECIO P", "CANTIDAD", "FECHA V"
            }
        ));
        tablaEliminarRegiSalidaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEliminarRegiSalidaProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEliminarRegiSalidaProd);

        jButton2.setText("MOSTRAR PRODUCTOS");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonRegresar2)))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonRegresar2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tablaEliminarRegiSalidaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEliminarRegiSalidaProdMouseClicked

        seleccionar=tablaEliminarRegiSalidaProd.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tablaEliminarRegiSalidaProdMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tablaEliminarRegiSalidaProd.getModel();
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

    public void limpiar(){
 DefaultTableModel modelo=(DefaultTableModel) tablaEliminarRegiSalidaProd.getModel();
        modelo.getDataVector().removeAllElements();
        
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEliminarRegiSalidaProd;
    // End of variables declaration//GEN-END:variables
}
