/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar;

/**
 *
 * @author David
 */
public class Actualizar_Proveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Actualizar_Proveedor
     */
    public Actualizar_Proveedor() {
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
        nombreRegistroEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBotonRegistrar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        telefonocelularEmpleadoRegistro = new javax.swing.JTextField();
        DireccionClienteEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel3.setText("Nombres");

        jLabel5.setText("Dirección Domicilio");

        jLabel6.setText("Teléfono Celular");

        jBotonRegistrar.setText("Registrar");
        jBotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        telefonocelularEmpleadoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonocelularEmpleadoRegistroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ACTUALIZAR PROVEEDOR");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jBotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(telefonocelularEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(nombreRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addComponent(DireccionClienteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel3))))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DireccionClienteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefonocelularEmpleadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrar)
                    .addComponent(jButtonRegresar))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarActionPerformed
        /*    int i = 0;

        if (this.CIRegistroEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CI VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (nombreRegistroEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO NOMBRES VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.ApellidosEmpleadoRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO APELLIDOS VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.DireccionClienteEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO DIRECCION VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.telefonocelularEmpleadoRegistro.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CELULAR VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.telefonoConvencionaEmpleadoRegistro.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO TELÉFONO CONVENCIONAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.sueldoRegistroEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO SUELDO INICIAL VACÍO", JOptionPane.WARNING_MESSAGE);
        } else if (this.CorreoElectronicoRegistroEmpleado.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CORREO ELECTRÓNICO VACÍO", JOptionPane.WARNING_MESSAGE);
        } else {
            //System.out.println(this.CCCRegistro.getText().toString());
            if (validar.validarCI(this.CIRegistroEmpleado.getText().toString())) {
                i++;
                this.CC = this.CIRegistroEmpleado.getText().toString();
                //System.out.println("cc: "+this.CCCRegistro.getText().toString() );
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la cédula del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CIRegistroEmpleado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (validar.validarTex(this.nombreRegistroEmpleado.getText().toString())) {
                i++;
                this.Nombre = this.nombreRegistroEmpleado.getText().toString();
                //System.out.println(this.NombreClienteRegistro.getText().toString());

            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los nombres del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.nombreRegistroEmpleado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }

            if (validar.validarTex(this.ApellidosEmpleadoRegistro.getText().toString())) {
                i++;
                this.Apellido = this.ApellidosEmpleadoRegistro.getText().toString();
                //System.out.println(this.ApellidosClienteRegistro.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar los apellidos del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.ApellidosEmpleadoRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }

            if (validar.validarDireccion(this.DireccionClienteEmpleado.getText().toString())) {
                i++;
                this.Direccion = this.DireccionClienteEmpleado.getText().toString();
                // System.out.println("aqui "+this.DireccionClienteRegistro.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar la Dirección de Domicilio del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.DireccionClienteEmpleado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (validar.validarCorreo(this.CorreoElectronicoRegistroEmpleado.getText().toString())) {
                i++;
                this.Correo = this.CorreoElectronicoRegistroEmpleado.getText().toString();
                //System.out.println(this.CorreoElectronico.getText().toString());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el correo electrónico del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.CorreoElectronicoRegistroEmpleado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (validar.validarTelefonoC(this.telefonocelularEmpleadoRegistro.getText().toString())) {
                i++;
                this.TelefonoCelular = this.telefonocelularEmpleadoRegistro.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el teléfono celular del empleado ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.telefonocelularEmpleadoRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (validar.validarTelefonoConvencional(this.telefonoConvencionaEmpleadoRegistro.getText().toString())) {
                i++;
                this.telefonoConvencional = this.telefonoConvencionaEmpleadoRegistro.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar  el teléfono convencional del empleado ?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.telefonoConvencionaEmpleadoRegistro.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (validar.validarSueldo(this.sueldoRegistroEmpleado.getText().toString())) {
                i++;
                this.sueldo = this.sueldoRegistroEmpleado.getText();
                // System.out.println(this.TelefonoClienteRegistro.getText());
            }else {
                int dialogButton = JOptionPane.showConfirmDialog (null, "Desea volver a ingresar el sueldo inicial del empleado?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    this.sueldoRegistroEmpleado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "No se almacena Empleado", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    dispose();
                }

            }
            if (this.cbRolEmpleadoRegistro.getSelectedItem().toString() != "Selección") {
                i++;
                System.out.println("buen ingreso");
                // System.out.println(this.TelefonoClienteRegistro.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en Rol Empleado");
            }

            JOptionPane.showMessageDialog(null, "contador" + i);

            if (i == 9) {

                try {
                    Empleado emp = new Empleado();

                    emp.setCedula(CC);
                    emp.setNombres(Nombre);
                    emp.setApellidos(Apellido);
                    emp.setDireciondomicilio(Direccion);
                    emp.setTelefonocelular(TelefonoCelular);
                    emp.setTelefonoconvencional(telefonoConvencional);
                    emp.setRolempleado((String) cbRolEmpleadoRegistro.getSelectedItem());
                    emp.setSueldo(sueldo);
                    emp.setEmail(Correo);
                    emp.setEstado("Activo");
                    if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Vendedor")) {
                        emp.setContraseña("123");
                    } else if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Administrador")) {
                        emp.setContraseña("1234");
                    } else if (cbRolEmpleadoRegistro.getSelectedItem().toString().equals("Bodeguero")) {
                        emp.setContraseña("123");
                    }
                    Cemp.create(emp);
                    JOptionPane.showMessageDialog(null, "Empleado Registrado");
                } catch (Exception ex) {
                    Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }*/
    }//GEN-LAST:event_jBotonRegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void telefonocelularEmpleadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonocelularEmpleadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonocelularEmpleadoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DireccionClienteEmpleado;
    private javax.swing.JButton jBotonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreRegistroEmpleado;
    private javax.swing.JTextField telefonocelularEmpleadoRegistro;
    // End of variables declaration//GEN-END:variables
}
