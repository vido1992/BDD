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
public class Eliminar_Registro_EntradaP extends javax.swing.JInternalFrame {

    ResultSet rs;
    String id="";
    int con=0;
    int seleccionar;
    public int datoLote=0;
  
    
    public Eliminar_Registro_EntradaP() {
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
        tablaEliminarRegistroEntradaP = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButtonRegresar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ELIMINAR REGISTRO ENTRADA PRODUCTO");

        tablaEliminarRegistroEntradaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LOGIN", "FECHA ", "OBSERVACIONES"
            }
        ));
        tablaEliminarRegistroEntradaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEliminarRegistroEntradaPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEliminarRegistroEntradaP);

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA REGISTRO 'YYYY-MM-DD'");

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(47, 47, 47)
                                .addComponent(jButton2)
                                .addGap(54, 54, 54)
                                .addComponent(jButtonRegresar2)
                                .addGap(43, 43, 43)
                                .addComponent(jButton4)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonRegresar2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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

    private void tablaEliminarRegistroEntradaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEliminarRegistroEntradaPMouseClicked

        seleccionar=tablaEliminarRegistroEntradaP.rowAtPoint(evt.getPoint());
        this.id=String.valueOf(tablaEliminarRegistroEntradaP.getValueAt(seleccionar,0));
        con=Integer.parseInt(this.id);
        System.out.println("se selecciono"+con);
        consultaIdLote();
        
        
    }//GEN-LAST:event_tablaEliminarRegistroEntradaPMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel modelo=(DefaultTableModel) tablaEliminarRegistroEntradaP.getModel();
        String consulta="select re.IDUSUARIO,u.LOGINUSUARIO, re.FECHAENTRADAP, re.OBSERVACIONESENTRADAP "
                + "from ENTRADAREGISTROPRODUCTO as re join USUARIO as u on re.IDUSUARIO=u.IDUSUARIO;";
                
        rs=ConexionSQL.Consulta(consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("IDUSUARIO"));
                System.out.println(rs.getString("LOGINUSUARIO"));
                System.out.println(rs.getString("FECHAENTRADAP"));
                System.out.println(rs.getString("OBSERVACIONESENTRADAP"));
                modelo.addRow(new Object[] {rs.getString("IDUSUARIO"),rs.getString("LOGINUSUARIO"),rs.getString("FECHAENTRADAP"),
                    rs.getString("OBSERVACIONESENTRADAP")});

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
        DefaultTableModel modelo=(DefaultTableModel) tablaEliminarRegistroEntradaP.getModel();
        String consulta="select re.IDUSUARIO,u.LOGINUSUARIO, re.FECHAENTRADAP, re.OBSERVACIONESENTRADAP "
                + "from ENTRADAREGISTROPRODUCTO as re join USUARIO as u on re.IDUSUARIO=u.IDUSUARIO"
                + " WHERE re.FECHAENTRADAP="+Buscar.getText()+";";
        rs=ConexionSQL.Consulta(consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("IDUSUARIO"));
                System.out.println(rs.getString("LOGINUSUARIO"));
                System.out.println(rs.getString("FECHAENTRADAP"));
                System.out.println(rs.getString("OBSERVACIONESENTRADAP"));
                modelo.addRow(new Object[] {rs.getString("IDUSUARIO"),rs.getString("LOGINUSUARIO"),rs.getString("FECHAENTRADAP"),
                    rs.getString("OBSERVACIONESENTRADAP")});

        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String consulta1=" DELETE from lote where idlote="+this.datoLote+";";
         int d1=ConexionSQL.EliminarDato(consulta1);  
         System.out.println("se elmino: "+d1);
           
        String consulta2="DELETE from ENTRADAREGISTROPRODUCTO WHERE idregistrosalida="+this.datoLote+";";
        int d2=ConexionSQL.EliminarDato(consulta2);
        System.out.println("se elmino: "+d2);

      
       
      
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiar();

    }//GEN-LAST:event_jButton4ActionPerformed

    public void limpiar(){
 DefaultTableModel modelo=(DefaultTableModel) tablaEliminarRegistroEntradaP.getModel();
        modelo.getDataVector().removeAllElements();
        tablaEliminarRegistroEntradaP.updateUI();
        
}
    
public void consultaIdLote(){
        String Idlote="";
        datoLote=0;
        String consulta="select l.IDLOTE from lote as l join ENTRADAREGISTROPRODUCTO as e on l.IDENTRADAP=e.IDENTRADAP where e.IDENTRADAP='"+con+"';"; 
        rs=ConexionSQL.Consulta(consulta);
        System.out.println("estamos en consultaidLote y la consutla es "+consulta);

        try {
            while (rs.next()){
                System.out.println(consulta);
                System.out.println(rs.getString("IDLOTE"));
                Idlote=rs.getString("IDLOTE");
                datoLote=Integer.parseInt(Idlote);
        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // return datoLote ;
    
    
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEliminarRegistroEntradaP;
    // End of variables declaration//GEN-END:variables
}
