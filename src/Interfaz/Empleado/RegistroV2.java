package Interfaz.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author T1000
 */
public class RegistroV2 extends javax.swing.JFrame {


    public RegistroV2() {

        initComponents();
        setLocationRelativeTo(null);

    }
    public void limpiar() {
        Cdni.setText("");
        Cnombre.setText("");
        Cfecha.setText("");
        //combo_tipodoc.setSelectedItem("Seleccionar Tipo Documento");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regcliente = new javax.swing.JButton();
        cancelcli = new javax.swing.JButton();
        salirclijButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Cfecha1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regcliente.setText("Registrar");
        regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclienteActionPerformed(evt);
            }
        });
        getContentPane().add(regcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 358, 92, -1));

        cancelcli.setText("Cancelar");
        cancelcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelcliActionPerformed(evt);
            }
        });
        getContentPane().add(cancelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 358, -1, -1));

        salirclijButton3.setText("Salir");
        salirclijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(salirclijButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 368, 0, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRAR PERSONAS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 500, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 358, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdniActionPerformed(evt);
            }
        });
        jPanel1.add(Cdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 142, -1));

        jLabel1.setText("Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setText("Nombres y apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 28, -1, -1));

        Cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnombreActionPerformed(evt);
            }
        });
        jPanel1.add(Cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 250, -1));

        jLabel6.setText("Destino");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        Cfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfechaActionPerformed(evt);
            }
        });
        jPanel1.add(Cfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 250, -1));

        jLabel7.setText("Destino");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Cfecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cfecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 500, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclienteActionPerformed

    }//GEN-LAST:event_regclienteActionPerformed

    private void cancelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcliActionPerformed

    }//GEN-LAST:event_cancelcliActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();

    }//GEN-LAST:event_salirclijButton3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

    }//GEN-LAST:event_salirActionPerformed

    private void CdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdniActionPerformed

    }//GEN-LAST:event_CdniActionPerformed

    private void CnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnombreActionPerformed

    private void CfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfechaActionPerformed

    private void Cfecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cfecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cfecha1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cdni;
    private javax.swing.JTextField Cfecha;
    private javax.swing.JTextField Cfecha1;
    private javax.swing.JTextField Cnombre;
    private javax.swing.JButton cancelcli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regcliente;
    private javax.swing.JButton salir;
    private javax.swing.JButton salirclijButton3;
    // End of variables declaration//GEN-END:variables
}
