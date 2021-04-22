
package Interfaz.Administrador;

import Interfaz.Empleado.LogIn;
import javax.swing.JOptionPane;
import main.ClassCollector;


public class PanelDeControl extends javax.swing.JFrame {

    ClassCollector principal;

    public PanelDeControl(ClassCollector A) {
        initComponents();
        principal = A;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Panel de control");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GestionarChofer = new javax.swing.JButton();
        GestionarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GestionarHorario = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        GestionarBus = new javax.swing.JButton();
        GMostrarRuta = new javax.swing.JButton();
        GestionarRuta = new javax.swing.JButton();
        botonGuardarFichero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GestionarChofer.setText("Gestionar Chofer");
        GestionarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarChoferActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, -1));

        GestionarUsuario.setText("Gestionar Usuario");
        GestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Panel de control");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        GestionarHorario.setText("Gestionar Horario");
        GestionarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, -1));

        jButton4.setText("Salir sesion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        GestionarBus.setText("Gestionar Bus");
        GestionarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarBusActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        GMostrarRuta.setText("Mostrar ruta");
        GMostrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMostrarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(GMostrarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        GestionarRuta.setText("Gestionar Ruta");
        GestionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarRutaActionPerformed(evt);
            }
        });
        jPanel1.add(GestionarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        botonGuardarFichero.setText("Guardar Cambios");
        botonGuardarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarFicheroActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarFichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarRutaActionPerformed
        // TODO add your handling code here:
        GestionarRuta UU = new GestionarRuta(principal);
        this.setVisible(false);
        UU.setVisible(true);

    }//GEN-LAST:event_GestionarRutaActionPerformed

    private void GestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarUsuarioActionPerformed
        // TODO add your handling code here:      
        GestionarUsuario UU = new GestionarUsuario(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_GestionarUsuarioActionPerformed

    private void GestionarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarChoferActionPerformed
        // TODO add your handling code here:
        GestionarChofer UU = new GestionarChofer(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_GestionarChoferActionPerformed

    private void GestionarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarBusActionPerformed
        // TODO add your handling code here:
        GestionarBus UU = new GestionarBus(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_GestionarBusActionPerformed

    private void GMostrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMostrarRutaActionPerformed
        // TODO add your handling code here:
        MostrarRuta UU = new MostrarRuta(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_GMostrarRutaActionPerformed

    private void GestionarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarHorarioActionPerformed
        // TODO add your handling code here:
        GestionarHorario UU = new GestionarHorario(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_GestionarHorarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LogIn a = new LogIn(principal);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonGuardarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarFicheroActionPerformed
        // TODO add your handling code here:
        principal.guardarFichero();
        JOptionPane.showMessageDialog(null, "Registrado!", "Guardado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonGuardarFicheroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GMostrarRuta;
    private javax.swing.JButton GestionarBus;
    private javax.swing.JButton GestionarChofer;
    private javax.swing.JButton GestionarHorario;
    private javax.swing.JButton GestionarRuta;
    private javax.swing.JButton botonGuardarFichero;
    private javax.swing.JButton GestionarUsuario;

    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
