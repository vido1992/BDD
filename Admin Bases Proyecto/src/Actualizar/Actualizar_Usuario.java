/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar;

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
public class Actualizar_Usuario extends javax.swing.JInternalFrame {

     ResultSet rs;
     int seleccionar;
     int IDP=0,IDU=0;
    public Actualizar_Usuario() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jBotonRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuarioAc = new javax.swing.JTextField();
        txtApellidoUsuarioAc = new javax.swing.JTextField();
        txtTelefonoUsuarioAc = new javax.swing.JTextField();
        txtPasswordUsuarioAc = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JTextField();
        txtDireccionUsuarioAc = new javax.swing.JTextField();
        cbPrivilegios = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActualizarUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ACTUALIZAR USUARIO");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jBotonRegistrar.setText("Actualizar");
        jBotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarActionPerformed(evt);
            }
        });

        jLabel9.setText("Password de Usuario");

        jLabel8.setText("Nombre de Usuario ");

        jLabel6.setText("Teléfono Celular");

        jLabel5.setText("Dirección de Domicilio");

        jLabel4.setText("Apellidos");

        jLabel3.setText("Nombres");

        jLabel2.setText("Privilegios Usuario");

        cbPrivilegios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMINISTRADOR", "BODEGUERO", "PROVEEDOR" }));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaActualizarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO", "PASSWORD", "PRIVILEGIOS", "IDU", "IDP"
            }
        ));
        tablaActualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActualizarUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaActualizarUsuario);

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jBotonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 165, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonRegresar)
                                .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(140, 140, 140)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonoUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPasswordUsuarioAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrar)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButton2))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
limpiar();
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jBotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarActionPerformed
        rs=ConexionSQL.Consulta("update PERSONA set NOMBREPERSONA='"+txtNombreUsuarioAc.getText()
             +"', APELLIDOPERSONA='"+txtApellidoUsuarioAc.getText()
              +"', DIRECIONPERSONA='"+txtDireccionUsuarioAc.getText()
              +"', TELEFONOPERSONA=" +Integer.parseInt(txtTelefonoUsuarioAc.getText())
              +" where IDPERSONA="+IDP);
      rs=ConexionSQL.Consulta("update USUARIO set LOGINUSUARIO='"+nombreUsuario.getText()
              + "', PASSWORDUSUARIO='"+txtPasswordUsuarioAc.getText()
              + "', PRIVILEGIOSUSUARIO='"+privilegios1(cbPrivilegios.getActionCommand())
              + " where IDUSUARIO="+IDU);
        
    }//GEN-LAST:event_jBotonRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
       DefaultTableModel modelo=(DefaultTableModel) tablaActualizarUsuario.getModel();
       String consulta="select u.IDUSUARIO,p.IDPERSONA,p.NOMBREPERSONA,p.APELLIDOPERSONA," +
                "p.DIRECIONPERSONA,p.TELEFONOPERSONA,u.LOGINUSUARIO,u.PASSWORDUSUARIO,u.PRIVILEGIOSUSUARIO"+
                " from USUARIO as u join PERSONA as p on u.IDPERSONA=p.IDPERSONA where u.LOGINUSUARIO='" + nombreUsuario.getText()+"';";
       
         rs=ConexionSQL.Consulta(consulta);
        
         try {
         while (rs.next()){
         System.out.println(consulta);
         System.out.println(rs.getString("NOMBREPERSONA"));
         System.out.println(rs.getString("APELLIDOPERSONA"));
         System.out.println(rs.getString("DIRECIONPERSONA"));
         System.out.println(rs.getString("TELEFONOPERSONA"));
         System.out.println(rs.getString("LOGINUSUARIO"));
         System.out.println(rs.getString("PASSWORDUSUARIO"));
         System.out.println(rs.getString("PRIVILEGIOSUSUARIO"));
         System.out.println(rs.getString("IDUSUARIO"));
         System.out.println(rs.getString("IDPERSONA"));
         
         modelo.addRow(new Object[] {rs.getString("NOMBREPERSONA"),rs.getString("APELLIDOPERSONA"),rs.getString("DIRECIONPERSONA"),
         rs.getString("TELEFONOPERSONA"),rs.getString("PASSWORDUSUARIO"),
         rs.getString("PRIVILEGIOSUSUARIO"),rs.getString("IDUSUARIO"),rs.getString("IDPERSONA")});

             }
         } catch (SQLException ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaActualizarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActualizarUsuarioMouseClicked
        seleccionar=tablaActualizarUsuario.rowAtPoint(evt.getPoint());
          this.txtNombreUsuarioAc.setText(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,0)));
           this.txtApellidoUsuarioAc.setText(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,1)));
            this.txtDireccionUsuarioAc.setText(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,2)));
             this.txtTelefonoUsuarioAc.setText(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,3)));
            this.txtPasswordUsuarioAc.setText(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,4)));
            this.cbPrivilegios.setSelectedItem(privilegiosInverso(String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,5))));
             String id1=String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,6)); 
                  String id2=String.valueOf(tablaActualizarUsuario.getValueAt(seleccionar,7));
                  IDP=Integer.parseInt(id2);
                  IDU=Integer.parseInt(id2);
        System.out.println("tabla seleccion"+id1);
        System.out.println("tabla seleccion"+id2);
        
    }//GEN-LAST:event_tablaActualizarUsuarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

private char privilegios1(String permiso){
        if(permiso.equals("ADMINISTRADOR")){
            return 'A';
        }else if(permiso.equals("BODEGUERO")){
            return 'B';
        }else if(permiso.equals("PROVEEDOR")){
            return 'P';
        }else{
            return 'I';
        }
}
private String privilegiosInverso(String permiso){
        if(permiso.equals("A")){
            return "ADMINISTRADOR";
        }else if(permiso.equals("B")){
            return "BODEGUERO";
        }else if(permiso.equals("P")){
            return "PROVEEDOR";
        }else{
            return "INCONCLUSO";
        }
}


   public void limpiar(){
       tablaActualizarUsuario.updateUI();
       DefaultTableModel modelo=(DefaultTableModel) tablaActualizarUsuario.getModel();
        modelo.getDataVector().removeAllElements();
        txtApellidoUsuarioAc.setText("");
        txtDireccionUsuarioAc.setText("");
        txtNombreUsuarioAc.setText("");
        txtPasswordUsuarioAc.setText("");
        txtTelefonoUsuarioAc.setText("");
        nombreUsuario.setText("");
        cbPrivilegios.setSelectedItem("SELECCIONAR");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPrivilegios;
    private javax.swing.JButton jBotonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTable tablaActualizarUsuario;
    private javax.swing.JTextField txtApellidoUsuarioAc;
    private javax.swing.JTextField txtDireccionUsuarioAc;
    private javax.swing.JTextField txtNombreUsuarioAc;
    private javax.swing.JTextField txtPasswordUsuarioAc;
    private javax.swing.JTextField txtTelefonoUsuarioAc;
    // End of variables declaration//GEN-END:variables
}
