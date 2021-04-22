
package Interfaz.Empleado;

import estructuras.Cola;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClassCollector;
import modelos.Bus;
import modelos.Pasajero;
import nodos.Nodo;


public class MostrarPasajero extends javax.swing.JFrame {

    ClassCollector principal;
    int documentoPersona;
    Bus busEncontrado;
    int contador;

    public MostrarPasajero(ClassCollector a) {
        initComponents();
        principal = a;        
        llenar();
        mostrar();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Pasajeros registrados");
    }

    
    private void llenar() {
        Nodo<Bus> b = principal.listaBuses.ObetenerPrimerNodo();
        while (b != null) {
            buses.addItem(b.valor.getMatricula());
            b = b.siguiente;
        }
    }

    public final Bus encontrarBus() {

        for (Bus B : principal.listaBuses) {
            if (B.getIdBus() == (int) buses.getSelectedIndex() + 1) {
                return B;
            }
            System.out.println(B.getIdBus());

        }
        return null;      
    }

    private void mostrar() {
        busEncontrado = encontrarBus();
        limpiar();

        if (buses.getSelectedItem() != null) {
            contador = 0;
            Cola<Pasajero> a = busEncontrado.getColaPasajero();
            for (Pasajero b : a) {
                jTable1.getModel().setValueAt(b.getNombre(), contador, 0);
                jTable1.getModel().setValueAt(b.getAsiento(), contador, 1);
                jTable1.getModel().setValueAt(b.getIdPasajero(), contador, 2);   //
                contador++;
            }
        }
    }

    private void limpiar() {
        for (int i = 0; i < 30; i++) {
            jTable1.getModel().setValueAt(" ", i, 0);
            jTable1.getModel().setValueAt(" ", i, 1);
            jTable1.getModel().setValueAt(" ", i, 2);   //
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buses = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busesActionPerformed(evt);
            }
        });

        jLabel1.setText("ID DE BUSES DISPONIBLES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE Y APELLIDO", "ASIENTO", "DOCUMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(atras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(atras)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busesActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_busesActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        Horarios a = new Horarios(principal);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        if (fila > contador - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            documentoPersona = (int) modelo.getValueAt(fila, 2);
            ticket t = new ticket(documentoPersona, encontrarBus(), principal);
            t.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JComboBox buses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
