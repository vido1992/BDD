/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busquedas;

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
public class Buscar_Produ_deSolictudProduccion extends javax.swing.JInternalFrame {
   ResultSet rs;
  String NombreProducto="",IdProducto="";
    int seleccionar;
    public Buscar_Produ_deSolictudProduccion() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarPS = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonRegresar2 = new javax.swing.JButton();

        setClosable(true);

        tablaBuscarPS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPRODUCTO", "NOMBRE", "DESCRIPCION", "PRECIO P", "CANTIDAD", "FECHA V"
            }
        ));
        tablaBuscarPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBuscarPSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscarPS);

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR PRODUCTO DE SOLICITUD DE PRODUCCION");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jButton1)
                .addGap(91, 91, 91)
                .addComponent(jButtonRegresar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1)))
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRegresar2)
                        .addGap(8, 8, 8)))
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaBuscarPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscarPSMouseClicked

        seleccionar=tablaBuscarPS.rowAtPoint(evt.getPoint());

    }//GEN-LAST:event_tablaBuscarPSMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel modelo=(DefaultTableModel) Solicitudes.Solicitud_Produccion.tablaSolicitudProduccion.getModel();
       this.IdProducto=String.valueOf(tablaBuscarPS.getValueAt(seleccionar,0)); 
       this.NombreProducto=String.valueOf(tablaBuscarPS.getValueAt(seleccionar,1));
        System.out.println(IdProducto+" "+NombreProducto);
            modelo.addRow(new Object[] {this.IdProducto,this.NombreProducto});
           limpiar();
            dispose();
           

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tablaBuscarPS.getModel();
        String consulta="SELECT IDPRODUCTO, NOMBREPRODUCTO,DESCRIPCIONPRODUCTO,PRECIOUPRODUCTO,CANTIDADPRODUCTO,FECHAVPRODUCTO FROM PRODUCTO;";
        rs=ConexionSQL.Consulta(consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("IDPRODUCTO"));
                System.out.println(rs.getString("NOMBREPRODUCTO"));
                System.out.println(rs.getString("DESCRIPCIONPRODUCTO"));
                System.out.println(rs.getString("PRECIOUPRODUCTO"));
                System.out.println(rs.getString("CANTIDADPRODUCTO"));
                System.out.println(rs.getString("FECHAVPRODUCTO"));
                modelo.addRow(new Object[] {rs.getString("IDPRODUCTO"),rs.getString("NOMBREPRODUCTO"),rs.getString("DESCRIPCIONPRODUCTO"),
                    rs.getString("PRECIOUPRODUCTO"),rs.getString("CANTIDADPRODUCTO"),rs.getString("FECHAVPRODUCTO")});

        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresar2ActionPerformed

    public void limpiar(){
    DefaultTableModel modelo=(DefaultTableModel) tablaBuscarPS.getModel();
        modelo.getDataVector().removeAllElements();
        
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonRegresar1;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaBuscarPS;
    // End of variables declaration//GEN-END:variables
}
