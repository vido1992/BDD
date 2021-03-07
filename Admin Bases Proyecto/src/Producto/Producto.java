/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;



import Inicio.Validar;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author David
 */
public class Producto extends javax.swing.JInternalFrame {

    String codigo, modelo, marca, gama, sumerguibleSi, sumerguibleNo, sistemaSi, sistemaNo;
    float precioImportacion, precioPublico;
    //RelojJpaController Creloj = new RelojJpaController();
    //Reloj r = new Reloj();
     Validar validar = new Validar();
    /**
     * Creates new form Reloj
     */

    // C_Reloj RE = new C_Reloj();

    Validar val = new Validar();

    public Producto() {
        initComponents();
        this.setTitle("SiGIn-GIZPIRIT-RELOJ");
        //obtenerDatos();
    }

    public void obtenerDatos() {

        //this.codigo=jTextFielCodigo.getText().toString();
      /*  this.modelo = txtDescripcionProducto.getText().toString();
        this.marca = txtPrecioUnitario.getText().toString();
        this.gama = boxGamaReloj.getSelectedItem().toString();
        this.sumerguibleSi = rbSumergibleSI.getText().toString();
        this.sumerguibleNo = rbSumergibleNo.getText().toString();
        this.sistemaSi = rbSASI.getText().toString();
        this.sistemaNo = rbSANO.getText().toString();
        this.precioImportacion = Float.parseFloat(txtPrecioInicialReloj.getText().toString());
        this.precioPublico = Float.parseFloat(txtPrecioPublicoReloj.getText().toString());
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBotonRegistrarInv1 = new javax.swing.JButton();
        jButtonRegresar3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioInicialReloj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioPublicoReloj = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        btnAyudaNombreProducto = new javax.swing.JButton();
        btnAyudaDescripcionP = new javax.swing.JButton();
        btnAyudaCantidadP = new javax.swing.JButton();
        btnAyudaFechaVP = new javax.swing.JButton();
        btnAyudaPrecioUP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);

        jBotonRegistrarInv1.setText("Registrar");
        jBotonRegistrarInv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegistrarInv1ActionPerformed(evt);
            }
        });

        jButtonRegresar3.setText("Regresar");
        jButtonRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar3ActionPerformed(evt);
            }
        });

        jLabel31.setText("Nombre:");

        jLabel32.setText("Descripción:");

        jLabel39.setText("Fecha Vencimiento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("REGISTRO PRODUCTO");

        jLabel4.setText("Precio Unitario (USD):");

        jLabel5.setText("Cantidad Productos:");

        btnAyudaNombreProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/2.png"))); // NOI18N
        btnAyudaNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaNombreProductoActionPerformed(evt);
            }
        });

        btnAyudaDescripcionP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/2.png"))); // NOI18N
        btnAyudaDescripcionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaDescripcionPActionPerformed(evt);
            }
        });

        btnAyudaCantidadP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/2.png"))); // NOI18N
        btnAyudaCantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaCantidadPActionPerformed(evt);
            }
        });

        btnAyudaFechaVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/2.png"))); // NOI18N
        btnAyudaFechaVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaFechaVPActionPerformed(evt);
            }
        });

        btnAyudaPrecioUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/2.png"))); // NOI18N
        btnAyudaPrecioUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaPrecioUPActionPerformed(evt);
            }
        });

        jLabel1.setText("Observacion Lote:");

        jLabel2.setText("Descripción Sector:");

        jLabel3.setText("Stock Sector");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("LOTE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("SECTOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyudaNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAyudaDescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(110, 110, 110)
                                .addComponent(txtPrecioInicialReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotonRegistrarInv1)
                                        .addGap(110, 110, 110)
                                        .addComponent(jButtonRegresar3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPrecioPublicoReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAyudaCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyudaFechaVP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyudaPrecioUP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyudaNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAyudaDescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyudaPrecioUP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtPrecioInicialReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioPublicoReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyudaCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(btnAyudaFechaVP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegistrarInv1)
                    .addComponent(jButtonRegresar3))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonRegresar3ActionPerformed

    private void jBotonRegistrarInv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegistrarInv1ActionPerformed
      /*  int i=0;
        if (this.txtCodigoReloj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO CODIGO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (txtModeloReloj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MODELO VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtMarcaReloj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO MARCA VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioInicialReloj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO INICIAL VACIO", JOptionPane.WARNING_MESSAGE);
        } else if (this.txtPrecioPublicoReloj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio", "CAMPO PRECIO AL PÚBLICO VACIO", JOptionPane.WARNING_MESSAGE);
        } else {
                //RJ-Reloj, AU-Audifonos, CM-Cámara, CA-Cargador, CB-Cable, IN-Interruptor, TO-Tomacorriente, SE-Sensor, CZ-ControladorVoz, La-Llaves Automáticas
            if (validar.validarCodigoTodos(this.txtCodigoReloj.getText().toString(),"RJ")) {
                //{}
                i++;
            }
            if (validar.validarModelosTodos(this.txtModeloReloj.getText().toString())) {
                i++;
               
            }
            if (validar.validarMarcaTodos(this.txtMarcaReloj.getText().toString())) {
                i++;
            
            }

            if (validar.validarSueldo(this.txtPrecioInicialReloj.getText().toString())) {
                i++;
               
            }
            if (validar.validarSueldo(this.txtPrecioPublicoReloj.getText().toString())) {
                i++;
            
            }
            if(this.boxGamaReloj.getSelectedItem().toString()!="Selección")
            {i++;
            System.out.println( "buen ingreso");  
            
            }else{
            JOptionPane.showMessageDialog(null,  "Gama equivocada");
            }
           if(this.rbSANO.isSelected()==true)
            {i++;
            System.out.println( "buen ingreso seleccion interna");  
                          
            }else if (this.rbSASI.isSelected()==true ){
                i++;
                System.out.println( "buen ingreso seleccion externa");
            
            }else {
            JOptionPane.showMessageDialog(null,  "Sistema Android no es un valor booleano");
            }
           
           if(this.rbSumergibleNo.isSelected()==true)
            {i++;
            System.out.println( "buen ingreso seleccion interna");  
                          
            }else if (this.rbSumergibleSI.isSelected()==true ){
                i++;
                System.out.println( "buen ingreso seleccion externa");
            
            }else {
            JOptionPane.showMessageDialog(null,  "Sumergible no tiene un valor booleano");
            }
           
           
           
           
           
 
            
             if (i==8)
            {
                System.out.println( "REGISTRO");  
                    try {
                   r.setCodigo(txtCodigoReloj.getText());
            r.setModelo(txtModeloReloj.getText());
            r.setMarca(txtMarcaReloj.getText());
            r.setGama((String) boxGamaReloj.getSelectedItem());
            if(rbSumergibleSI.isSelected()){
                r.setSumergible(rbSumergibleSI.getText().toString());
            }else{
                r.setSumergible(rbSumergibleNo.getText().toString());
            }
            if(rbSASI.isSelected()){
                r.setSistemaandroid(rbSASI.getText().toString());
            }else{
                r.setSistemaandroid(rbSANO.getText().toString());
            }
            r.setPrecioimportacion(txtPrecioInicialReloj.getText().toString());
            r.setPreciopublico(txtPrecioPublicoReloj.getText().toString());
            r.setCantidad("0");
            r.setEstado("Activo");
            r.setFechaimportacion("");
            Creloj.create(r);
            
                    JOptionPane.showMessageDialog(null,  "Reloj Registrado");
                } catch (Exception ex) {
                    Logger.getLogger(Reloj_R.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            } 
        }

*/

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jBotonRegistrarInv1ActionPerformed

    private void btnAyudaNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaNombreProductoActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar RJ seguido de 3 números ");
    }//GEN-LAST:event_btnAyudaNombreProductoActionPerformed

    private void btnAyudaDescripcionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaDescripcionPActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaDescripcionPActionPerformed

    private void btnAyudaCantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaCantidadPActionPerformed
        JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad en el formato. Eje: 200.00");
    }//GEN-LAST:event_btnAyudaCantidadPActionPerformed

    private void btnAyudaFechaVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaFechaVPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaFechaVPActionPerformed

    private void btnAyudaPrecioUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaPrecioUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaPrecioUPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaCantidadP;
    private javax.swing.JButton btnAyudaDescripcionP;
    private javax.swing.JButton btnAyudaFechaVP;
    private javax.swing.JButton btnAyudaNombreProducto;
    private javax.swing.JButton btnAyudaPrecioUP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBotonRegistrarInv1;
    private javax.swing.JButton jButtonRegresar3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioInicialReloj;
    private javax.swing.JTextField txtPrecioPublicoReloj;
    // End of variables declaration//GEN-END:variables
}
