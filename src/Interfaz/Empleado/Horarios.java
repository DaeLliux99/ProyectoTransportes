package Interfaz.Empleado;

import com.sun.java.accessibility.util.GUIInitializedListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import modelos.*;
import nodos.*;
import estructuras.*;
import javax.swing.table.DefaultTableModel;

import main.ClassCollector;

public class Horarios extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BuscarProveedores
     */
    ClassCollector Principal;
    String rutaA;
    Ruta ruta1;
    Lista<Ruta> ListRuta = new Lista<>();

    String salidaTXT;
    String llegadaTXT;
    int bus;

    public Horarios(ClassCollector A) {

        initComponents();
        Principal = A;
        this.setLocationRelativeTo(null);
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
        Buscar_Ruta_Boton = new javax.swing.JButton();
        Casilla_Buscar_Ruta = new javax.swing.JTextField();
        mostrarPasajero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Horarios");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 670, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Salida", "Llegada", "Bus", "Ruta", "Precio", "Asientos Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 670, 210));

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
        getContentPane().add(cancelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel3PropertyChange(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Ciudad");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        Buscar_Ruta_Boton.setText("Buscar");
        Buscar_Ruta_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_Ruta_BotonActionPerformed(evt);
            }
        });
        jPanel3.add(Buscar_Ruta_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        Casilla_Buscar_Ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_Buscar_RutaActionPerformed(evt);
            }
        });
        jPanel3.add(Casilla_Buscar_Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 430, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 670, 70));
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        mostrarPasajero.setText("Mostrar Pasajeros");
        mostrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclienteActionPerformed
        if (salidaTXT != null && llegadaTXT != null) {

            RegistroV2 r = new RegistroV2(salidaTXT, llegadaTXT, bus, Principal);
            this.setVisible(false);
            r.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado nada", "No se puede realizaar registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_regclienteActionPerformed

    private void cancelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcliActionPerformed

    }//GEN-LAST:event_cancelcliActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void Buscar_Ruta_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_Ruta_BotonActionPerformed

        for (int i = 0; i <= 10; i++) {
            jTable1.getModel().setValueAt("", i, 0);
            jTable1.getModel().setValueAt("", i, 1);
            jTable1.getModel().setValueAt("", i, 2);   
            jTable1.getModel().setValueAt("", i, 3);
            jTable1.getModel().setValueAt("", i, 4);
            jTable1.getModel().setValueAt("", i, 5);
        }

        
        Nodo<Bus> temp = Principal.listaBuses.ObetenerPrimerNodo();

        int i = 0;
        while (temp != null) {
            if (temp.valor.getRuta().Busqueda_Ciudad(Casilla_Buscar_Ruta.getText()) != null) {
                jTable1.getModel().setValueAt(temp.valor.getRuta().obtenerPrimerCiudad(), i, 0);
                jTable1.getModel().setValueAt(temp.valor.getRuta().obtenerUltimaCiudad(), i, 1);
                jTable1.getModel().setValueAt(temp.valor.getMatricula(), i, 2);   //
                jTable1.getModel().setValueAt(temp.valor.getRuta().mostrarCiudadesRuta(), i, 3);
                jTable1.getModel().setValueAt(temp.valor.getRuta().getPrecio(), i, 4);

                jTable1.getModel().setValueAt(temp.valor.getNumeroAsientos()-temp.valor.getOcupado(), i, 5);            
                i++;

            }
            temp = temp.siguiente;
        }
        
        //JOptionPane.showMessageDialog(null, "No se puede realizar la busqueda!", "NO HAY REGISTROS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Buscar_Ruta_BotonActionPerformed

    private void Casilla_Buscar_RutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_Buscar_RutaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Casilla_Buscar_RutaActionPerformed

    private void jPanel3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        salidaTXT = (String) modelo.getValueAt(fila, 0);
        llegadaTXT = (String) Casilla_Buscar_Ruta.getText();
        bus = (int) modelo.getValueAt(fila, 2);
        System.out.println(bus);
        JOptionPane.showMessageDialog(null, "Salida: " + salidaTXT + " llegada: " + llegadaTXT, "INFORMACION DE SELECCION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jTable1MouseClicked

    private void mostrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPasajeroActionPerformed
        // TODO add your handling code here:
        MostrarPasajero a = new MostrarPasajero(Principal);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarPasajeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_Ruta_Boton;
    private javax.swing.JTextField Casilla_Buscar_Ruta;
    private javax.swing.JButton cancelcli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mostrarPasajero;
    private javax.swing.JButton regcliente;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
