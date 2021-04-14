/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Administrador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClassCollector;
import modelos.Chofer;
import nodos.Nodo;

public class GestionarChofer extends javax.swing.JFrame {

    ClassCollector principal;
    int contador;
    int dniEliminar = 0;
    String asignacionEliminar = "";

    public GestionarChofer(ClassCollector A) {
        initComponents();
        principal = A;

        mostrar();
        this.setLocationRelativeTo(null);
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public void mostrar() {
        contador = 0;
        limpiar();
        for (Chofer b : principal.listaChoferes) {
            TablaChofer.getModel().setValueAt(b.getDniChofer(), contador, 0);
            TablaChofer.getModel().setValueAt(b.getNombre(), contador, 1);
            TablaChofer.getModel().setValueAt(b.isEstado() ? "Sin asignar" : "Asignado", contador, 2);   //
            contador++;
        }
    }

    private void limpiar() {

        for (int i = 0; i < 30; i++) {

            TablaChofer.getModel().setValueAt(" ", i, 0);
            TablaChofer.getModel().setValueAt(" ", i, 1);
            TablaChofer.getModel().setValueAt(" ", i, 2);   //

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CNombreChofer = new javax.swing.JTextField();
        CDniChofer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaChofer = new javax.swing.JTable();
        BRegistrar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GESTOR DE CHOFERES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(CNombreChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, -1));
        getContentPane().add(CDniChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, -1));

        TablaChofer.setModel(new javax.swing.table.DefaultTableModel(
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
                "DNI", "NOMBRE", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaChofer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaChoferMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaChofer);
        if (TablaChofer.getColumnModel().getColumnCount() > 0) {
            TablaChofer.getColumnModel().getColumn(0).setPreferredWidth(100);
            TablaChofer.getColumnModel().getColumn(1).setPreferredWidth(250);
            TablaChofer.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 100));

        BRegistrar.setText("Registar");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        BAtras.setText("Atras");
        BAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        // TODO add your handling code here:

        if (CDniChofer.getText().isEmpty() || CNombreChofer.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR EN LAS CASILLA DNI Y NOMBRE", "Casilla de DNI y NOMBRE vacia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (isNumeric(CDniChofer.getText())) {
                Chofer C = new Chofer(Integer.parseInt(CDniChofer.getText()), CNombreChofer.getText());

                principal.listaChoferes.insertarFinal(C);
                limpiar();
                mostrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR EN LA CASILLA DNI", "ESTA INTRODUCIENDO LETRAS", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_BRegistrarActionPerformed

    private void BAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtrasActionPerformed
        // TODO add your handling code here:

        PanelDeControl UU = new PanelDeControl(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_BAtrasActionPerformed

    private void TablaChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaChoferMouseClicked
        // TODO add your handling code here:

        int fila = TablaChofer.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TablaChofer.getModel();

        if (fila > contador - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            dniEliminar = (int) modelo.getValueAt(fila, 0);
            asignacionEliminar = (String) modelo.getValueAt(fila, 2);
        }
    }//GEN-LAST:event_TablaChoferMouseClicked

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // TODO add your handling code here:
        if (asignacionEliminar.equals("Asignado")) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE ELMINAR", "El chofer esta asignado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean encontro = false;
            Chofer temp = null;

            for (Chofer C : principal.listaChoferes) {
                if (C.getDniChofer() == dniEliminar) {
                    temp = C;
                    encontro = true;
                }
            }
            if (!encontro) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "No se encontro nada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                principal.listaChoferes.eliminar(temp);
                principal.listaChoferes.mostrarLista();
                dniEliminar = 0;
                limpiar();
                mostrar();

            }
        }


    }//GEN-LAST:event_BEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAtras;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JTextField CDniChofer;
    private javax.swing.JTextField CNombreChofer;
    private javax.swing.JTable TablaChofer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
