/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;


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
    
    
    
    public Menu() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT");
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jMenuBar2 = new javax.swing.JMenuBar();
        ModuloCliente = new javax.swing.JMenu();
        ClienteRegistrar = new javax.swing.JMenuItem();
        ClienteActualizar = new javax.swing.JMenuItem();
        ClienteConsultar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ClienteEliminar = new javax.swing.JMenuItem();
        ModuloEmpleado = new javax.swing.JMenu();
        EmpleadoRegistrar = new javax.swing.JMenuItem();
        EmpleadoConsultar = new javax.swing.JMenuItem();
        EmpleadoActualizar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        EmpleadoEliminar = new javax.swing.JMenuItem();
        ModuloProducto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ProductoEliminar = new javax.swing.JMenuItem();
        ProductoConsultar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ModuloVentas = new javax.swing.JMenu();
        VentaFactura = new javax.swing.JMenuItem();
        VentaConsultar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ModuloInventario = new javax.swing.JMenu();
        InvantarioConsultar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        InvantarioActualizar = new javax.swing.JMenuItem();
        InvantarioReporte = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();

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

        escritorio.setBackground(new java.awt.Color(51, 153, 0));
        escritorio.setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
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

        ClienteEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteEliminar.setText("Eliminar");
        ClienteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteEliminarActionPerformed(evt);
            }
        });
        ModuloCliente.add(ClienteEliminar);

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

        EmpleadoConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoConsultar.setText("Consultar");
        EmpleadoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoConsultarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoConsultar);

        EmpleadoActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoActualizar.setText("Actualizar");
        EmpleadoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActualizarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoActualizar);
        ModuloEmpleado.add(jSeparator5);

        EmpleadoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpleadoEliminar.setText("Eliminar");
        EmpleadoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoEliminarActionPerformed(evt);
            }
        });
        ModuloEmpleado.add(EmpleadoEliminar);

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

        ProductoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProductoEliminar.setText("Eliminar");
        ProductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoEliminarActionPerformed(evt);
            }
        });
        ModuloProducto.add(ProductoEliminar);

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
        jMenuItem2.setText("Producion");
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

        ModuloInventario.setText("Inventario");
        ModuloInventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        InvantarioConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InvantarioConsultar.setText("Consultar Stock");
        InvantarioConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvantarioConsultarActionPerformed(evt);
            }
        });
        ModuloInventario.add(InvantarioConsultar);
        ModuloInventario.add(jSeparator4);

        InvantarioActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InvantarioActualizar.setText("Actualizar Stock");
        InvantarioActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvantarioActualizarActionPerformed(evt);
            }
        });
        ModuloInventario.add(InvantarioActualizar);

        InvantarioReporte.setText("Reporte Producto");
        InvantarioReporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem23.setText("Reporte por Alta");
        InvantarioReporte.add(jMenuItem23);

        jMenuItem24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem24.setText("Reporte por Baja");
        InvantarioReporte.add(jMenuItem24);

        jMenuItem26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem26.setText("Reporte por Alto Stock");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        InvantarioReporte.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem27.setText("Reporte por Bajo Stock");
        InvantarioReporte.add(jMenuItem27);

        ModuloInventario.add(InvantarioReporte);

        jMenuBar2.add(ModuloInventario);

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
       /* escritorio.add(AC);
        AC.show();
        try {
            AC.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_ClienteActualizarActionPerformed

    private void ClienteConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteConsultarActionPerformed
       /* escritorio.add(CC);
        CC.show();
        try {
            CC.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

*/
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

      /*  escritorio.add(CE);
        CE.show();
        try {
            CE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }//GEN-LAST:event_EmpleadoConsultarActionPerformed

    private void InvantarioConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvantarioConsultarActionPerformed

       /* escritorio.add(SC);
        SC.show();
        try {
            SC.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
*/

    }//GEN-LAST:event_InvantarioConsultarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if (JOptionPane.showConfirmDialog(null, "¿Está seguro?") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void EmpleadoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActualizarActionPerformed

       /* escritorio.add(AE);
        AE.show();
        try {
            AE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/

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

    private void InvantarioActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvantarioActualizarActionPerformed
       /* escritorio.add(SA);
        SA.show();
        try {
            SA.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
*/

    }//GEN-LAST:event_InvantarioActualizarActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void ClienteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteEliminarActionPerformed

      /*  escritorio.add(EC);
        EC.show();
        try {
            EC.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_ClienteEliminarActionPerformed

    private void EmpleadoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoEliminarActionPerformed
     /*   escritorio.add(EE);
        EE.show();
        try {
            EE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_EmpleadoEliminarActionPerformed

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
        /* // TODO add your handling code here:
        escritorio.add(PC);
        PC.show();
        try {
            PC.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_ProductoConsultarActionPerformed

    private void ProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoEliminarActionPerformed
        // TODO add your handling code here:
        /*  escritorio.add(PE);
        PE.show();
        try {
            PE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_ProductoEliminarActionPerformed

    private void VentaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaConsultarActionPerformed
        
        escritorio.add(RGE);
        RGE.show();
        try {
            RGE.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VentaConsultarActionPerformed

    private void VentaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaFacturaActionPerformed
        
        escritorio.add(RSA);
        RSA.show();
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
        try {
            SP.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenuItem ClienteEliminar;
    private javax.swing.JMenuItem ClienteRegistrar;
    private javax.swing.JMenuItem EmpleadoActualizar;
    private javax.swing.JMenuItem EmpleadoConsultar;
    private javax.swing.JMenuItem EmpleadoEliminar;
    private javax.swing.JMenuItem EmpleadoRegistrar;
    private javax.swing.JMenuItem InvantarioActualizar;
    private javax.swing.JMenuItem InvantarioConsultar;
    private javax.swing.JMenu InvantarioReporte;
    private javax.swing.JMenu ModuloCliente;
    private javax.swing.JMenu ModuloEmpleado;
    private javax.swing.JMenu ModuloInventario;
    private javax.swing.JMenu ModuloProducto;
    private javax.swing.JMenu ModuloVentas;
    private javax.swing.JMenuItem ProductoConsultar;
    private javax.swing.JMenuItem ProductoEliminar;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}