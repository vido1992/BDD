/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;



import Inicio.ConexionSQL;
import Inicio.Login;
import javax.swing.JOptionPane;
//import Inicio.Base;
import Inicio.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import validaciones.Validar;

/**
 *
 * @author David
 */
public class Registro_Usuario extends javax.swing.JInternalFrame {
 ResultSet rs;
  /*  Validar validar = new Validar();
    Base base = new Base();
    ClienteJpaController Ccliente = new ClienteJpaController();
    public String CI, Nombre, Apellido, Direccion, Correo, TelefonoCelular, TelefonoConvencional;
    public ArrayList clienteArray = new ArrayList<String>();
*/
    public Registro_Usuario() {
        initComponents();

        this.setTitle("Registro Cliente");
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
        NombreClienteRegistro = new javax.swing.JTextField();
        ApellidosClienteRegistro = new javax.swing.JTextField();
        TelefonoClienteRegistro = new javax.swing.JTextField();
        CorreoElectronico = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JTextField();
        DireccionClienteRegistro = new javax.swing.JTextField();
        cbPrivilegios = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("REGISTRO USUARIO");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jBotonRegistrar.setText("Registrar");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(134, 134, 134)
                        .addComponent(ApellidosClienteRegistro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefonoClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DireccionClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(NombreClienteRegistro))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jBotonRegistrar)
                .addGap(165, 165, 165)
                .addComponent(jButtonRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ApellidosClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DireccionClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TelefonoClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrar)
                    .addComponent(jButtonRegresar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarActionPerformed
         String consulta="select IDUSUARIO,PASSWORDUSUARIO from USUARIO where IDUSUARIO=1;";
       rs=ConexionSQL.Consulta(consulta);
         try {
             while (rs.next()){
         System.out.println(consulta);
         System.out.println(rs.getString("PASSWORDUSUARIO"));
         System.out.println(rs.getString("IDUSUARIO"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         

        /*    int i = 0;
        //{}
        /* if(this.CCCRegistro.getText().equals("") || NombreClienteRegistro.getText().equals("") || this.ApellidosClienteRegistro.getText().equals("") ||
            this.DireccionClienteRegistro.getText().equals("") ||  this.CorreoElectronico.getText().equals("") || this.TelefonoClienteRegistro.equals("")
            || this.PlacaClienteRegistro.getText().equals("") ){
            JOptionPane.showMessageDialog(null,  "No se permite campos vacios","CAMPOS VACIO", JOptionPane.WARNING_MESSAGE);
        } */
        /* if (this.CCCRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CÉDULA DE IDENTIDAD VACIO", JOptionPane.WARNING_MESSAGE);
        }else  if (NombreClienteRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO NOMBRES VACIO", JOptionPane.WARNING_MESSAGE);
        }else  if (this.ApellidosClienteRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO APELLIDOS VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.DireccionClienteRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO DIRECCION VACIO", JOptionPane.WARNING_MESSAGE);
        }else  if (this.TelefonoClienteRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELEFONO CELULAR VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.telefonoConvencional.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELEFONO CONVENCIONAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.CorreoElectronico.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CORREO ELECTRÓNICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {

            if (validar.validarCI(this.CCCRegistro.getText().toString())) {
                //{}
                i++;
                this.CI = this.CCCRegistro.getText().toString();

            } else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la cédula de identidad?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CCCRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();

                }

            }
            if (validar.validarTex(this.NombreClienteRegistro.getText().toString())) {
                i++;
                this.Nombre = this.NombreClienteRegistro.getText().toString();
                //System.out.println(this.NombreClienteRegistro.getText().toString());

            }else{

                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los nombres del cliente ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.NombreClienteRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }

            if (validar.validarTex(this.ApellidosClienteRegistro.getText().toString())) {
                i++;
                this.Apellido = this.ApellidosClienteRegistro.getText().toString();
                //System.out.println(this.ApellidosClienteRegistro.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los apellidos del cliente ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.ApellidosClienteRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }

            if (validar.validarDireccion(this.DireccionClienteRegistro.getText().toString())) {
                i++;
                this.Direccion = this.DireccionClienteRegistro.getText().toString();
                // System.out.println("aqui "+this.DireccionClienteRegistro.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la dirección de domicilio del cliente ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.DireccionClienteRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }
            if (validar.validarCorreo(this.CorreoElectronico.getText().toString())) {
                i++;
                this.Correo = this.CorreoElectronico.getText().toString();
                //System.out.println(this.CorreoElectronico.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el Correo Electrónico ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CorreoElectronico.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }
            if (validar.validarTelefonoC(this.TelefonoClienteRegistro.getText())) {
                i++;
                this.TelefonoCelular = this.TelefonoClienteRegistro.getText();

            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el Teléfono celular ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.TelefonoClienteRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }
            if (validar.validarTelefonoConvencional(this.telefonoConvencional.getText())) {
                i++;

                this.TelefonoConvencional = this.telefonoConvencional.getText();
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el Teléfono convencional ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.telefonoConvencional.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Cliente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }

        }

        if (i == 7) {
            try {
                Cliente cl = new Cliente();

                cl.setCedula(this.CI);
                cl.setNombres(this.Nombre);
                cl.setApellidos(this.Apellido);
                cl.setDireciondomicilio(this.Direccion);
                cl.setTelefonocelular(this.TelefonoCelular);
                cl.setTelefonoconvencional(this.TelefonoConvencional);
                cl.setEmail(this.Correo);
                cl.setEstado("Activo");
                Ccliente.create(cl);
                JOptionPane.showMessageDialog(null, "Cliente Registrado");
            } catch (Exception ex) {
                Logger.getLogger(Registro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }*/
    }//GEN-LAST:event_jBotonRegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosClienteRegistro;
    private javax.swing.JTextField CorreoElectronico;
    private javax.swing.JTextField DireccionClienteRegistro;
    private javax.swing.JTextField NombreClienteRegistro;
    private javax.swing.JTextField TelefonoClienteRegistro;
    private javax.swing.JComboBox<String> cbPrivilegios;
    private javax.swing.JButton jBotonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
