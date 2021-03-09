/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;


import Actualizar.Actualizar_Proveedor;
import Actualizar.Actualizar_Usuario;
import Consultas.ConsultaUsuario;
import Consultas.Consulta_Producto;
import Consultas.Consulta_Proveedor;
import Eliminar.Eliminar_Producto;
import Eliminar.Eliminar_Proveedor;
import Eliminar.Eliminar_Registro_EntradaP;
import Eliminar.Eliminar_Solicitud_Produccion;
import Eliminar.Eliminar_Solicitud_Proveedor;
import Eliminar.Eliminar_Usuario;
import Eliminar.Elminar_Registro_SalidaP;
import Registros.Registro_Salida;
import Solicitudes.Solicitud_Produccion;
import Registros.RegistroProveedores;
import Solicitudes.Proveedor_Solicitud;
import Producto.Producto;
import Registros.Registro_Entrada;
import Registros.Registro_Usuario;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    Registro_Usuario RC1 = new Registro_Usuario();
    Producto P=new Producto();
    Proveedor_Solicitud PROSO=new Proveedor_Solicitud();
    Solicitud_Produccion SP=new Solicitud_Produccion();
    Registro_Salida RSA=new Registro_Salida();
    RegistroProveedores RE = new RegistroProveedores();
    Registro_Entrada RGE=new Registro_Entrada();
    Actualizar_Proveedor AP= new Actualizar_Proveedor();
    Actualizar_Usuario AU = new Actualizar_Usuario();
    ConsultaUsuario CU=new ConsultaUsuario();
    Consulta_Producto CP=new Consulta_Producto();
    Consulta_Proveedor CPE=new Consulta_Proveedor();
   //ELIMINACION
    Eliminar_Producto EP=new Eliminar_Producto();
    Eliminar_Proveedor EPR=new Eliminar_Proveedor();
    Eliminar_Registro_EntradaP ERET=new Eliminar_Registro_EntradaP();
    Eliminar_Solicitud_Produccion ESP=new Eliminar_Solicitud_Produccion();
    Eliminar_Solicitud_Proveedor ESPE=new Eliminar_Solicitud_Proveedor();
    Eliminar_Usuario EUS=new Eliminar_Usuario();
    Elminar_Registro_SalidaP ERSP=new Elminar_Registro_SalidaP();
            
    
            
       
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        escritorio = new javax.swing.JDesktopPane();
        lbusuario = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        ModuloCliente = new javax.swing.JMenu();
        ClienteRegistrar = new javax.swing.JMenuItem();
        ClienteActualizar = new javax.swing.JMenuItem();
        ClienteConsultar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ModuloEmpleado = new javax.swing.JMenu();
        EmpleadoRegistrar = new javax.swing.JMenuItem();
        EmpleadoActualizar = new javax.swing.JMenuItem();
        EmpleadoConsultar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ModuloProducto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ProductoConsultar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ModuloVentas = new javax.swing.JMenu();
        VentaFactura = new javax.swing.JMenuItem();
        VentaConsultar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(0, 102, 153));
        escritorio.setForeground(new java.awt.Color(0, 102, 0));

        lbusuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbusuario.setForeground(new java.awt.Color(51, 255, 255));
        lbusuario.setText("USUARIO");

        escritorio.setLayer(lbusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 775, Short.MAX_VALUE))
        );

        ModuloCliente.setText("Usuario");
        ModuloCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ClienteRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteRegistrar.setText("Registrar");
        ClienteRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteRegistrarActionPerformed(evt);
            }
        });
        ModuloCliente.add(ClienteRegistrar);

        ClienteActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteActualizar.setText("Actualizar");
        ClienteActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActualizarActionPerformed(evt);
            }
        });
        ModuloCliente.add(ClienteActualizar);

        ClienteConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteConsultar.setText("Consultar");
        ClienteConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteConsultarActionPerformed(evt);
            }
        });
        ModuloCliente.add(ClienteConsultar);
        ModuloCliente.add(jSeparator1);

        jMenuBar2.add(ModuloCliente);

        ModuloEmpleado.setText("Proveedor");
        ModuloEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        EmpleadoRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoRegistrar.setText("Registrar");
        EmpleadoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoRegistrarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoRegistrar);

        EmpleadoActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoActualizar.setText("Actualizar");
        EmpleadoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActualizarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoActualizar);

        EmpleadoConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoConsultar.setText("Consultar");
        EmpleadoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoConsultarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoConsultar);
        ModuloEmpleado.add(jSeparator5);

        jMenuBar2.add(ModuloEmpleado);

        ModuloProducto.setText("Producto");
        ModuloProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ModuloProducto.add(jMenuItem1);

        ProductoConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProductoConsultar.setText("Consultar");
        ProductoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoConsultarActionPerformed(evt);
            }
        });
        ModuloProducto.add(ProductoConsultar);

        jMenuBar2.add(ModuloProducto);

        jMenu5.setText("Solicitudes");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Producción");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("Proveedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar2.add(jMenu5);

        ModuloVentas.setText("Registro");
        ModuloVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        VentaFactura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VentaFactura.setText("Salida Producto");
        VentaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaFacturaActionPerformed(evt);
            }
        });
        ModuloVentas.add(VentaFactura);

        VentaConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VentaConsultar.setText("Entrada Producto");
        VentaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaConsultarActionPerformed(evt);
            }
        });
        ModuloVentas.add(VentaConsultar);
        ModuloVentas.add(jSeparator2);

        jMenuBar2.add(ModuloVentas);

        jMenu6.setText("Eliminar");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setText("Eliminar Solicitud Proveedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem6.setText("Eliminar Registro Salida Producto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem7.setText("Eliminar Registro Entrada Producto");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClienteActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActualizarActionPerformed
       escritorio.add(AU);
        AU.show();
        try {
            AU.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ClienteActualizarActionPerformed

    private void ClienteConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteConsultarActionPerformed
       escritorio.add(CU);
        CU.show();
        try {
            CU.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ClienteConsultarActionPerformed

    private void EmpleadoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoRegistrarActionPerformed

        escritorio.add(RE);
        RE.show();
        try {
            RE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_EmpleadoRegistrarActionPerformed

    private void EmpleadoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoConsultarActionPerformed
         escritorio.add(CPE);
        CPE.show();
        try {
            CPE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EmpleadoConsultarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if (JOptionPane.showConfirmDialog(null, "¿Está seguro?") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void EmpleadoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActualizarActionPerformed
        escritorio.add(AP);
        AP.show();
        try {
            AP.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EmpleadoActualizarActionPerformed

    private void ClienteRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteRegistrarActionPerformed
        // TODO add your handling code here:
       escritorio.add(RC1);
        RC1.show();
        try {
            RC1.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ClienteRegistrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.add(P);
        P.show();
        try {
            P.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ProductoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoConsultarActionPerformed
        escritorio.add(CP);
        CP.show();
        try {
            CP.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProductoConsultarActionPerformed

    private void VentaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaConsultarActionPerformed
        
        escritorio.add(RGE);
        RGE.show();
        Registros.Registro_Entrada.txtUsuarioRegistroEntradaProducto.setText(lbusuario.getText());
        try {
            RGE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VentaConsultarActionPerformed

    private void VentaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaFacturaActionPerformed
        
        escritorio.add(RSA);
        RSA.show();
        Registros.Registro_Salida.txtUsuarioRegsitroSalida.setText(lbusuario.getText());
        try {
            RSA.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VentaFacturaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.add(PROSO);
        PROSO.show();
        try {
            PROSO.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          escritorio.add(SP);
        SP.show();
        Solicitudes.Solicitud_Produccion.txtUsuarioSolicitudProduccion.setText(lbusuario.getText());
        try {
            SP.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.add(ESPE);
        ESPE.show();
        Solicitudes.Solicitud_Produccion.txtUsuarioSolicitudProduccion.setText(lbusuario.getText());
        try {
            ESPE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        escritorio.add(ERSP);
        ERSP.show();
        Solicitudes.Solicitud_Produccion.txtUsuarioSolicitudProduccion.setText(lbusuario.getText());
        try {
            ERSP.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        escritorio.add(ERET);
        ERET.show();
        Solicitudes.Solicitud_Produccion.txtUsuarioSolicitudProduccion.setText(lbusuario.getText());
        try {
            ERET.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClienteActualizar;
    private javax.swing.JMenuItem ClienteConsultar;
    private javax.swing.JMenuItem ClienteRegistrar;
    private javax.swing.JMenuItem EmpleadoActualizar;
    private javax.swing.JMenuItem EmpleadoConsultar;
    private javax.swing.JMenuItem EmpleadoRegistrar;
    private javax.swing.JMenu ModuloCliente;
    private javax.swing.JMenu ModuloEmpleado;
    private javax.swing.JMenu ModuloProducto;
    private javax.swing.JMenu ModuloVentas;
    private javax.swing.JMenuItem ProductoConsultar;
    private javax.swing.JMenuItem VentaConsultar;
    private javax.swing.JMenuItem VentaFactura;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    public static javax.swing.JLabel lbusuario;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
