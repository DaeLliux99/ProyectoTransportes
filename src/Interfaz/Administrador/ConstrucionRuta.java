/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Administrador;

import main.ClassCollector;

/**
 *
 * @author LEONARDO
 */
public class ConstrucionRuta extends javax.swing.JFrame {

    ClassCollector principal;
    
    public ConstrucionRuta(ClassCollector A) {
        initComponents();
        principal = A;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CCiudasComboBox = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CCiudasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CCiudasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCiudasComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CCiudasComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 490, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel1.setText("Ciudad seleccionada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel2.setText("Ruta de ciudades");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton1.setText("Agregar ciudad");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jButton2.setText("Eliminar ciudad");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel3.setText("Eliminar ciudades de la ruta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jButton3.setText("Registrar ruta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jButton4.setText("Cancelar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CCiudasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCiudasComboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_CCiudasComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConstrucionRuta().setVisible(true);
            }
        });
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CCiudasComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
