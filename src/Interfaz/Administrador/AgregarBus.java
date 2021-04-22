
package Interfaz.Administrador;

import main.ClassCollector;
import modelos.*;
import estructuras.*;
import javax.swing.JOptionPane;

public class AgregarBus extends javax.swing.JFrame {

    ClassCollector principal;
    String matricula;
    int numAsiento;
    int pesoMax;

    public AgregarBus(ClassCollector a) {
        initComponents();
        principal = a;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registro de buses");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cmatricula = new javax.swing.JTextField();
        Casiento = new javax.swing.JTextField();
        Cpeso = new javax.swing.JTextField();
        BREGISTRAR = new javax.swing.JButton();
        BATRAS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mátricula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("# Asientos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Peso Máximos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        Cmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(Cmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, -1));
        jPanel1.add(Casiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 250, -1));
        jPanel1.add(Cpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, -1));

        BREGISTRAR.setText("REGISTRAR");
        BREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BREGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(BREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        BATRAS.setText("ATRAS");
        BATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BATRASActionPerformed(evt);
            }
        });
        jPanel1.add(BATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("AGREGAR BUS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmatriculaActionPerformed

    private void BREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BREGISTRARActionPerformed
        // TODO add your handling code here:
        if (Cmatricula.getText().trim().isEmpty() || Casiento.getText().trim().isEmpty() || Cpeso.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CASILLA", "FALTA RELLENAR CASILLAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            matricula = Cmatricula.getText();
            numAsiento = Integer.parseInt(Casiento.getText());
            pesoMax = Integer.parseInt(Cpeso.getText());          
            Bus nuevoBus = new Bus(matricula, principal.listaBuses.idControlador + 1, numAsiento, pesoMax);
            principal.listaBuses.insertarFinal(nuevoBus);
            JOptionPane.showMessageDialog(null, "REGISTRADO", "BUS REGISTRADO CON EXITO", JOptionPane.INFORMATION_MESSAGE);
            Cmatricula.setText("");
            Casiento.setText("");
            Cpeso.setText("");
        }
    }//GEN-LAST:event_BREGISTRARActionPerformed

    private void BATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BATRASActionPerformed
        // TODO add your handling code here:
        GestionarBus UU = new GestionarBus(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_BATRASActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BATRAS;
    private javax.swing.JButton BREGISTRAR;
    private javax.swing.JTextField Casiento;
    private javax.swing.JTextField Cmatricula;
    private javax.swing.JTextField Cpeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
