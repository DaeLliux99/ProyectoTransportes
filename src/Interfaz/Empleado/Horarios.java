package Interfaz.Empleado;

import com.sun.java.accessibility.util.GUIInitializedListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Cardenas
 */
public class Horarios extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BuscarProveedores
     */
    public Horarios() {

        initComponents();
        this.setLocationRelativeTo(null);

        MostrarHorarios();
    }

    public void MostrarHorarios() {
        boolean validar=true;
        if (validar) {//se usara para mostrar mensaje en panatalla de que no hay horarios disponibles

            for(int i = 0;i<=5;i++) {
                String text = "esto es temporal";
                //String nom_ciudad = GestorPrincipal.getGestorProveedor().getNombreCiudad(proveedor.getCodigo_ciudad());
                //jTable1.getModel().setValueAt(proveedor.getCodigo_proveedor(), i, 0);
                jTable1.getModel().setValueAt(text, i, 0);
                jTable1.getModel().setValueAt(text, i, 1);
                jTable1.getModel().setValueAt(text, i, 2);
                jTable1.getModel().setValueAt(text, i, 3);
                jTable1.getModel().setValueAt(text, i, 4);
            }
        } else {

            JOptionPane.showMessageDialog(this, "No existen horarios disponibles.", "HORARIOS", JOptionPane.ERROR_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regcliente = new javax.swing.JButton();
        cancelcli = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dniBorrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Horarios");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 670, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Salida", "Llegada", "Bus", "Ruta", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 673, 210));

        regcliente.setText("Registrar pasajero");
        regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclienteActionPerformed(evt);
            }
        });
        getContentPane().add(regcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, -1));

        cancelcli.setText("Cancelar");
        cancelcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelcliActionPerformed(evt);
            }
        });
        getContentPane().add(cancelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel3PropertyChange(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Rura");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        dniBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(dniBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 430, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 670, 70));
        jPanel3.getAccessibleContext().setAccessibleName("Buscar destino");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclienteActionPerformed

    }//GEN-LAST:event_regclienteActionPerformed

    private void cancelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcliActionPerformed

    }//GEN-LAST:event_cancelcliActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

    }//GEN-LAST:event_salirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JOptionPane.showMessageDialog(null, "No se puede realizar la busqueda!", "NO HAY REGISTROS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dniBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniBorrarActionPerformed

    private void jPanel3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelcli;
    private javax.swing.JTextField dniBorrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regcliente;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
