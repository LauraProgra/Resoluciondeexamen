/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.examen.app;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class FrmFormulas extends javax.swing.JFrame {
    double respuestaSistema;
    int contadorExitos=0;
    int contadorError=0;
    /**
     * Creates new form FrmFormulas
     */
    public FrmFormulas() {
        initComponents();
        crearFormula();
    }
    
    public void probarRandom(){
        int numero=new Random().nextInt(10);
        System.out.println(" "+numero);
    }
    
    public double getNumeroAleatorio(){
        int numero=new Random().nextInt(100);
        return Double.parseDouble(numero+"");        
    }
    
    public int getNumeroSignoAleatorio(){
        return new Random().nextInt(4);
    }

    public void crearFormula(){
        String formula="";
        
        double a=getNumeroAleatorio()*100;
        double b=getNumeroAleatorio()*100;
        int signo=getNumeroSignoAleatorio();
        
        if (signo==0) {
            formula=a+" + "+b;
            respuestaSistema=a+b;            
        }
        if (signo==1) {
            formula=a+" - "+b;
            respuestaSistema=a-b;   
        }
        if (signo==2) {
            formula=a+" * "+b;
            respuestaSistema=a*b;   
        }
        if (signo==3) {
            formula=a+" / "+b;
            respuestaSistema=a/b;   
        }
        
        lblFormula.setText(formula);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormula = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnContestar = new javax.swing.JButton();
        lblExito = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFormula.setText("formula");

        btnContestar.setText("Contestar");
        btnContestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContestarActionPerformed(evt);
            }
        });

        lblExito.setText("Exito");

        lblError.setText("Error");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblFormula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblExito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalizar)
                    .addComponent(btnContestar))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblFormula)
                .addGap(18, 18, 18)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContestar)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExito)
                    .addComponent(lblError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContestarActionPerformed
        // TODO add your handling code here:
        double respuestaUsuario=Double.parseDouble(txtRespuesta.getText()) ;
        
        if (respuestaUsuario==respuestaSistema) {
            contadorExitos++;
        }else{
            contadorError=contadorError+1;
        }
        
        lblError.setText(contadorError+"");
        lblExito.setText(contadorExitos+"");    
        
        crearFormula();
    }//GEN-LAST:event_btnContestarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        if (contadorError>contadorExitos) {
            String mensaje="tienes mucho que estudiar "+juegoController.getNombre();
            JOptionPane.showMessageDialog(this, mensaje);
        }else{
            String mensaje="felicidades "+juegoController.getNombre()+" eres un matematico ";
            JOptionPane.showMessageDialog(this, mensaje);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFormulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFormulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContestar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblExito;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
