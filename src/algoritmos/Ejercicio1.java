/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
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
        cmdCalcular = new javax.swing.JButton();
        txtResPersonaUno = new javax.swing.JTextField();
        txtResPersonaDos = new javax.swing.JTextField();
        txtResPersonaTres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmdBorrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        xx = new javax.swing.JLabel();
        vv = new javax.swing.JLabel();
        nn = new javax.swing.JLabel();
        txtPersonaUno = new javax.swing.JTextField();
        txtPersonaDos = new javax.swing.JTextField();
        txtPersonaTres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtResPersonaUno.setEditable(false);
        jPanel1.add(txtResPersonaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        txtResPersonaDos.setEditable(false);
        jPanel1.add(txtResPersonaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 70, -1));

        txtResPersonaTres.setEditable(false);
        jPanel1.add(txtResPersonaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PORCENTAJE DE EMPRESA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 210, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Persona Uno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Persona Dos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 70, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Persona Tres");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, 30));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel8.setText("Cantidad Invertida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, 30));

        txtCantidad.setEditable(false);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, -1));

        xx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xx.setText("Persona Uno");
        jPanel1.add(xx, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 44, 80, 30));

        vv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vv.setText("Persona Dos");
        jPanel1.add(vv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, 30));

        nn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nn.setText("Persona Tres");
        jPanel1.add(nn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 34, 90, 40));

        txtPersonaUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, -1));

        txtPersonaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, -1));

        txtPersonaTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaTresKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String cant,res1,res2,res3;
        double p1,p2,p3,res=0,op1=0,op2=0,op3=0; 
        
        if(txtPersonaUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite Valor de la Persona Uno", "Error",JOptionPane.ERROR_MESSAGE);
            txtPersonaUno.requestFocusInWindow();
        }
        else if(txtPersonaDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite Valor de la Persona Dos", "Error", JOptionPane.ERROR_MESSAGE);
            txtPersonaDos.requestFocusInWindow();
        
        }else if(txtPersonaTres.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite Valor de la Persona Tres","ERROR",JOptionPane.ERROR_MESSAGE);
            txtPersonaTres.requestFocusInWindow();
        }
        
      
        else{  
        p1=Double.parseDouble(txtPersonaUno.getText());
        p2=Double.parseDouble(txtPersonaDos.getText());
        p3=Double.parseDouble(txtPersonaTres.getText());
        
            
        if(p2==p1){JOptionPane.showMessageDialog(this, "Digite Un Valor Diferente En La Casilla", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtPersonaUno.requestFocusInWindow();
            }
            else if(p3==p2){JOptionPane.showMessageDialog(this, "Digite Un Valor Diferente En la Casilla ", "ERROR",JOptionPane.ERROR_MESSAGE);
            txtPersonaDos.requestFocusInWindow();
                
            }
            else if(p1==p3){JOptionPane.showMessageDialog(this, "Digite Un Valor Diferente En La Casilla", "ERROR",JOptionPane.ERROR_MESSAGE);
            txtPersonaTres.requestFocusInWindow();
                
            }else{
                
                
            }
        res=p1+p2+p3;
        op1=(p1*100)/res;
        op2=(p2*100)/res;
        op3=(p3*100)/res;
        
                }
        
        cant=String.valueOf(res);
        txtCantidad.setText(cant);
        res1=String.valueOf(op1+"%");
        txtResPersonaUno.setText(res1);
        res2=String.valueOf(op2+"%");
        txtResPersonaDos.setText(res2);
        res3=String.valueOf(op3+"%");
        txtResPersonaTres.setText(res3);
        
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
      txtPersonaUno.setText("");
      txtPersonaDos.setText("");
      txtPersonaTres.setText("");
      txtCantidad.setText("");
      txtResPersonaUno.setText("");
      txtResPersonaDos.setText("");
      txtResPersonaTres.setText("");
      
      txtPersonaUno.requestFocusInWindow();
       
       
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
      
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPersonaUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaUnoKeyTyped
       char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); }
    }//GEN-LAST:event_txtPersonaUnoKeyTyped

    private void txtPersonaDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaDosKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); }
    }//GEN-LAST:event_txtPersonaDosKeyTyped

    private void txtPersonaTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaTresKeyTyped
       char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); }
    }//GEN-LAST:event_txtPersonaTresKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nn;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPersonaDos;
    private javax.swing.JTextField txtPersonaTres;
    private javax.swing.JTextField txtPersonaUno;
    private javax.swing.JTextField txtResPersonaDos;
    private javax.swing.JTextField txtResPersonaTres;
    private javax.swing.JTextField txtResPersonaUno;
    private javax.swing.JLabel vv;
    private javax.swing.JLabel xx;
    // End of variables declaration//GEN-END:variables
}
