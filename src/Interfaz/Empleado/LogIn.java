package Interfaz.Empleado;

import Interfaz.Administrador.PanelDeControl;
import Interfaz.Administrador.GestionarHorario;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.ClassCollector;
import modelos.*;

public class LogIn extends javax.swing.JFrame {

    ClassCollector A;

    public LogIn(ClassCollector B) {
        initComponents();
        A = B;
        CCampoUsuario.setText("");
        CCampoAdministrador.setText("");
        this.setLocationRelativeTo(null);
        this.setTitle("Iniciar sesion");       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CCampoUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CCampoAdministrador = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyecto X");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 327, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 14, -1, -1));
        jPanel1.add(CCampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, 179, -1));

        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        CCampoAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCampoAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(CCampoAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 37, 179, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 210, 300, 120));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 63, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre_usuario = CCampoUsuario.getText();
        String pass = CCampoAdministrador.getText();
        boolean loggeado = false;
        for (Usuario u : A.listaUsuarios) {
            if (nombre_usuario.equalsIgnoreCase(u.getUsername()) && pass.equalsIgnoreCase(u.getPassword()) && !loggeado) {
                loggeado = true;
                if (u.isManagent()) {
                    JOptionPane.showMessageDialog(null, "Usuario administrador "+CCampoUsuario.getText());
                    PanelDeControl h = new PanelDeControl(A);
                    this.setVisible(false);
                    h.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario empleado "+CCampoUsuario.getText());
                    Horarios h = new Horarios(A);
                    this.setVisible(false);
                    h.setVisible(true);
                }
            }
        }
        if (loggeado == false) {
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO");
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CCampoAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCampoAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCampoAdministradorActionPerformed

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CCampoAdministrador;
    private javax.swing.JTextField CCampoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
